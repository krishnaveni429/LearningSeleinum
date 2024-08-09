package com.Amokart.generic.common;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.amazo.propertyfileutilitys.readproperty;
import com.beust.jcommander.Parameter;
import com.github.dockerjava.api.model.Driver;



public class BaseClass extends objectUtility {
	
	public static  WebDriver driver=null;
	@DataProvider(name="reg")
	public void registerdata() {
		
		Object[][]data=new Object[3][3];
		
		data[0][0]="krishna";
		data[0][1]="krishna@gmail.com";
		data[0][2]="123";
		
		data[0][0]="Mouni";
		data[0][1]="mouni@gmail.com";
		data[0][2]="345"; 
		
		data[0][0]="seetha";
		data[0][1]="seetha@gmail.com";
		data[0][2]="678"; 
		
		return;
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("login sucessful",true);
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout sucessful",true);
		
	}
	@Parameters("browser")
   @BeforeClass
   public void browserSetup( String bname)  {
		
	   //configure the broswer
		
	   System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	   
	   //Using scanner class
	   
	   //Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Enter the browser");
	   String b_name=bname;
	   
	   // if user gives browsername="chrome"
	   
	   if(b_name.equals("chrome")) {
		   driver=new ChromeDriver();
	   }
	   else
	   {
		   System.out.println("u have entered ivalid browser name");
		   driver=new ChromeDriver();
	   }
	   //create object for propertyfile
	objectCreation();
	   
	  // readproperty ref= new readproperty();
	   
	   //fetch the data
	  
	
		 String url = rpfobj.readdata("url");
	
	 driver.get(url);
	
	  //Step2: navigate to the applicaton

	   Reporter.log("BrowserSetup scusessfully",true);
	   
	   }
	   
	   
	   
   
  
		
	

@AfterClass
   public void closebrowser() {
	   // close the browser
	   driver.close();
	   Reporter.log("CLosebrowser sucessfull",true);
	   
	   }
   @BeforeTest
   public void preconditions() {
	   Reporter.log("pre condition sucessful ",true);
   }
   @AfterTest
   public void postcondition() {
	   Reporter.log("post condition done sucessful",true);
   }
   @BeforeSuite
   public void getsuiteconnections() {
	   Reporter.log("get suiteconnections done sucessfull",true);
   }
   @AfterSuite
   public void terminatesuiteconnections() {
	   Reporter.log("terminate suiteconnections done sucessful", true);
   }
   
}
