package Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AiPatternArt {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://appy-perf.phot.ai/");
		
		Actions act=new Actions(driver);
		
		
		 WebElement AllTools = driver.findElement(By.id("all-tools"));
			AllTools.click();
			
			Thread.sleep(3000);
			
			WebElement Pattern_click=driver.findElement(By.xpath("//a[text()='AI Pattern Art']"));
			Pattern_click.click();
			
			Thread.sleep(3000);
			
			 WebElement Accept_close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	         Accept_close.click();
	         
	         Thread.sleep(5000);
	         
	         WebElement Gen1_click=driver.findElement(By.xpath("//a[text()='Generate AI Patterns']"));
	         act.click(Gen1_click).perform();
	         
	        // Thread.sleep(3000);
	         
	         WebElement Send_Data=driver.findElement(By.xpath("//textarea[@class='styles_textArea__L_nxz font-rubik styles_patternArea__czup2']"));
	         Send_Data.sendKeys("dress followers");
	         
	         Thread.sleep(5000);
	         
	         WebElement One=driver.findElement(By.xpath("(//div[@class='styles_countContainer__JNtfs']/div)[2]"));
	         One.click();
	         
	        Thread.sleep(5000);
	         
	         WebElement Gene2_click=driver.findElement(By.xpath("//button[@type='submit']"));
	         act.click(Gene2_click).perform();
	         
	        Thread.sleep(3000);
	         
	         WebElement Testing = driver.findElement(By.xpath("//button[@id='auto-login']"));
	    		Testing.click();
	         
	        
	 		
	}

}
