package com.amazon.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	//declaration
	@FindBy(xpath="//*[contains(text(),'Hello. Sign in')]")
	private WebElement SignInButton;
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void SignInClick()
	{
		SignInButton.click();
	}
	
	
	
}
