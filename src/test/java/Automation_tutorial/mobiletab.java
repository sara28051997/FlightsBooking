package Automation_tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobiletab {

	WebDriver driver;

	@FindBy(id = "primary-header-app")
	WebElement mobile;
	
	@FindBy(id ="header-trip-menu")
	WebElement manage;
	
	@FindBy(id="itineraries")
	WebElement iti;

	public mobiletab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void mobiletab() throws InterruptedException {
		mobile.click();
		Thread.sleep(2000);
	}
	
	public void managetab() throws InterruptedException {
		manage.click();
		Thread.sleep(2000);
	}
	
	public void itinear() throws InterruptedException {
		iti.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

}
