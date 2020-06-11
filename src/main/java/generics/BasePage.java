package generics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public WebDriver driver;
	
	public void dropdownvisibleText(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void dropdownbyIndex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void dropdownValue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void movetoelementmouse(WebDriver driver,WebElement target)
	{
		
			Actions act=new Actions(driver);
			act.moveToElement(target);
	}
	public void popup(WebElement element)
	{
		Alert alt= driver.switchTo().alert();
		alt.accept();
	}
		
	

}
