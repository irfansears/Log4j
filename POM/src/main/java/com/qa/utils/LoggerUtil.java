package com.qa.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerUtil {
	
	public static void contentLogger(String logs, String className, String methodName, Logger log) {

		System.setProperty("fName", logs + className+"_"+methodName +".log");
		PropertyConfigurator.configure("log4j.properties");
		log.info("************************"+"\""+ methodName+"\""+" is started..."+"************************");
	}
}
