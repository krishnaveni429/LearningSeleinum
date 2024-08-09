package com.amazo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logintestcase extends Baseclass {
	
	
	@Test
	public void logintest()
	{
		driver.get(baseURL);
		LoginPage ln=new  LoginPage(driver);
		ln.setUserName(username);
		ln.setPassWord(password);
		ln.clicksubmit();
		
		if(driver.getTitle().equals("Guru 99 bank Home page"))
		
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}

}
