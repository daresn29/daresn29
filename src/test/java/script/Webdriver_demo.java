package script;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webdriver_demo {

	
	
    public static void main(String[] args) throws InterruptedException 
    {
	
   
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\ritusha\\Desktop\\Demo_Maven_1\\driver\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
    
    // to launch url or website
    
// driver.get("https://www.makemytrip.com/");
    
    // to lunch url in a new tab
    
    driver.navigate().to("http://demo.guru99.com/test/newtours/");
    
    // lines to maximize the chrome tab 
    
    driver.manage().window().maximize();
   /* 
    // use of Linktext locator
    
   WebElement Mmt=driver.findElement(By.linkText("CONTACT"));
    
    // use of partiallink locator
    
    WebElement Support_link=driver.findElement(By.partialLinkText("SUPP"));
    
    
    // use of name locator
    
    
    WebElement username_textbox=driver.findElement(By.name("userName"));
    
    
    // to get attribute of UI element
    
   String s = null;
    
     username_textbox.getAttribute(s);
     
   System.out.println(s);
    
    
    // to get location
    
    Point location= username_textbox.getLocation();
    
    System.out.println("location of UI element"+location);
    

    // to get size
    
   Dimension size= username_textbox.getSize();
   
   System.out.println("Size of UI element"+size);
    
    
    // to get tag name
   
   String tagname= username_textbox.getTagName();
   
   System.out.println("tag namr of UI element"+tagname);
   
    
    
    // to get text of that
    
   String text= username_textbox.getText();
   
   System.out.println("text namr of UI element"+text); 
    
    
    Thread.sleep(2000);
    
    // to clear textbox
    
   username_textbox.clear(); 
    
    Thread.sleep(1000);
    
  username_textbox.sendKeys("testing");

  
    
   
 Thread.sleep(2000);
  
 Mmt.click();
    
  Support_link.click();
   
    // method to get page source
    
   String page_source= driver.getPageSource();
   System.out.println("Page source of the Website"+ " "+page_source);
   
   // method to get title of page
   
   
   
   */
   
  String title= driver.getTitle();
  
  System.out.println("Title of the page"+" "+title);
  
   Assert.assertEquals(title, "sssssss");
  
  
  
  
    // to get current URL
    
    /*String s1= driver.getCurrentUrl();
    
    System.out.println("Url Of the page"+""+s1);
    
    
    // lines to close browser
    
    Thread.sleep(3000);
  
    
   driver.close();
	*/
}	
	

}
