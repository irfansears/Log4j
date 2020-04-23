package com.qa.tests;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.LoggerUtil;

public class ContactsPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	public ContactsPageTest(){
		super();
		log=Logger.getLogger(ContactsPageTest.class.getName());
	}
	
	@Parameters({ "log_dir" })	
	@BeforeMethod
	public void setUp(Method m, String logs){
		methodName=m.getName();
		LoggerUtil.contentLogger(logs, getClass().getSimpleName(), methodName,log);
		initialization();
		loginPage = new LoginPage();	
	}
	
	
	@Test(priority=1)
	public void titleTest(){
		
		String title = loginPage.validateLoginPageTitle();
//		log.info(methodName +" is completed successfully");
	}
	
	
	@Test(priority=2)
	public void logoTest(){
		boolean flag = loginPage.validateImage();
//		Assert.assertTrue(flag);
//		log.info(methodName +" is completed successfully");
	}
	
	@Test(priority=3)
	public void loginTest(){
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = loginPage.login("username","password");
//		log.info(methodName +" is completed successfully");
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		log.info("closing the  browser...");
//		driver.quit();
		log.info("browser is terminated successfully");
		log.info(methodName +" is completed successfully");
	}
	
	
}
