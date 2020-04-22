package com.qa.tests;


import org.testng.annotations.AfterMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
	WebDriver driver;
//	static Logger log = Logger.getLogger(HomePageTest.class);
	
	@BeforeMethod
	public void setup(){
//		System.setProperty("fName", "d:\\logs1\\" + "HomePageTest" +".log");
//		PropertyConfigurator.configure("log4j.properties");
//		log.info(" HomePage Starting test cases execution    ");

	}
	
	
	@Test(priority=1)
	public void titleTest(){
		
		Logger log = Logger.getLogger(HomePageTest.class);
		System.setProperty("fName", "d:\\logs1\\" + "HomePage_TitleTest" +".log");
		PropertyConfigurator.configure("log4j.properties");
//		String title = driver.getTitle();
//		System.out.println(title);
//		log.info("login page title is--->"+title);
		
		log.info("HomePageTest - Title  test case - started...");
		log.info("HomePageTest - Title  test case - executing...");
		log.info("HomePageTest - Title  test case - finished");
		log.info("");


	}
	
	@Test(priority=2)
	public void logoTest(){
		
		Logger log = Logger.getLogger(HomePageTest.class);
		System.setProperty("fName", "d:\\logs1\\" + "HomePage_LogoTest" +".log");
		PropertyConfigurator.configure("log4j.properties");
		log.info("HomePageTest - logoTest case - started...");
		log.info("HomePageTest - logoTest case - executing...");
		log.info("HomePageTest - logoTest case - finished");
		log.info("");

	}
	
	@AfterMethod
	public void tearDown(){
//		driver.quit();
//		log.info(" HomePage Browser is closed   ");
//		log.info("  ");
		
	}
	
	
	
	
	
	
	
	
}
