package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webriver_commands {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritusha\\Desktop\\Demo_Maven_1\\driver\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver();
  
		    // to lunch url in a new tab
		    
		    driver.navigate().to("http://demo.guru99.com/test/newtours/");
		    
		    // command to refresh the current page
		    
		    driver.navigate().refresh();
		    
		    // lines to maximize the chrome tab 
		    
		    driver.manage().window().maximize();
		    
		// TODO Auto-generated method stub

		    driver.navigate().forward();
		    
		    WebElement username_textbox=driver.findElement(By.name("userName"));
		    
		    
		    driver.navigate().back();
		    
		    
		    
		  Boolean b= username_textbox.isDisplayed();
		   
		   System.out.println( b);
		   
		   Boolean e = username_textbox.isEnabled();
		    
		   
		   System.out.println(e);

		   Boolean s = username_textbox.isSelected();
		   
		   System.out.println(s);
		   
		   
		   Thread.sleep(2000);
		   
		   username_textbox.sendKeys("ritu");
		  
		    
		    driver.close();
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
