package com.Automation.Listnerimplementation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Amokart.generic.common.BaseClass;

public class Listner extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}
       @Override 
	public void onTestFailure(ITestResult result) {
    	   
		String name=result.getName();
		Reporter.log("Taking screenshot --Start--:" +name, true) ;
		
		// screenshot
		TakesScreenshot tsref= (TakesScreenshot) driver;
		File temp =tsref.getScreenshotAs(OutputType.FILE);
		File permanent= new File("./src/test/resources/screenshot/"+name+".png");
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			
		  e.printStackTrace();
		  
		}
		Reporter.log("Taking screenshot --completed--:" +name, true);
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
