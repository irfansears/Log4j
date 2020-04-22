package com.qa.tests;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class MyMainClass2_xmllog {

	static Logger log = Logger.getLogger(MyMainClass2_xmllog.class);

	public static void main(String[] args) {
// use DOMConfigurateror in case of log4j xml file thanks
		DOMConfigurator.configure("log4j.xml");
//		System.out.println("in main mehod");
//		System.setProperty("fName", "C:\\workspace\\Workspace_Photon\\UITest\\logs\\mainmethod" +".log");
//		PropertyConfigurator.configure("log4j.properties");
//		log.info("in main method");
//		log.warn("warning in mai method");
//		log.setLevel(Level.WARN);
		
		log.trace("\nTrace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!\n");
	      log.debug("--------------");
			log.trace("\nTrace Message!");
		      log.debug("Debug Message!");
		      log.info("Info Message!");
		      log.warn("Warn Message!");
		      log.error("Error Message!");
		      log.fatal("Fatal Message!\n");
		      log.debug("--------------");
				log.trace("\nTrace Message!");
			      log.debug("Debug Message!");
			      log.info("Info Message!");
			      log.warn("Warn Message!");
			      log.error("Error Message!");
			      log.fatal("Fatal Message!\n");
			      log.debug("--------------");
					log.trace("\nTrace Message!");
				      log.debug("Debug Message!");
				      log.info("Info Message!");
				      log.warn("Warn Message!");
				      log.error("Error Message!");
				      log.fatal("Fatal Message!\n");
				      log.debug("--------------");
						log.trace("\nTrace Message!");
					      log.debug("Debug Message!");
					      log.info("Info Message!");
					      log.warn("Warn Message!");
					      log.error("Error Message!");
					      log.fatal("Fatal Message!\n");
					      log.debug("--------------");
							log.trace("\nTrace Message!");
						      log.debug("Debug Message!");
						      log.info("Info Message!");
						      log.warn("Warn Message!");
						      log.error("Error Message!");
						      log.fatal("Fatal Message!\n");
						      log.debug("--------------");
								log.trace("\nTrace Message!");
							      log.debug("Debug Message!");
							      log.info("Info Message!");
							      log.warn("Warn Message!");
							      log.error("Error Message!");
							      log.fatal("Fatal Message!\n");
							      log.debug("--------------");
//		add();
		
	}

	
	public static void add()
	{
		
		System.setProperty("fName", "C:\\workspace\\Workspace_Photon\\UITest\\logs\\add" +".log");
		PropertyConfigurator.configure("log4j.properties");
		log.info("in add method");
		log.warn("warning in add method");
		System.out.println("in add mehod");
	}
}
