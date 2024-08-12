package ecommerce.Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Add_to_Cart_Page 
{
WebDriver driver;
	//select qty
	@FindBy(xpath = "//span[@class='a-button-text a-declarative']")
	WebElement select_qty;

	public void selectqty()
	{
		select_qty.click();
	}
	
	//click on remove product
	@FindBy(xpath = "//span[@class='a-button a-button-base a-button-small']")
	WebElement delete_product;
	public void delete_item()
	{
		delete_product.click();
	}
	
	@FindBy(xpath = "//span[@class='a-button a-spacing-top-base a-button-span12 a-button-base celwidget']")
	WebElement gotocart;
	public void goto_cart()
	{
		gotocart.click();
	}
	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceedToBuyButton;
	
	public void proceedToBuy() {
		proceedToBuyButton.click();
	}
	
	@FindBy(xpath = "//span[@id='sc-buy-box-ptc-button-announce']")
	WebElement Buy;
	public boolean Assert_tc15()
	{
		return Buy.isDisplayed();
	}
	
	public Amazon_Add_to_Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
