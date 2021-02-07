package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class firsttestngfile {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
  
	@BeforeSuite
	  public void beforesuite() {
			System.out.println("beforesuite is executed");
		}
	
	@BeforeTest
    public void launchBrowser() throws InterruptedException {
        System.out.println("launching edge browser"); 
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sarath Nithyananthan\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
        report = new ExtentReports("C:\\Users\\Sarath Nithyananthan\\Desktop\\Interview.html");
        test = report.startTest("Auto Test starts");
        driver.get(baseUrl);
        test.log(LogStatus.INFO, "Browser is openend");
        driver.manage().window().maximize();
        test.log(LogStatus.INFO, "Browser is maximized");
        Thread.sleep(3000);
	}

	
	@BeforeMethod
  public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        test.log(LogStatus.PASS, "title is equal");
	}
	
	@BeforeClass
	  public void beforeclass() {
			System.out.println("beforeclass is executed");
		}
	
	 @Test
     public void register(){
         driver.findElement(By.linkText("REGISTER")).click() ;
         test.log(LogStatus.INFO, "register is clicked");
         String expected = "Register: Mercury Tours";
         String actual = driver.getTitle();
         Assert.assertEquals(actual, expected);
	 }
	 
	 @Test
     public void support() {
           driver.findElement(By.linkText("SUPPORT")).click() ;
           test.log(LogStatus.INFO, "support is clicked");
          String expected = "Under Construction: Mercury Tours";
          String actual = driver.getTitle();
           Assert.assertEquals(actual, expected);
     }
	 
	 @AfterMethod
     public void goBackToHomepage ( ) {
           driver.findElement(By.linkText("Home")).click() ;
           test.log(LogStatus.INFO, "home is clicked");
     }
	 
	 @AfterClass
	  public void afterclass() {
			System.out.println("afterclass is executed");
		}
	
	 @AfterSuite
 	  public void aftersuite() {
 			System.out.println("aftersuite is executed");
 		}
	 
	@AfterTest
    public void terminateBrowser(){
        driver.close();
        test.log(LogStatus.INFO, "Browsser is closed");
        report.endTest(test);
		report.flush();
    }
}
