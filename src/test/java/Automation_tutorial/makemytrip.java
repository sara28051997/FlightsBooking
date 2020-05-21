package Automation_tutorial;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class makemytrip {
	
	WebDriver driver;
	JavascriptExecutor js;
	ExtentTest test;
	
	@FindBy(xpath="//label[@for='fromCity']")
    WebElement from;
    
    @FindBy(xpath="//label[@for='toCity']")
    WebElement to;
    
    @FindBy(xpath="//label[@for='departure']")
    WebElement depart;
    
    @FindBy(xpath="//span[text()='RETURN']")
    WebElement returns;
    
    @FindBy(xpath="//label[@for='travellers']")
    WebElement count;
    
    @FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
    WebElement button;
    
    @FindBy(xpath="//a[@class='fli_secondry_btn btn']")
    WebElement back;
    
    @FindBy(xpath="//span[@class='chNavIcon appendBottom2 chSprite chTrains']")
    WebElement train;
    
    @FindBy(xpath="//span[text()='More']")
    WebElement more;
    
    @FindBy(xpath="//li[@class='makeFlex hrtlCenter']")
    WebElement nation;
	
    public makemytrip(WebDriver driver, ExtentTest test)
    {
   	 this.driver = driver;
   	 this.test = test;
   	 PageFactory.initElements(driver, this);
    }
    
   public void fromcity() throws InterruptedException
   {
   	from.click();
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("tri");
   	test.log(LogStatus.INFO, "Entering data in source location");
   	Thread.sleep(2000);
   	WebElement e1 =  driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
   	String s1 = e1.getAttribute("innerHTML");
   	System.out.println(s1);
   	
   	List<WebElement> l1 = e1.findElements(By.tagName("li"));
   	for(WebElement element : l1)
   	{
   		String str = element.getText();
   		if(str.contains("Trivandrum"))
   		{
   			element.click();
   			Thread.sleep(2000);
   			System.out.println(str);
   			break;
   		}
   	}
   }
   
   public void tocity() throws InterruptedException
   {
   	js = (JavascriptExecutor)driver;
   	js.executeScript("arguments[0].click();", to);
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mum");
   	test.log(LogStatus.INFO, "Entering data in destination location");
   	Thread.sleep(2000);
   	WebElement e1 =  driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
   	String s1 = e1.getAttribute("innerHTML");
   	System.out.println(s1);
   	
   	List<WebElement> l1 = e1.findElements(By.tagName("li"));
   	for(WebElement element : l1)
   	{
   		String str = element.getText();
   		if(str.contains("Mumbai"))
   		{
   			element.click();
   			Thread.sleep(2000);
   			System.out.println(str);
   			break;
   		}
   	}
   }
   
   public void departure() throws InterruptedException
   {
   	depart.click();
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//div[@aria-label='Fri May 15 2020']//p[text()='15']")).click();
   	test.log(LogStatus.INFO, "Selecting departure data");
   	Thread.sleep(2000);
   }
   
   public void returndate() throws InterruptedException
   {
   	returns.click();
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//div[@aria-label='Sat May 30 2020']//p[text()='30']")).click();
   	test.log(LogStatus.INFO, "Selecting return date");
   	Thread.sleep(2000);
   }
   
   public void travellercount() throws InterruptedException
   {
   	count.click();
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
   	driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
   	driver.findElement(By.xpath("//li[@data-cy='infants-1']")).click();
   	driver.findElement(By.xpath("//li[@data-cy='travelClass-1']")).click();
   	test.log(LogStatus.INFO, "Selecting travellers count");
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click();
   	test.log(LogStatus.INFO, "Clicking apply button");
   	Thread.sleep(2000);
   }
   
   public void searchbutton() throws InterruptedException
   {
   	button.click();
   	test.log(LogStatus.INFO, "Clicking on search button");
   	Thread.sleep(2000);
   	test.log(LogStatus.PASS, "Search results found");
   }
   
   public void backbutton() throws InterruptedException
   {
   	back.click();
   	test.log(LogStatus.INFO, "Clicking on back button");
   	Thread.sleep(2000);
   }
   
   public void trainbutton() throws InterruptedException
   {
   	train.click();
   	test.log(LogStatus.INFO, "Clicking on the train button");
   	Thread.sleep(2000);
   }
   
   public void morebutton() throws InterruptedException
   {
   	Actions action = new Actions(driver);
   	action.moveToElement(more).perform();
   	Thread.sleep(2000);
   	driver.findElement(By.xpath(" //a[@data-cy='submenu_InternationalFlights']")).click();
   	test.log(LogStatus.INFO, "Clicking on more button");
   	Thread.sleep(2000);
   }
   
   public void nationbutton() throws InterruptedException
   {
   	nation.click();
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//span[text()='US']")).click();
   	test.log(LogStatus.INFO, "Clicking on nationality button");
   	Thread.sleep(2000);
   }
    
    
}
