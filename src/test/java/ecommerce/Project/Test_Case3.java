package ecommerce.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import additional_data.Listener_class;
import additional_data.Login_quit;

public class Test_Case3 extends Login_quit 
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void login_to_Amazon_inValid_Cred()
	{
		
	Amazon_Login_Page login = new Amazon_Login_Page(driver);
	login.signinclickhome();
	login.invalidun();
	login.Continue_button_Method();
	
	WebElement text = driver.findElement(By.xpath("//span[@id='continue']"));
	Assert.assertEquals(text.isDisplayed(), true , "invalid mobile number");
	Reporter.log("login with invalid mobile number");
	}

}
