package ecommerce.Project;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;
import additional_data.Login_quit;


public class Test_Case12 extends Login_quit 
{

	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void selectEachPaymentMethod() throws InterruptedException, IOException {

		Amazon_Home_Page homePage = new Amazon_Home_Page(driver);
		homePage.search_shoes();

		Amazon_Search_Result_Page resultPage = new Amazon_Search_Result_Page(driver);
		resultPage.selectProduct();

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);

		Amzon_Product_Details_Page productPage = new Amzon_Product_Details_Page(driver);
		productPage.Add_To_Cart();

		Amazon_Add_to_Cart_Page cartPage = new Amazon_Add_to_Cart_Page(driver);
		cartPage.selectqty();
		cartPage.proceedToBuy();
		
		Amazon_Login_Page login = new Amazon_Login_Page(driver);
		login.un();
		login.Continue_button_Method();
		login.pwd();
		login.Signin();

		Amazon_Address_Page addressPage = new Amazon_Address_Page(driver);
		//addressPage.selectAddress();
		addressPage.useThisAddress();

		Amazon_PaymentMethods_Page paymentPage = new Amazon_PaymentMethods_Page(driver);
		//paymentPage.selectSBICard();
		//paymentPage.selectIndusindCard();
		paymentPage.selectPayment();
		paymentPage.selectNetBanking();
		paymentPage.selectOtherUPIApps();
		//paymentPage.selectEmiOption();
		paymentPage.selectCodOption();

		Assert.assertEquals(paymentPage.assertTc12(), true, "Test case 12 failed");
	}
}
