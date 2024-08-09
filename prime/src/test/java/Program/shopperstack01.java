package Program;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopperstack01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(8000);
		driver.findElement(By.id("compare")).click();
		
		
		Set<String> allwin=driver.getWindowHandles();
		for(String win: allwin)
	   
		{
			driver.switchTo().window(win);
			Thread.sleep(3000);
			String curl=driver.getCurrentUrl();
			System.out.println(curl);
				
				
			{
				
			
			
	
			{
			
			if(curl.equals("https://www.amazon.com/"))
			{
				
			}
			else
				 driver.close();
			
			}
		}
		System.out.println("Excuted Complted");
			
			
		}
		
		
		
		


	}
}
	


//driver.findElement(By.id("gh"));
		//driver.findElement(By.className("//div[@class='_2-LWwB']"));
