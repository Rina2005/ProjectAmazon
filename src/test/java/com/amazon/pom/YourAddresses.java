package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddresses {
	WebDriver driver;
	
	
	//DECLARATION
	@FindBy(xpath = "//h2[contains(text(), 'Add address')]")
	WebElement cofirmaddresspage;
	
	
	//INITIALIZATION
	public YourAddresses(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//UTILIZATION
	public void addressesPage()
	{
		if(cofirmaddresspage.isDisplayed())
		{
			System.out.println("Your Addresses Page is displayed. Add or check for registered addresses");
		}
	}
}
