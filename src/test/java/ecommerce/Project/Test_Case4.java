package ecommerce.Project;

import org.testng.Assert;
import org.testng.annotations.Test;
import additional_data.Login_quit;


public class Test_Case4 extends Login_quit
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void Edit_user_profile() throws InterruptedException
	{
	
	Amazon_Login_Page login = new Amazon_Login_Page(driver);
	login.signinclickhome();
	login.un();
	login.Continue_button_Method();
	login.pwd();
	login.Signin();
	
	Amazon_Home_Page homePage = new Amazon_Home_Page(driver);
	homePage.accountAndList(driver);
	homePage.manageProfile();
	System.out.println("Before Amazon page");
	
	Amazon_Profile_Manage_Page profilePage = new Amazon_Profile_Manage_Page(driver);
	System.out.println("Amazon page");
	Thread.sleep(1000);
	profilePage.clickView();
	profilePage.clickHeightAndWeight();
	profilePage.clickAddHeightAndWeight(); 
	/*
	 * System.out.println("Before add button"); if
	 * (profilePage.checkAddHeightAndWeight() == true) {
	 * profilePage.clickAddHeightAndWeight(); } else {
	 * profilePage.clickEditHeightAndWeight(); }
	 */
	profilePage.clickFT();
	profilePage.heightInFT();
	profilePage.heightInInch();
	profilePage.weightInKg();
	Thread.sleep(1000);
	profilePage.saveHeightAndWeight();

	Assert.assertEquals(profilePage.assertTC04(), true, "Test case 4 failed");
	
	}

}
