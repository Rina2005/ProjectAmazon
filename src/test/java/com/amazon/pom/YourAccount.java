package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccount {
	
	WebDriver driver;
	
	//DECLARATION
	@FindBy(xpath ="//*[contains(text(), 'Your Addresses')]")
	WebElement linktoAddresses;
	
	//INITIALIZATION
	public YourAccount(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//UTILIZATION
	
	public void link_Addresses()
	{
		linktoAddresses.click();
	}

}
