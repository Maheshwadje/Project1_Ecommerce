package ecommerce.Project;

import org.testng.Assert;
import org.testng.annotations.Test;

import additional_data.Login_quit;

public class Test_Case8  extends Login_quit
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void Product_sorting() throws InterruptedException 
	{
		Amazon_Home_Page sort_product = new Amazon_Home_Page(driver);
		sort_product.search_shoes();
		sort_product.search_btn_click();
		
		Amazon_Search_Result_Page sort_test = new Amazon_Search_Result_Page(driver);
		Thread.sleep(500);
		sort_test.selectRelevance();
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(2000);
		sort_test.selectPrice();
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		sort_test.selectRating();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Amazon.in : shoes","Test case 8 failed");
	}
	

}
