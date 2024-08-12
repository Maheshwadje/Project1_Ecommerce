package ecommerce.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Search_Result_Page 
{
WebDriver driver;
	
	@FindBy(linkText="Men's Running Shoes")
	WebElement Category1;
	
	@FindBy(linkText="Men's Sneakers")
	WebElement Category2;
	
	@FindBy(linkText="Men's Walking Shoes")
	WebElement Category3;
	
	@FindBy(linkText="Men's Formal Shoes")
	WebElement Category4;
	
	@FindBy(linkText="Women's Sneakers")
	WebElement Category5;
	
	@FindBy(linkText="Women's Running Shoes")
	WebElement Category6;
	
	@FindBy(linkText="Boys' Sports & Outdoor Shoes")
	WebElement Category7;
	
	@FindBy(linkText="Girls' Sports & Outdoor Shoes")
	WebElement Category8;
	
	@FindBy(linkText="Boys' Casual Shoes")
	WebElement Category9;
	
	@FindBy(linkText="Men's Sneakers")
	WebElement Category10;
	
	@FindBy(linkText="Women's Casual Shoes")
	WebElement Category11;
	
	@FindBy(linkText="Men's Casual Shoes")
	WebElement Category12;
	
	@FindBy(linkText="Girls' Casual Shoes")
	WebElement Category13;
	
	@FindBy(linkText="Any Department")
	WebElement Return_Search_Page;
	
	public void Category1()
	{
		Category1.click();
	}
	public void Category2()
	{
		Category2.click();
	}
	public void Category3()
	{
		Category3.click();
	}
	public void Category4()
	{
		Category4.click();
	}
	public void Category5()
	{
		Category5.click();
	}
	public void Category6()
	{
		Category6.click();
	}
	public void Category7()
	{
		Category7.click();
	}
	public void Category8()
	{
		Category8.click();
	}
	public void Category9()
	{
		Category9.click();
	}
	public void Category10()
	{
		Category10.click();
	}
	public void Category11()
	{
		Category11.click();
	}
	public void Category12()
	{
		Category12.click();
	}
	public void Category13()
	{
		Category13.click();
	}
	public void Return_Search_Page_Method()
	{
		Return_Search_Page.click();
	}
	@FindBy(xpath = "//span[normalize-space()='Mens Sx0675g Walking Shoe']")
	WebElement selectShoe;
	
	public void selectProduct() {
		selectShoe.click();
	}
	//sorting 
	@FindBy(name = "s")
	WebElement sort;
	
	public void selectRelevance() {
		Select selectRelevance = new Select(sort);
		selectRelevance.selectByValue("date-desc-rank");
	}
	
	public void selectPrice() {
		Select selectPrice = new Select(sort);
		selectPrice.selectByVisibleText("Price: Low to High"); 
	}
	
	public void selectRating() {
		Select selectRating = new Select(sort);
		selectRating.selectByVisibleText("Avg. Customer Review"); 
	}
	public Amazon_Search_Result_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
