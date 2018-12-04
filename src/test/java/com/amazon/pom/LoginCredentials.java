package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCredentials 
{
	
	
	WebDriver driver;
	//declaration
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement submitemail;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement submitpwd;
		//initialization
	
	public LoginCredentials(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		//utilization
	
	public void EnterEmailAddress(String Emailid, String Password)
	{
		email.sendKeys(Emailid);
		submitemail.click();
		pwd.sendKeys(Password);
		submitpwd.click();
	}

}
