package ecommerce.Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page 
{
	WebDriver driver;
	
	//hover over signin
	@FindBy(xpath = "//a[@data-nav-role='signin']")
	WebElement accountAndList;

	public void accountAndList(WebDriver driver) 
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(accountAndList).perform();
	}
	//click on manage profile
	@FindBy(xpath = "//span[.='Manage Profiles']")
	WebElement manageProfile;

	public void manageProfile() {
		manageProfile.click();
	}
	//click on start here
	@FindBy(xpath = "(//a[@class='nav-a'][normalize-space()='Start here.'])[1]")
	WebElement startHere;

	public void register() {
		startHere.click();
	}
	//search a product
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") 
	WebElement search;
	public void search_shoes() 
	{
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
	}
	//accounts option click
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") 
	WebElement Account_click;
	public void Accounts_Page()
	{
		Account_click.click();;
	}
	//click on search button
	@FindBy(id="nav-search-submit-button")
	WebElement search_enter;
	public void search_btn_click()
	{
		search_enter.click();
	}	
	@FindBy(xpath = "//a[@id='nav-orders']")
	WebElement returnsAndOrders;

	public void returnsAndOrders() {
		returnsAndOrders.click();
	}
	
	public Amazon_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
