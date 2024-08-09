package Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AiStackImages {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://appy-perf.phot.ai/");
		
		
		 WebElement AllTools = driver.findElement(By.id("all-tools"));
		 AllTools.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement Ai_Stack_images=driver.findElement(By.xpath("//a[text()='AI Stock Images']"));
		 Ai_Stack_images.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement Accept_close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
         Accept_close.click();
        
         WebElement Search_field= driver.findElement(By.xpath("(//div[@class='common_main__F_AaC']/div/div/input)[1]"));
         Search_field.sendKeys("roses");
         
        // Thread.sleep(3000);
         
         WebElement Search_click=driver.findElement(By.xpath("//div[@class='common_webMain__fC5r9']/div/figure"));
          Search_click.click();

}
}