package Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AiTextToImage {
	public static void main(String[] args) throws Throwable {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://appy-perf.phot.ai/");
	
	Actions act=new Actions(driver);
	
	
	 WebElement AllTools = driver.findElement(By.id("all-tools"));
		AllTools.click();
		
		Thread.sleep(3000);
		
		WebElement textimage=driver.findElement(By.xpath("//a[text()='Text to Image']"));
		 textimage.click();
		 
		 Thread.sleep(5000);
		 
		 WebElement Accept_close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
         act.click(Accept_close).perform();
         
       //  Thread.sleep(3000);
		
         WebElement field=driver.findElement(By.id("myTextarea"));
          field.sendKeys("by walking street light");
          
          Thread.sleep(3000);
          
	     WebElement click_Gen=driver.findElement(By.xpath("(//button[text()='Generate'])[1]"));
	     click_Gen.click();
	     
	     WebElement Testing = driver.findElement(By.xpath("//button[@id='auto-login']"));
 		Testing.click();
	}

}
