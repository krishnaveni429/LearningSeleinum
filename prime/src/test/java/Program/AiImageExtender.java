package Program;

import java.awt.AWTException;
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

public class AiImageExtender {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	       WebDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://appy-perf.phot.ai/");
			Actions act=new Actions(driver);
			
			 WebElement AllTools = driver.findElement(By.id("all-tools"));
				AllTools.click();
				
				Thread.sleep(3000);
				
				WebElement Extender=driver.findElement(By.xpath("//a[text()='AI Image Extender']"));
				Extender.click();
				
				Thread.sleep(3000);
				
				 WebElement Accept_close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		         Accept_close.click();
		         
		         WebElement click_upload=driver.findElement(By.xpath("//label[@class='Styles_inputLabel___TdqZ']/div"));
			 		click_upload.click();
			 		
		 		Robot r=new Robot();
		 		r.delay(3000);
		 		
		 		
		 		
		 		StringSelection ss=new StringSelection("Pictures\\cartoon.png");
		 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 		
		 		r.keyPress(KeyEvent.VK_CONTROL);
		 		r.keyPress(KeyEvent.VK_V);
		 		
		 		r.keyRelease(KeyEvent.VK_CONTROL);
		 		r.keyRelease(KeyEvent.VK_V);
		 		
		 		r.keyPress(KeyEvent.VK_ENTER);
		 		r.keyRelease(KeyEvent.VK_ENTER);
		 		
		 		Thread.sleep(5000);
		 		
		 		WebElement Square_click=driver.findElement(By.xpath("//button[text()='Square (1:1)']"));
		 		Square_click.click();
		 		
		 		//Thread.sleep(3000);
		 		
		 		WebElement Click_Gen=driver.findElement(By.cssSelector("button[class='ToolPhotoUncrop_generate__XLL_G font-rubik']"));
		         act.click(Click_Gen).perform();
		         
		        // Thread.sleep(3000);
		         
		         WebElement Testing = driver.findElement(By.xpath("//button[@id='auto-login']"));
		          Testing.click();
	}

}
