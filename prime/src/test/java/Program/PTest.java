package Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PTest {
public static void main(String[] args) {
	
	//@Test
	//public void testCase() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("appy-perf.phot.ai");
		driver.manage().window().maximize();
		driver.findElement(By.className("style_logInBtn___vSRi")).click();
		
  
			
	
		
       
      
     
	}
	}
	

