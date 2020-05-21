package Automation_tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class holidayact {
	
	WebDriver driver;
	
     @FindBy(id="primary-header-activity")
     WebElement holiday;
     
     @FindBy(xpath="//input[@data-station_code_element='activity-destination-alp-station_code']")
     WebElement dest;
     
     @FindBy(id="activity-start-alp")
     WebElement start;
     
     @FindBy(id="activity-end-alp")
     WebElement end;
     
     @FindBy(xpath="//button[@class='btn-primary btn-action gcw-submit']")
     WebElement search;
     
	
     public holidayact(WebDriver driver)
     {
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
     }
     
     public void holidaytab() throws InterruptedException
     {
    	 holiday.click();
    	 Thread.sleep(2000);
     }
     
     public void destination(String desti) throws InterruptedException
     {
    	 dest.sendKeys(desti);
    	 Thread.sleep(2000);
     }
     
     public void startdate(String sdate) throws InterruptedException
     {
    	 start.sendKeys(sdate);
    	 Thread.sleep(2000);
     }
     
     public void enddate(String ddate) throws InterruptedException
     {
    	 end.sendKeys(ddate);
    	 Thread.sleep(2000);
     }
     
     
     public boolean dispalyed()
     {
    	 boolean searchbut = search.isDisplayed();
    	 return searchbut;
     }
     
     public void searchbutton() throws InterruptedException
     {
    	 search.click();
    	 Thread.sleep(2000);
     }
}
