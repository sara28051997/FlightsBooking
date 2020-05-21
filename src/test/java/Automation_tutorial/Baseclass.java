package Automation_tutorial;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Baseclass {

	WebDriver driver;
	String baseurl;
	makemytrip pg1;
	ExtentReports report;
	ExtentTest test;
	private static final Logger log = LogManager.getLogger(Test1.class.getName());
	
	@BeforeClass
	public void setUp() {
		log.debug("Driver Initialization begins...");
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sarath Nithyananthan\\Downloads\\edgedriver_win32\\msedgedriver.exe" );
		driver = new EdgeDriver();
		report = new ExtentReports("C:\\Users\\Sarath Nithyananthan\\Desktop\\Auto_Report1.html");
		test = report.startTest("Auto Test starts");
		pg1 = new makemytrip(driver, test);
		baseurl = "https://www.makemytrip.com/";
		test.log(LogStatus.INFO, "Browser is started");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser is maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseurl);
		test.log(LogStatus.INFO, "Web application opened");
	}
	
	@AfterClass
	public void cleanUp() {
		log.debug("Testing completed");
		report.endTest(test);
		report.flush();
		driver.quit();
	}
}
