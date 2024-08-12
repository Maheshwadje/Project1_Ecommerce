package ecommerce.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import additional_data.Listener_class;
import additional_data.Login_quit;

public class Test_Case2 extends Login_quit 
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void login_to_Amazon_Valid_Cred()
	{	
	Amazon_Login_Page login = new Amazon_Login_Page(driver);
	login.signinclickhome();
	login.un();
	login.Continue_button_Method();
	login.pwd();
	login.Signin();
	
	WebElement username = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Assert.assertEquals(username.getText(),"Hello, Mahesh", "Test_Case2 is failed");
	Reporter.log("Login validated with valid cred");
	}
}
