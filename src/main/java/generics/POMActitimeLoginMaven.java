package generics;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeLoginMaven extends BasePage implements Autoconstant
{
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTextbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingsButton;
	
	@FindBy(xpath = "//a[contains(text(),'Types of Work')]")
	private WebElement typesofworkButton;
	
	@FindBy(xpath = "//span[contains(text(),'Create Type of Work')]")
	private WebElement creatework;
	
	@FindBy(id = "name")
	private WebElement entername;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createtypeofworkButton;
	
	@FindBy(xpath = "//a[contains(text(),'delete')]")
	private WebElement deleteButton;
	
	
	
	public POMActitimeLoginMaven(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginintoactitime() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValues(excelpath, sheetname, 0,0));
		passwordTextbox.sendKeys(ExcelLibrary.getCellValues(excelpath, sheetname, 0,1));
		loginButton.click();
	}
	public void creatework() throws InterruptedException
	{
		settingsButton.click();
		typesofworkButton.click();
		creatework.click();
		entername.sendKeys("suraj");
		createtypeofworkButton.click();
		Thread.sleep(8000);
		deleteButton.click();
		Thread.sleep(8000);
		//Alert alt= driver.switchTo().alert();
		//alt.accept();
		
		
		
		
	}
	

}
