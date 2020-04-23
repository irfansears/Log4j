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
import com.qa.utils.TestUtil;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public LoginPageTest(){
		super();
		log=Logger.getLogger(LoginPageTest.class.getName());
	}
	
	@Parameters({ "log_dir" })	
	@BeforeMethod
	public void setUp(Method m, String logs){
		methodName=m.getName();
		LoggerUtil.contentLogger(logs, getClass().getSimpleName(), methodName,log);
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
	}
	
	
	@Test(priority=1)
	public void verifyTitleTest(){
		
		log.info("verifying "+ methodName +" tests");
		String title = loginPage.validateLoginPageTitle();
	}
	
	
	@Test(priority=2)
	public void verifyLogoTest(){
		
		log.info("verifying "+ methodName +" tests");
		boolean flag = loginPage.validateImage();
//		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void verifySignInTest(){
		
		log.info("verifying "+ methodName +" tests");
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = loginPage.login("username","password");
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		log.info("closing the  browser...");
//		driver.quit();
		log.info("browser is terminated successfully");
		log.info(methodName +" is completed successfully");
	}
	
	
}
