package ecommerce.Project;

import org.testng.Assert;
import org.testng.annotations.Test;
import additional_data.Login_quit;

public class Test_Case14  extends Login_quit
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void lastOrderedProductRating() throws InterruptedException 
	{
		Amazon_Login_Page login = new Amazon_Login_Page(driver);
		login.signinclickhome();
		login.un();
		login.Continue_button_Method();
		login.pwd();
		login.Signin();
		Amazon_Home_Page homePage = new Amazon_Home_Page(driver);
		homePage.returnsAndOrders();
	
		Amazon_Orders_Page ordersPage = new Amazon_Orders_Page(driver);
		ordersPage.orderPalcedDate();
		ordersPage.productReview();
		Thread.sleep(800);
		ordersPage.rateFiveStar();
		Thread.sleep(1000);
		ordersPage.clearRating();
		
		Assert.assertEquals(ordersPage.assertTC14(), true, "Test case 14 failed");
	}
}
