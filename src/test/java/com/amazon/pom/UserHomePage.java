package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserHomePage {
	WebDriver driver;
	
	//DECLARATION
	@FindBy(xpath = "//*[contains(text(),'Hello, Rina')]")
	WebElement loggeduser;
	
	@FindBy(xpath = "//span[@class='nav-icon nav-arrow']/following::a[@class='nav-a nav-a-2 nav-truncate']")
	WebElement ddyourorderlink;
	
	@FindBy(xpath = "//*[contains(text(),'Your Orders')][@class='nav-text']")
	WebElement yourorders;
	
	@FindBy(xpath = "//span[contains(text(),'Your Account')]")
	WebElement youraccount;
	
	//INITIALIZATION
	public UserHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//UTILIZATION
	public String username()
	{
		String loggedusername = loggeduser.getText();
		return loggedusername;
	}
	
	public void clickddyourorder()
	{
		ddyourorderlink.click();
	}
	
	public void verfiyuser()
	{	
		Assert.assertEquals(username(), "Hello, Rina");
		
	}
	
	public void yourodd()
	{
		Actions hover = new Actions(driver);
		hover.moveToElement(ddyourorderlink).moveToElement(yourorders).click().build().perform();
	}
	
	public void youraccount()
	{
		Actions hover = new Actions(driver);
		hover.moveToElement(ddyourorderlink).moveToElement(youraccount).click().build().perform();
	}
}
