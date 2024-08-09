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

import com.github.dockerjava.api.model.Driver;

public class AiPhotoEditer {
	public static void main(String[] args) throws Throwable {
		
	
       WebDriver driver=new ChromeDriver();
       
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://appy-perf.phot.ai/");
		driver.manage().window().maximize();
		
		 WebElement AllTools = driver.findElement(By.id("all-tools"));
			AllTools.click();
			Thread.sleep(3000);
			
			WebElement Click_PhotoEditer=driver.findElement(By.xpath("//a[text()='AI Photo Editor']"));
			Click_PhotoEditer.click();
			
			Thread.sleep(3000);
			
			WebElement Accept_close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	         Accept_close.click();
	         
	          Thread.sleep(5000);
	          
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
		 		//Actions act=new Actions(driver);
		 		
		 		WebElement Edit_BackG= driver.findElement(By.xpath("(//p[text()='Edit Background'])[1]"));
		 		Edit_BackG.click();
		 		 Thread.sleep(3000);
		 		
		 		WebElement Testing = driver.findElement(By.id("auto-login"));
		          Testing.click();
		          
	        Thread.sleep(8000);
		          
		         WebElement Edit_BackG1= driver.findElement(By.xpath("(//p[text()='Edit Background'])[1]"));
			     Edit_BackG1.click();
			 	
			 	Thread.sleep(5000);
			 		
			 	WebElement Text_field=driver.findElement(By.xpath("//div[@class='newStyles_promptBarWrapper__iw7j_']/div/div/input"));
			 	Text_field.sendKeys("walking at night");
			 		
			 	Thread.sleep(5000);
			 		
			 	WebElement Click_Gen=driver.findElement(By.xpath("//button[text()='Generate']"));
			 	Click_Gen.click();
		          
}
}
