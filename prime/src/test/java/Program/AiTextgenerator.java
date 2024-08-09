package Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AiTextgenerator {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://appy-perf.phot.ai/");
		
		
		Actions act= new Actions(driver);
		
        WebElement AllTools = driver.findElement(By.id("all-tools"));
	    AllTools.click();
		
		Thread.sleep(3000);
		
		WebElement AiTextGen = driver.findElement(By.xpath("//div[@class='productNav_toolsWrapper__rhx8V']/ul[2]/li[4]/a"));
	    AiTextGen.click();
		
		Thread.sleep(3000);

	
         WebElement close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
          close.click();
          
          Thread.sleep(3000);
          
          WebElement EnterText=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
          EnterText.sendKeys("Ram");
          
          WebElement AnotherText=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
           AnotherText.sendKeys("Devotinal");
           
           
           WebElement Genclick= driver.findElement(By.xpath("//button[text()='Generate']"));
            Genclick.click();
            
            WebElement Testing = driver.findElement(By.xpath("//button[@id='auto-login']"));
    		Testing.click();
    		
    		
    		
    		
    		
           
	}

}
