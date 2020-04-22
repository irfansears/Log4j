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

import com.base.TestBase;

public class CheckOutPageTest extends TestBase{
	
	String methodName;
	Logger log = Logger.getLogger(CheckOutPageTest.class.getName());
	@BeforeMethod
	public void setup(Method m){
		methodName=m.getName();
		System.out.println(m.getName());
//		System.setProperty("fName", "d:\\logs1\\" + "LoginPageTest" +".log");
//		PropertyConfigurator.configure("log4j.properties");
//		logger.info("  Starting test cases execution...before    ");

	}
	
	@Parameters({ "logs" })
	@Test(priority=1)
	public void creditTest(String logs){
		String classname= getClass().getSimpleName();
		System.out.println("class name : " + classname);
		System.out.println("method name : " + methodName);
		
		
//		Logger log = Logger.getLogger(CheckOutPageTest.class);
		System.setProperty("fName", logs + classname+"_"+methodName +".log");
		PropertyConfigurator.configure("log4j.properties");
	
		log.info("CheckOutPageTest - creditTest  case - started...");
		log.info("CheckOutPageTest - creditTest  case - executing...");
		log.info("CheckOutPageTest - creditTest  case - finished");
		log.info("");

	}
	
	@Parameters({ "logs" })
	@Test(priority=1)
	public void creditTest2(String logs){
		String classname= getClass().getSimpleName();
		
		System.out.println("class name : " + classname);
		System.out.println("method name : " + methodName);
		
		
		
		System.setProperty("fName", logs + classname+"_"+methodName +".log");
		PropertyConfigurator.configure("log4j.properties");
	
		log.info("CheckOutPageTest - creditTest2  case - started...");
		log.info("CheckOutPageTest - creditTest2  case - executing...");
		log.info("CheckOutPageTest - creditTest2  case - finished");
		log.info("");

	}
	
}
