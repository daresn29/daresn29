package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handling_Checkboxes {
	
	WebDriver driver;

	@Test
	public void selectOption() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\ritusha\\Desktop\\Demo_Maven_1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		WebElement checkbox1 = driver.findElement(By.id("isAgeSelected"));

	    checkbox1.click();
	    
	   Boolean c= checkbox1.isSelected();

	   System.out.println(c);
		
		
		
		
	}

	
	
	
	
}
