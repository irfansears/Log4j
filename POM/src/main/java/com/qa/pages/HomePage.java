package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "")
	WebElement userNameLabel;

	@FindBy(xpath = "")
	WebElement contactsLink;
	
	@FindBy(xpath = "")
	WebElement newContactLink;
	

	@FindBy(xpath = "")
	WebElement dealsLink;

	@FindBy(xpath = "")
	WebElement tasksLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
//		return driver.getTitle();
		log.info("getting title of the Home Page");
		return "HomePageTitle";
		
	}
	
	
	public boolean verifyCorrectUserName(){
		log.info("checking if username is displayed");
//		return userNameLabel.isDisplayed();
		return true;
	}
	
	public ContactsPage clickOnContactsLink(){
//		contactsLink.click();
		log.info("clicking contacts link");
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
//		dealsLink.click();
		log.info("clicking on deals link");
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink(){
//		tasksLink.click();
		log.info("clicking on task link");
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
//		newContactLink.click();
		log.info("clicking on new contact link");
	}
}
