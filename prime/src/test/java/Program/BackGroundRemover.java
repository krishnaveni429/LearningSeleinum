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

public class BackGroundRemover {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://appy-perf.phot.ai/");
		Actions act=new Actions(driver);
		
		WebElement AllTools = driver.findElement(By.id("all-tools"));
		AllTools.click();
		
		Thread.sleep(3000);
		
		WebElement Editing=driver.findElement(By.xpath("//li[text()='AI Editing']"));
		Editing.click();
		
		WebElement BGR=driver.findElement(By.xpath("//a[text()='Background Remover']"));
		BGR.click();
		
		 WebElement Accept_close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
         act.click(Accept_close).perform();
         
         Thread.sleep(3000);
         
         WebElement click_upload=driver.findElement(By.xpath("//label[@class='Styles_inputLabel___TdqZ']/div"));
	 	 click_upload.click();
	 		
 		Robot r=new Robot();
 		r.delay(8000);
 		
 		StringSelection ss=new StringSelection("C:\\Users\\krish\\Pictures\\girls\\babydoll.jpg");
 		
 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
 			
 		r.keyPress(KeyEvent.VK_CONTROL);
 		r.keyPress(KeyEvent.VK_V);
 		
 		r.keyRelease(KeyEvent.VK_CONTROL);
 		r.keyRelease(KeyEvent.VK_V);
 		
 		r.keyPress(KeyEvent.VK_ENTER);
 		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
