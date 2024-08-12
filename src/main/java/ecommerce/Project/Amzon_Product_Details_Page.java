package ecommerce.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amzon_Product_Details_Page 
{
	WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[1]") WebElement Shoe_click;
	@FindBy(xpath = "//input[@id=\"add-to-cart-button\"]") WebElement add_cart;	
	@FindBy(className = "softlines") WebElement Product_Description;
	@FindBy(xpath = ("//span[@class='a-price-whole'])[1]")) WebElement Price;
	@FindBy(linkText = (" Customer Reviews: ")) WebElement Reviews;
	
	public void shoe_click()
	{
		Shoe_click.click();
	}
	public void Add_To_Cart()
	{
		add_cart.click();
	}
	public boolean Product_Des()
	{
		return Product_Description.isDisplayed();
	}
	public boolean price()
	{
		return Price.isDisplayed();
	}
	public boolean Reviews()
	{
		return Reviews.isDisplayed();
	}
	
	@FindBy(xpath = "//span[.='Subtotal']")
	WebElement subtotal;
	
	public boolean assert_tc9()
	{
		return subtotal.isDisplayed();
	}
	public Amzon_Product_Details_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
