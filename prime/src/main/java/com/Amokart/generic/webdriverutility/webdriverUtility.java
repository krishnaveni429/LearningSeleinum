package com.Amokart.generic.webdriverutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverUtility {
	
	public void waitforPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void ProvideWaitStatment(WebDriver driver , WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	public void clickOnElement() {
		
		
	}
	public void  PassDataOnElement() {
		
	}
	public void ClearDataOnElement() {
		
	}
      public void validateOnElementDisplay() {
    	  
      }
      public void validateOnElementEnabled() {
    	  
      }
      
      public void validateOnElementSelected() {
    	  
      }
      public void SelectOptionDropDown(int index) {
    	  
      }
      public void SelectOptionDropDown(String value) {
    	  
      }
      public void SelectOptionDropDown_value(String visibletext) {
    	  
      }
      public void SwitchControlToAlert() {
    	  
      }
      public void SwitchControlToframe(WebDriver driver, String nameID) {
    	  driver.switchTo().frame(nameID);
    	   
      }
      public void switchtoAlertAndAcept(WebDriver driver) {
    	  driver.switchTo().alert().accept();
      }
      public void switchtoAlertAndCancel(WebDriver driver) {
    	  driver.switchTo().alert().dismiss();
      }
      public void select(WebElement element,String text) {
    	 Select sel=new Select(element);
    	 sel.selectByVisibleText(text);
      }
      public void select(WebElement element,int  index) {
    	  Select sel=new Select(element);
    	  sel.selectByIndex(index);
      }
}
