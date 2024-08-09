package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AiArt_Genarator {
	public static void main(String[] args) throws Throwable {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://appy-perf.phot.ai/");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
        WebElement AllTools = driver.findElement(By.id("all-tools"));
		
		AllTools.click();
		
		Thread.sleep(3000);
		
		WebElement Ai_Art = driver.findElement(By.xpath("(//div[@class='productNav_tabsToolWrapper___3gBI']/div[2]/ul/li[4]/a)[1]"));
		
		Ai_Art.click();
		
		WebElement Accept = driver.findElement(By.xpath("(//button[@type='button'])[2]"));

        Accept.click();
        
        Thread.sleep(3000);
        
        WebElement Explore = driver.findElement(By.xpath("//a[text()='Explore More']"));
        
        act.click(Explore).perform();
        
        WebElement Text_Field = driver.findElement(By.xpath("//div[@class='common_webMain__fC5r9']/div/input"));
        
        Text_Field.sendKeys("Nature");
        
        WebElement Search = driver.findElement(By.xpath("//div[@class='common_webMain__fC5r9']/div/figure"));
        
       act.click(Search).perform();
	}

}
