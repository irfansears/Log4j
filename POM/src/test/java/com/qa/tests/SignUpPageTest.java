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

public class SignUpPageTest extends TestBase{

	
	public SignUpPageTest(){
		super();
		log=Logger.getLogger(SignUpPageTest.class.getName());
	}
	
	@Parameters({ "log_dir" })	
	@BeforeMethod
	public void setUp(Method m, String logs){
		methodName=m.getName();
		LoggerUtil.contentLogger(logs, getClass().getSimpleName(), methodName,log);
		initialization();
	}
	
	
	@Test(priority=1)
	public void verifyFieldsTest(){
		
		log.info("verifying "+ methodName +" tests");
	}
	
	
	@Test(priority=2)
	public void verifySignInButtonTest(){
		
		log.info("verifying "+ methodName +" tests");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		
		log.info("closing the  browser...");
//		driver.quit();
		log.info("browser is terminated successfully");
		log.info(methodName +" is completed successfully");
	}
	
	
}
