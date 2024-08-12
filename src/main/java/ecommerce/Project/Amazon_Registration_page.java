package ecommerce.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Registration_page 
{
	WebDriver driver;
	
	//Enter mobile number
	@FindBy(name="email") WebElement mobilenumber;
	
	//first name
	@FindBy(name = "customerName") WebElement first_name;
	
	//Password 
	@FindBy(name = "password") WebElement password;
	
	//click on verify your mobile number button
	@FindBy(id = "continue") WebElement Verify_mobilenumber_button;
	
	public void un()
	{
		mobilenumber.sendKeys("7798918734");
	}
	public void firstname()
	{
		first_name.sendKeys("Sambhaji Wadje");
	}
	public void pwd()
	{
		password.sendKeys("Always_Happy@123");
	}
	public void verify_mno_btn()
	{
		Verify_mobilenumber_button.click();
	}
	public Amazon_Registration_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
