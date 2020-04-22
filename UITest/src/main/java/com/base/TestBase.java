package com.base;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;


public class TestBase {

	public Logger log;
	public String methodName;
	
	@BeforeMethod
	public void setup(Method m){
		
		methodName=m.getName();
		System.out.println(m.getName());
//		System.setProperty("fName", "d:\\logs1\\" + "LoginPageTest" +".log");
//		PropertyConfigurator.configure("log4j.properties");
		log.info("Starting test cases execution...before    ");

	}
}
