package Program;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

public class Aiphoto_Shoot {
	public static void main(String[] args) throws Throwable {
		 
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://appy-perf.phot.ai/");
		Actions act=new Actions(driver);
		
		 WebElement AllTools = driver.findElement(By.id("all-tools"));
			AllTools.click();
			
			Thread.sleep(3000);
			WebElement shoot=driver.findElement(By.xpath("(//div[@class='style_productsContainer__Gt2d3']/div/div/div[2]/ul/li[2]/a)[1]"));
			 shoot.click();
			 
		    Thread.sleep(5000);
			 
			 WebElement Accept_close=driver.findElement(By.xpath("(//div[@id='__next']/div/div[3]/div[2]/div/div/button)[1]"));
	         Accept_close.click();
			 
	         
	         Thread.sleep(5000);
	         
	         WebElement click_creat=driver.findElement(By.xpath("//div[@class='styles_heroBtnWrapper__El8k2']/button"));
			  click_creat.click();
			    
			    WebElement purchase=driver.findElement(By.cssSelector("button[class='styles_proceed__CW1EI']"));
			    purchase.click();
			    
			    
			    WebElement Testing = driver.findElement(By.xpath("//button[@id='auto-login']"));
		          Testing.click();
		          
		          Thread.sleep(5000);
		          
		          driver.switchTo().frame("paddle_frame");
		          
		          WebElement Postcode=driver.findElement(By.xpath("//input[@id='postcode']"));
		          Postcode.sendKeys("500081");
		          
		          WebElement continue_click=driver.findElement(By.xpath("//button[@type='submit']"));
		          continue_click.click();
		          
		          WebElement Card_No=driver.findElement(By.id("cardNumber"));
		          Card_No.sendKeys("4242424242424242",Keys.TAB,"test",Keys.TAB,"12/27",Keys.TAB,"134");
		          
		          WebElement Play_click=driver.findElement(By.xpath("//button[@type='submit']"));
		          Play_click.click();
		          
		          Thread.sleep(8000);
		          
		          WebElement Type_Name=driver.findElement(By.xpath("//div[@class='styles_avatarUpload__wRDjF']/div/div/input"));
		          Type_Name.sendKeys("Rani");
		          
		          WebElement Continue_click=driver.findElement(By.xpath("//button[text()='Continue']"));
		          Continue_click.click();
		          
		          WebElement upload_photo=driver.findElement(By.xpath("//section[@class='style_section__AdW6j']/div/div/div/div/label"));
		          upload_photo.click();
		          
		          Thread.sleep(8000);
		          
		         String[] files= {"C:\\Users\\krish\\Pictures\\girls\\baby girl01.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautiful girl000.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\babydoll.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautiful girl000.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautiful girl02.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautiful girl02.jpg"," ","C:\\Users\\krish\\Downloads\\babydoll.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautifull girl 00.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautifull photos.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautifull girl.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautifull photos.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautifull girl.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautiful girl02.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautifull girl.jpg"," ","C:\\Users\\krish\\Pictures\\girls\\beautifull girl 00.jpg"};
		          
		      
			 		
		          
		         for(String Name: files)
		       {
		        	 
		        	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    	   
			    	   wait.until(ExpectedConditions.elementToBeClickable(upload_photo));
			    	   	
		        	 StringSelection ss=new StringSelection(Name);
		        	  Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		         	    
		      	       cb.setContents(ss, null);
		             
		      	       Robot r = new Robot();
		        
		              r.delay(5000);

			 			
		              r.keyPress(KeyEvent.VK_CONTROL);
		      		   r.keyPress(KeyEvent.VK_V);
		      		
		      	   	   r.keyRelease(KeyEvent.VK_CONTROL);
		      		   r.keyRelease(KeyEvent.VK_V);
		      		
		      		   r.keyPress(KeyEvent.VK_ENTER);
		      		   r.keyRelease(KeyEvent.VK_ENTER);
		       }
				 
				 		
				 		
				 		 WebElement create = driver.findElement(By.xpath("//section[@class='style_section__AdW6j']/div/div/div/button"));
				 	       
				 		act.click(create).perform();
		         
	}
}
/*WebElement Upload_Photo = driver.findElement(By.xpath("//section[@class='style_section__AdW6j']/div/div/div/div/label"));

Upload_Photo.click();
  
String[] files = {"Downloads\\Spiderman.jpg","  ","C:\\Users\\harsh\\Downloads\\Spiderman1.jpg","  ","C:\\Users\\harsh\\Downloads\\Spiderman2.jpg","   ","C:\\Users\\harsh\\Downloads\\Spiderman3.jpg","  ","C:\\Users\\harsh\\Downloads\\Spiderman4.jpg","  ","C:\\Users\\harsh\\Downloads\\Spiderman5.jpg","  ","C:\\Users\\harsh\\Downloads\\Spiderman6.jpg"," ","C:\\Users\\harsh\\Downloads\\Spiderman7.jpg"," ","C:\\Users\\harsh\\Downloads\\Spiderman8.jpg"," ","C:\\Users\\harsh\\Downloads\\Spiderman9.jpg"};

for(String Paths : files)
{
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   
	   wait.until(ExpectedConditions.elementToBeClickable(Upload_Photo));
	   
    StringSelection ss = new StringSelection(Paths);
 
    Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
    
       cb.setContents(ss, null);
   
       Robot r = new Robot();

    r.delay(5000);
    
       r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	
   	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_V);
	
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
}

WebElement Create = driver.findElement(By.xpath("//section[@class='style_section__AdW6j']/div/div/div/button"));

 Create.click();*/
			 		
			 		
