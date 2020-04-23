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
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.LoggerUtil;
import com.qa.utils.TestUtil;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTest(){
		super();
		log=Logger.getLogger(HomePageTest.class.getName());
	}
	
	@Parameters({ "log_dir" })	
	@BeforeMethod
	public void setUp(Method m, String logs){
		methodName=m.getName();
		LoggerUtil.contentLogger(logs, getClass().getSimpleName(), methodName,log);
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login("username", "password");
	}
	
	
	@Test(priority=1)
	public void verifyBannerTest(){
		log.info("verifying "+ methodName +" tests");
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("HomePageTitle", homePageTitle);
	}
	
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		
		log.info("verifying "+ methodName +" tests");
		testUtil.switchToFrame();
//		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyContactsLinkTest(){
		log.info("verifying "+ methodName +" tests");
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@AfterMethod
	public void tearDown(){
		
		log.info("closing the  browser...");
//		driver.quit();
		log.info("browser is terminated successfully");
		log.info(methodName +" is completed successfully");
	}
	
	
}
