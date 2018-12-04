package com.amazon.testcases;

import org.testng.annotations.Test;
import com.amazon.library.BaseLib;
import com.amazon.library.Login;
import com.amazon.pom.UserHomePage;

public class AddressSearch extends BaseLib
{
	
	Login log;
	UserHomePage home;
	
	@Test(enabled=false)
	public void searchAddress()
	{
		//Step 1: Login
		log = new Login(driver);
		
		//Step 2: Search address
		home.yourodd();
		
	}

}
