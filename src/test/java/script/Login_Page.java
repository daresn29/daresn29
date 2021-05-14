package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import generic.BaseTest;
import pom.loginpage;
import utility.ExcelRead;

public class Login_Page extends BaseTest {
	
	
	@Test
	
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	
	{

		loginpage login= new loginpage(driver);
		
		Thread.sleep(2000);
		
		String username_Value=ExcelRead.excelRead("Login", "C:\\UI_Automation\\Demo_Maven_1\\testdata\\Testdata1.xlsx", 1, 0);
		
		login.Set_Username(username_Value);
		
		Thread.sleep(2000);
        String password_Value=ExcelRead.excelRead("Login", "C:\\UI_Automation\\Demo_Maven_1\\testdata\\Testdata1.xlsx", 1, 1);
		
		login.Set_Password(password_Value);
		
		Thread.sleep(2000);
		
		login.click_Sign_In_Button();
	}		
}
