package TestNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Radio_Button {
	
	
	WebDriver driver;

	@Test
	public void selectradiobutton() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritusha\\Desktop\\Demo_Maven_1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		Thread.sleep(5000);
		
		
		WebElement radiobutton1 = driver.findElement(By.xpath("(//input[@value='Male'])[1]"));

		radiobutton1.click();
		
	
	}
}
