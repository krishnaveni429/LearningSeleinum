package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Selenium {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		//findelement will identify the single element
		//By class always start from loators
		//locators 8 types all are static methods
		driver.findElement(By.className("nav-search-submit nav-sprite")).click();
		// sendkeys write the data from script to web application like pass the data
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		
	}

}
