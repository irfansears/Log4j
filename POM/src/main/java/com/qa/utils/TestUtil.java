package com.qa.utils;

import com.qa.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void switchToFrame() {
		
		log.info("switching to mainpanel");
//		driver.switchTo().frame("mainpanel");
	}
	
	public void getUserCredentials() {

		log.info("getting the user credentials");
	}
}
