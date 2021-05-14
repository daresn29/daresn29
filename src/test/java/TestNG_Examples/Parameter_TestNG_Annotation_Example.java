package TestNG_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter_TestNG_Annotation_Example {
	
	
	@Test
	@Parameters({ "browser" }) 
	public void launch_Browser(String browser) throws Exception
{
	
		WebDriver driver;
		
		if (browser.equalsIgnoreCase("chrome"))
		{
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritusha\\Desktop\\Demo_Maven_1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println("Browser name"+ browser );
		
		driver.close();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
			
		{
			
		
	        System.setProperty("webdriver.edge.driver", "C:\\Users\\ritusha\\Desktop\\Demo_Maven_1\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.spicejet.com/");
			System.out.println("Browser name"+ browser );
			
			driver.close();
			}	
		
		
		else{
		
			throw new Exception("Browser is not correct");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		
		
	}
			
			

		
	
	
	


