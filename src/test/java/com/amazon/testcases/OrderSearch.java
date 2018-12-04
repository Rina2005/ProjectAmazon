package com.amazon.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import com.amazon.library.BaseLib;
import com.amazon.library.Login;
import com.amazon.pom.UserHomePage;

public class OrderSearch extends BaseLib
{
	Login log;
	UserHomePage home;
	
	@Test
	public void searchorder() throws IOException
	{
		log=new Login(driver);
		home = new UserHomePage(driver); 
		
		//Step 1:Login 
		log.login();
		
		//Step 2: Verify user logged in 
		home.verfiyuser();
		
		//Step 3: Search order
		home.yourodd();
		
		//Step 4: verify the order list 
		
	}

}
