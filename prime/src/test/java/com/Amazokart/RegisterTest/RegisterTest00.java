 package com.Amazokart.RegisterTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazokort.genericexcelutility.ReadExcelFile;
import com.Amokart.generic.common.BaseClass;

public class RegisterTest00 extends BaseClass{
	
	//@Listeners(com.Amazokart.generic.listenerutility.Listener.class)
	
			
			@Test(enabled = false)
			public void createUser_validData() throws IOException 
			{

//			Assert.fail();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//Verify  Page Using Assert
				String exp_title = "LEarning WEB TECHNOLOGY FORMS";
				String act_title = driver.getTitle();
				System.out.println(act_title);
				Assert.assertEquals(act_title, exp_title);
				
				
				
				//Create Object for RegisterPage
				//Registerpage regpage = new Registerpage(driver);
				
				// Step1:Clear the Name in The Name TextField
				//regpage.getName().clear();
				
				WebElement ele = driver.findElement(By.id("name"));
				ele.clear();
				
				//Create an Object for ExcelUtilityFile class
				ReadExcelFile excel_f=new ReadExcelFile();
				
				//Step 2: write the Name in the Name Text Field
				try {
					ele.sendKeys(excel_f.readdata("Sheet1", 1, 1));
				} catch (EncryptedDocumentException e) {
					
					e.printStackTrace();
				}
				
				//Step3:Display the Email
				try {
					System.out.println(excel_f.readdata("Sheet1", 1, 2));
				} catch (EncryptedDocumentException e) {
					e.printStackTrace();
				} 
				
				excel_f.writedata("Sheet1", 2, 1,"Himanshu");
				
				//Execution Completed Message
				Reporter.log("createUser_validData for Register Test", true);
			}
			
			
			@Test(dataProvider="Register")
			public void createUser_invalidData(String name,String email,String password ) {
				//Step1; Identify name textfiled
				
				driver.findElement(By.id("name")).clear();
				driver.findElement(By.id("name")).sendKeys(name);
				//Step2;Identify email textfiled
				
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys(email);
				//step3; identy the password textfield
				
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("passwotrd")).sendKeys(password);
				
				System.out.println("Name:"+name);
				System.out.println("id:"+email);
				System.out.println("dept:"+password);
				
				Reporter.log("createUser_InvalidData for Register Test", true);
			

			}


		}
	
	

