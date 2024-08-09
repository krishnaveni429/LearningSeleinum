package com.amazo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class LoginPage {
	public static void main(String[] args) {
		 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/V1/index.php");
	driver.findElement(By.name("uid")).sendKeys("krishna");
	driver.findElement(By.name("password")).sendKeys("12345678");
	driver.findElement(By.name("btnLogin")).click();
	}
	
		
	}

	
	


