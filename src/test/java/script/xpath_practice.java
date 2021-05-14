package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritusha\\Desktop\\Demo_Maven_1\\driver\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver();
		    
		    // to launch url or website
		    
		 driver.get("https://www.goibibo.com/");
	
		    // lines to maximize the chrome tab 
		    
		    driver.manage().window().maximize();
		    
		    
		    driver.close();
		    
		    
		    // syntax for xpath
		    
		        //tagname[@attrbute='value']
		
		
	}

}
