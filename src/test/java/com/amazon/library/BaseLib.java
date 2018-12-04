package com.amazon.library;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib 
{
	
	public  WebDriver driver;
	String uDirPath=System.getProperty("user.dir");
    String propertyfilepath=uDirPath+"//ProjectInputs.properties";
	
	@Parameters("browser")
    @BeforeMethod
	public void launchPage(String browser) throws IOException
	{	
    	if(browser.equals("Chrome"))
       {
    
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(HandlePropertyFile.getProperty(propertyfilepath, "BaseUrl"));
		driver.manage().window().maximize();
      }
    	

		
	}
	
}
