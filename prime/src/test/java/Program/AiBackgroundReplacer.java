package Program;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AiBackgroundReplacer {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://appy-perf.phot.ai/");
		
		
		
		 WebElement AllTools = driver.findElement(By.id("all-tools"));
			AllTools.click();
			
			Thread.sleep(3000);
			
			WebElement Photograp=driver.findElement(By.xpath("//a[text()='Background Replacer']"));
			Photograp.click();
			
			Thread.sleep(3000);
			
			WebElement Accept_close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	         Accept_close.click();
	         
	        // Thread.sleep(3000);
	         
	       
	         WebElement click_upload=driver.findElement(By.xpath("//label[@class='Styles_inputLabel___TdqZ']/div"));
		 	click_upload.click();
		 	
	 		Robot r=new Robot();
	 		r.delay(3000);
	 		
	 		// Copy the file
	 		
	 		StringSelection ss=new StringSelection("Pictures\\cartoon.png");
	 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	 		
	 		
	 		
	 		
	 		
	 		r.keyPress(KeyEvent.VK_CONTROL);
	 		r.keyPress(KeyEvent.VK_V);
	 		
	 		r.keyRelease(KeyEvent.VK_CONTROL);
	 		r.keyRelease(KeyEvent.VK_V);
	 		
	 		r.keyPress(KeyEvent.VK_ENTER);
	 		r.keyRelease(KeyEvent.VK_ENTER);
	 		
	 		Thread.sleep(3000);
	 		
	 		driver.findElement(By.id("scenic-tab")).click();
	 		
	 		Actions act=new Actions(driver);
	 		WebElement Click_one=driver.findElement(By.xpath("(//div[@id='parent-div']/div[2]/div/button/figure/div)[1]"));
	 		
	 		act.click(Click_one).perform();
	 		
	 		
	 		
	 		WebElement Click_Gen=driver.findElement(By.xpath("//button[@class='Styles_generateBtn__aPdyW']"));
	 		act.click(Click_Gen).perform();
	     
	         
	         WebElement Testing = driver.findElement(By.xpath("//button[@id='auto-login']"));
	           Testing.click();
	 		
	}



	}


