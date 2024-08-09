package com.amazo.testcases;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.Before;

public class Baseclass {
	
	public String baseURL="https://demo.guru99.com/V1/index.php";
	public String username="krishna";
	public String password="12345678";
	public  WebDriver driver=null;
	
	@BeforeClass
	public void setup()
	
	{
		System.setProperty("webdriver.chrome.driver","src/main/java//Driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
		Reporter.log("close browser sucessfully", true);
	}
	

}
