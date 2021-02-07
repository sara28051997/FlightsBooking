package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectlogin {
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	@FindBy(className="barone")
	WebElement logintext;
	
	@FindBy(linkText="Log out")
	WebElement logout;
	
	public pageobjectlogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void username(String uname)
	{
		user.sendKeys(uname);
	}
	
	public void password(String paswd)
	{
		pwd.sendKeys(paswd);
	}
	
	public void click()
	{
		login.click();
	}
	
	public String titletext()
	{
		String titletext = logintext.getText();
		return titletext;
	}
	
	public void allloginfunc(String username, String password)
	{
		username(username);
		password(password);
		click();
	}
	
	public void out()
	{
		logout.click();
	}
}
