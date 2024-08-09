package Demotestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideTest {
	

@Test(dataProvider="Credentials")
public void login(String s1, String s2) throws InterruptedException {
	WebDriver driver = new ChromeDriver();

driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.xpath("//a[text()='Log in']")).click();
  driver.findElement(By.id("Email")).sendKeys(s1);
  driver.findElement(By.id("Password")).sendKeys(s2);
  driver.findElement(By.xpath("//input[@value='Log in']")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//a[text()='Log out']")).click();

}
@DataProvider(name="Credentials")
public Object[][] testData() {
	Object[][] o = new Object[2][2];
			o[0][0]="admin02@gmail.com";
			o[0][1]="Admin02";
			o[1][0]="admin02@gmail.com";
			o[1][1]="Admin02";
					
return o;
}
}




