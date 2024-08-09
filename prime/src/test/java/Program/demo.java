package Program;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.close();
		Set<String>allID=driver.getWindowHandles();
		for(String s:allID) {
			String title=driver.switchTo().window(s).getTitle();
			if(title.contains("online shoping site for mobile")) {
				break;
			}
				System.out.println(title);
			}
				
			}
	


	}


