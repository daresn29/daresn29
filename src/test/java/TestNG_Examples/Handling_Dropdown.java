package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handling_Dropdown {
	

	
	
	public static void main(String ...s) throws InterruptedException
	
	{
	
	WebDriver driver;

	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritusha\\Desktop\\Demo_Maven_1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement dropdown = driver.findElement(By.id("select-demo"));
		
		Select select = new Select(dropdown);
		
		// select by visible text
		
		select.selectByVisibleText("Tuesday");
		
		// select by visible value 
		
		select.selectByValue("Wednesday");
		
		// select by Index 
		
		select.selectByIndex(3);
		
		Thread.sleep(5000);
		
		// Need to use when their are multiple select in a dropdown
			
	}
		
	}




