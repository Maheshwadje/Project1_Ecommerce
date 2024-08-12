package ecommerce.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page 
{
		WebDriver driver;
		
		
		@FindBy(id="nav-link-accountList-nav-line-1")
		WebElement signin_click_home;
		
		@FindBy(name="email")
		WebElement mobilenumber;
		
		@FindBy(id="continue")
		WebElement continue_button;
		
		@FindBy(id="ap_password")
		WebElement password;
		
		@FindBy(id="signInSubmit")
		WebElement signin;
		
		public void signinclickhome() {
			signin_click_home.click();
		}
		public void un()
		{
			mobilenumber.sendKeys("+917507493834");
		}
		public void invalidun()
		{
			mobilenumber.sendKeys("+9175074938");
		}
		public void Continue_button_Method()
		{
			continue_button.click();
		}
		public void pwd()
		{
			password.sendKeys("King789#");
		}	
		public void Signin()
		{
			signin.click();
		}
		
		public Amazon_Login_Page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

	}
