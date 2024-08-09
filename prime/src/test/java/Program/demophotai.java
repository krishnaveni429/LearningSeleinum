package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demophotai {
	//@test
	public void testcase() {
	
	

	
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
         driver.get("https://www.phot.ai/");
		
		driver.manage().window().maximize();
		
		WebElement Login=driver.findElement(By.className("style_logInBtn___vSRi"));
		
		Login.click();
        WebElement Accept = driver.findElement(By.xpath("(//div[@id='__next']/div/div[2]/div[2]/div/div/button)[1]"));
		
       
        
		
		
		WebElement Gmail = driver.findElement(By.xpath("//div[@class='Styles_emailCon__ggeWE']/child::input"));
		
		Gmail.sendKeys("krishnavenipittala429gmail.com");
		
		WebElement Magic_Link= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/button"));
		
		Magic_Link.click();
		
		
		//WebElement Cancel = driver.findElement(By.xpath("(//div[@role='presentation']/div/div/div/button/div)[1]"));
		//act.click(cancel).perform();

      //  WebElement AllTools = driver.findElement(By.xpath("//li[@id='all-tools']/a"));
		
		//act.click(AllTools).perform();
		
	//	WebElement Product_Photo = driver.findElement(By.xpath("//li[@id='all-tools']/div/div/div/div/div[2]/ul/li/a"));
		
		//act.click(Product_Photo).perform();
		
		//Thread.sleep(3000);
		
		//WebElement Drop_Image = driver.findElement(By.xpath("//section[@class='Styles_section__t3kVp']/div[6]/div/label"));
		
		//Drop_Image.click();
	   // driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
	   // driver.findElement(By.xpath("//div[@class='Styles_emailCon__ggeWE']/child::input")).sendKeys("krishnavenipittala429@gmail.com");
	   // driver.findElement(By.xpath("//div[@class='Styles_emailCon__ggeWE']/child::button")).click();
	  //  driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
