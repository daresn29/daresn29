package generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;




public abstract class BaseTest implements AUTOCONST {

	public static WebDriver driver;



	@BeforeMethod
	public void preCondition() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
}
	
	// this is the place of adding method for screenshot 

	
		
	}


