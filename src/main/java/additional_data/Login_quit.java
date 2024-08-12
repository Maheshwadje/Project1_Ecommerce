package additional_data;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Login_quit
{
	protected WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void launch(String nameofbrowser)
	{
		if(nameofbrowser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
//		if(nameofbrowser.equalsIgnoreCase("edge"))
//		{
//			driver = new EdgeDriver();
//		}
//		if(nameofbrowser.equalsIgnoreCase("mozzila"))
//		{
//			driver = new FirefoxDriver();
//		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
