package com.amazon.library;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.amazon.pom.HomePage;
import com.amazon.pom.LoginCredentials;

public class Login extends BaseLib
{
	WebDriver driver;
	HomePage hp;
	
    public Login(WebDriver driver) 
    {
		this.driver=driver;
	}

	public void login() throws IOException
	{
		hp = new HomePage(driver);
		hp.SignInClick();
		LoginCredentials lc = new LoginCredentials(driver);
		lc.EnterEmailAddress(HandlePropertyFile.getProperty(propertyfilepath, "Username"),HandlePropertyFile.getProperty(propertyfilepath, "Password"));
	}

}
