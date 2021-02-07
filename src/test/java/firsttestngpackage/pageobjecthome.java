package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjecthome {
WebDriver driver;
	
 // @FindBy(xpath="//table//tr[@class='heading3']")
  @FindBy(xpath="//table[@class='layout']/tbody/tr/td/table//tr[3]/td")
  WebElement hometext;

	public pageobjecthome(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String hometext()
	{
		String text = hometext.getText();
		return text;
	}
}
