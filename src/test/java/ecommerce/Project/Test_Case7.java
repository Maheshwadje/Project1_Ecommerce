package ecommerce.Project;

import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import additional_data.Listener_class;
import additional_data.Login_quit;

public class Test_Case7 extends Login_quit 
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void Product_Details_Check() throws InterruptedException
	{
		
		Amazon_Home_Page login1 = new Amazon_Home_Page(driver);
		login1.search_shoes();
		login1.search_btn_click();
		
		Amzon_Product_Details_Page click = new Amzon_Product_Details_Page(driver);
		click.shoe_click();
		click.Product_Des();
		click.price();
		click.Reviews();
		
		Set<String> d1 = driver.getWindowHandles();
		Assert.assertEquals(d1.size(), 2, "product page not launched");
		Iterator<String> pcid = d1.iterator();
		String pid = pcid.next();
		String cid = pcid.next();
		driver.switchTo().window(cid);
		
		Assert.assertEquals(click.Product_Des(), true , "Product description displayed");
		Assert.assertEquals(click.price(), true , "Price displayed");
		Assert.assertEquals(click.Reviews(), true , "Reviews displayed");
	}

}
