package ecommerce.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import additional_data.Listener_class;
import additional_data.Login_quit;


public class Test_Case5 extends Login_quit 
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void Search_shoes()
	{
	
	Amazon_Home_Page login1 = new Amazon_Home_Page(driver);
	login1.search_shoes();
	login1.search_btn_click();
	
	WebElement shoes_text = driver.findElement(By.linkText("Shoes"));
	Assert.assertEquals(shoes_text.getText(), "Shoes", "Test case 5 is failed");
	Reporter.log("Test case 5 passed, searching shoes");
	}

}
