package ecommerce.Project;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import additional_data.Listener_class;

public class Test_Case1
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void new_user_registration()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Amazon_Registration_page registration = new Amazon_Registration_page(driver);
		registration.un();
		registration.firstname();
		registration.pwd();
		registration.verify_mno_btn();
		
		Assert.assertEquals(driver.getTitle(), "Authentication required", "Test case 1 is failed");
		Reporter.log("Registration done");
		
	}

}
