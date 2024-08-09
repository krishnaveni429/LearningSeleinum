package sleniuclases_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://formstone.it/components/checkbox/");
		WebElement ele= driver.findElement(By.xpath("(//div[@class='fs-checkbox-flag'])[2]"));
		 ele.click();
		 if(ele.isSelected()) {
			 System.out.println("check box is selected");
		 }
			
			 
				 
			 
			 }
		 
		 
		 
	}
	


