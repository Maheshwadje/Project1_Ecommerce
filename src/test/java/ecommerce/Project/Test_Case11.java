package ecommerce.Project;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import additional_data.Login_quit;

public class Test_Case11 extends Login_quit
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void Modify_product() throws InterruptedException
	{
		//search shoes
		Amazon_Home_Page login1 = new Amazon_Home_Page(driver);
		login1.search_shoes();
		login1.search_btn_click();
		
		Amzon_Product_Details_Page click = new Amzon_Product_Details_Page(driver);
		click.shoe_click();
		
		//change control to child tab
		Set<String> d1 = driver.getWindowHandles();
		Assert.assertEquals(d1.size(), 2, "product page not launched");
		Iterator<String> pcid = d1.iterator();
		String pid = pcid.next();
		String cid = pcid.next();
		driver.switchTo().window(cid);	
		//click on add to cart
		click.Add_To_Cart();
		
		Amazon_Add_to_Cart_Page cartPage = new Amazon_Add_to_Cart_Page(driver);
		cartPage.selectqty();
	}

}
