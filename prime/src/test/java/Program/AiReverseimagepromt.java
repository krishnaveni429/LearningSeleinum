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

public class AiReverseimagepromt {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://appy-perf.phot.ai/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);

        
       WebElement AllTools = driver.findElement(By.id("all-tools"));
		
		AllTools.click();
		
		Thread.sleep(3000);
		
		WebElement Reverse = driver.findElement(By.xpath("//div[@role='tabpanel']/ul[2]/li[2]/a"));
		Reverse.click();
		
		Thread.sleep(3000);
		
		WebElement Accept = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		 Accept.click();
        
        Thread.sleep(3000);
        
        WebElement Testing = driver.findElement(By.xpath("//button[@id='auto-login']"));
		Testing.click();
		
		Thread.sleep(3000);
		
		WebElement Upload_Image = driver.findElement(By.xpath("//div[@class='style_imageModal__rSRcm']/div[2]/div"));
		
		Upload_Image.click();
		
		Robot r = new Robot();
		r.delay(3000);
		
		StringSelection ss = new StringSelection("Pictures\\radhakrishna.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement Generate = driver.findElement(By.xpath("//div[@class='style_imageModal__rSRcm']/button"));
		act.click(Generate).perform();
		
		Thread.sleep(3000);
		
		WebElement Use = driver.findElement(By.xpath("//div[@class='style_useContainer__0ks6a']/button[2]"));
		Use.click();
		
		Thread.sleep(3000);
		
		WebElement Generate1 = driver.findElement(By.xpath("//div[@class='styles_itemContainer__fyTsD']/button"));
		Generate1.click();

		
	}
}