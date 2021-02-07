package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectgoogle {

	WebDriver driver;
	
	@FindBy(xpath="//input[@title='Search']")
	WebElement search;
	
	public pageobjectgoogle(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void search(String value) throws InterruptedException
	{
		search.sendKeys(value);
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
	}
	
}
