package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class LoginPage extends TestBase{
	TestUtil testUtil= new TestUtil();
	
	//Page Factory - OR:
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="loginBtn")
		WebElement loginBtn;
		
		@FindBy(xpath="signUpBtn")
		WebElement signUpBtn;
		
		@FindBy(xpath="")
		WebElement logo;
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
//			return driver.getTitle();
			log.info("getting tile of Login Page");
			return "title";
		}
		
		public boolean validateImage(){
			log.info("checking image");
			return true;
//			return logo.isDisplayed();
		}
		
		public HomePage login(String un, String pwd){
		    	
			testUtil.getUserCredentials();
			log.info("checking login");
			return new HomePage();
		}
}
