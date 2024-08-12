package ecommerce.Project;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import additional_data.Listener_class;
import additional_data.Login_quit;

public class Test_Case6 extends Login_quit 
{
	@Test(retryAnalyzer =additional_data.Retry_Analyzer.class)
	public void Search_shoes()
	{
	
	Amazon_Home_Page login1 = new Amazon_Home_Page(driver);
	login1.search_shoes();
	login1.search_btn_click();
	
	Amazon_Search_Result_Page Result = new Amazon_Search_Result_Page(driver);
	Result.Category1();
	Result.Return_Search_Page_Method();
	Result.Category2();
	Result.Return_Search_Page_Method();
	Result.Category3();
	Result.Return_Search_Page_Method();
	Result.Category4();
	Result.Return_Search_Page_Method();
	Result.Category5();
	Result.Return_Search_Page_Method();
	Result.Category6();
	Result.Return_Search_Page_Method();
	Result.Category7();
	Result.Return_Search_Page_Method();
	Result.Category8();
	Result.Return_Search_Page_Method();
	Result.Category9();
	Result.Return_Search_Page_Method();
	Result.Category10();
	Result.Return_Search_Page_Method();
	Result.Category11();
	Result.Return_Search_Page_Method();
	Result.Category12();
	Result.Return_Search_Page_Method();
	Result.Category13();
	Result.Return_Search_Page_Method();
	}
}
