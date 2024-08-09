package Demotestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[normalize-space()='Digital downloads']")).click();
	List<WebElement>ele1=driver.findElements(By.xpath("//*[@class='page-body']//div//div//div[@class='product-item']//div//div[@class='item-box']"));
	for(WebElement e:ele1) {
		String data= e.getText();
		System.out.println(data);
		
	}
	
	
	
	
}
}