package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements Autoconstant 
{
	public WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(opera_key, opera_value);
		driver= new OperaDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	@AfterClass
	public void closeBrowser()
	{
		//driver.close();
	}

}
