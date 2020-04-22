package com.qa.tests;


import org.testng.annotations.AfterMethod;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	WebDriver driver;
//	static Logger logger = Logger.getLogger(LoginPageTest.class);
	
	@BeforeMethod
	public void setup(Method m){
		
		System.out.println(m.getName());
//		System.setProperty("fName", "d:\\logs1\\" + "LoginPageTest" +".log");
//		PropertyConfigurator.configure("log4j.properties");
//		logger.info("  Starting test cases execution...before    ");

	}
	
	@Parameters()
	@Test(priority=1)
	public void loginTest(){
//		Method m = 
		Logger log = Logger.getLogger(LoginPageTest.class);
		System.setProperty("fName", "d:\\logs1\\" + "LoginPage_LoginTest" +".log");
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("LoginPageTest - loginTest case - started...");
		log.info("LoginPageTest - loginTest case - executing...");
		log.info("LoginPageTest - loginTest case - finished");
		log.info("");
		
	}
	
	@Test(priority=2)
	public void titleTest(){
		
		Logger log = Logger.getLogger(LoginPageTest.class);
		System.setProperty("fName", "d:\\logs1\\" + "LoginPage_TitleTest" +".log");
		PropertyConfigurator.configure("log4j.properties");
		log.info("LoginPageTest - titleTest case - started...");
		log.info("LoginPageTest - titleTest case - executing...");
		log.info("LoginPageTest - titleTest case - finished");
		log.info("");

	}
	
	@AfterMethod
	public void tearDown(){
//		driver.quit();
//		logger.info("  Browser is closed   ");
//		logger.info("  ");
		
	}
	
	
	
	
	
	
	
	
}
