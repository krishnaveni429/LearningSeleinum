package Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AiArtTattoo {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://appy-perf.phot.ai/");
	          
	          
	          
        WebElement AllTools = driver.findElement(By.id("all-tools"));
       Actions act=new Actions(driver);
		
		AllTools.click();
		
		Thread.sleep(3000);
		
		WebElement Ai_Tattoo = driver.findElement(By.xpath("//div[@class='productNav_toolsWrapper__rhx8V']/ul[2]/li[5]/a"));
		
		Ai_Tattoo.click();
		
		Thread.sleep(3000);
		
		WebElement Accept = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		
        Accept.click();
        
        Thread.sleep(3000);
        
        WebElement Tattoo = driver.findElement(By.xpath("(//div[@id='__next']/div/main/section/a)[1]"));
        
        act.click(Tattoo).perform();
        
        WebElement Text_Filed = driver.findElement(By.xpath("//div[@class='styles_resultTopCon__mZG73']/form/textarea"));
        
        Text_Filed.sendKeys("butterfly");
        
        Thread.sleep(5000);  
        
        WebElement Style_Click = driver.findElement(By.xpath("(//div[@class='styles_resultTopCon__mZG73']/form/div[2]/ul/button/figure)[1]"));
        act.click(Style_Click).perform();
        
       
        
        Thread.sleep(3000);
        
        WebElement Click_Gen=driver.findElement(By.xpath("//div[@class='newStyles_promptBarWrapper__iw7j_']/div/div[2]/button[2]"));
        Click_Gen.click();
        
        
        Thread.sleep(3000);
        
        WebElement Login_Testing = driver.findElement(By.xpath("//button[@id='auto-login']"));
		Login_Testing.click();

	           
	}

}
