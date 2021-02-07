package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class thirdtestngfile {
  
	WebDriver driver;
	
	@BeforeTest(alwaysRun = true)
    public void launchBrowser() throws InterruptedException {
        Reporter.log("launching edge browser"); 
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Sarath Nithyananthan\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.google.co.in/");
        Reporter.log("website is opened");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	
	/*@Test(dataProvider="SearchProvider")
  public void login(String userid, String password) {
	    pageobjectlogin login = new pageobjectlogin(driver);
	    login.allloginfunc(userid, password);	
	    String title = login.titletext();
	    System.out.println(title);
	    login.out();
  }*/
	
	/*@Test		
	public void home()				
	{		
	    pageobjecthome home = new pageobjecthome(driver);
	    String hometitle = home.hometext();
	    System.out.println(hometitle);
	}*/	
	
	@Test(dataProvider="SearchProvider", groups="A")
	public void search(String order, String value) throws InterruptedException				
	{		
	    pageobjectgoogle google = new pageobjectgoogle(driver);
	    google.search(value);
	    System.out.println(order + " is " + "and the value is " + value );
	}
	
	@Test(dataProvider="SearchProvider", groups="B")
	public void search2(String order, String value) throws InterruptedException				
	{		
	    pageobjectgoogle google = new pageobjectgoogle(driver);
	    google.search(value);
	    System.out.println(order + " is " + "and the value is " + value );
	}
	
	@AfterTest(alwaysRun = true)
    public void terminateBrowser(){
        driver.close();
        
    }
	
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(ITestContext g){
		Object[][] grouparray = null;
		for(String groups : g.getIncludedGroups())
		{
			if(groups.equalsIgnoreCase("A"))
			{
				grouparray = new Object[][] 
					    	{
					            { "firstsearch", "india" },
					            { "secondsearch", "USA" },
					            { "thirdsearch", "UK" }
					        };
				break;	        
			}
			else
			{
				grouparray = new Object[][] 
				    	{
				            { "firstsearch", "chennai" },
				            { "secondsearch", "kerala" },
				            { "thirdsearch", "karnataka" }
				        };	
				    break;    
			}
		}
		return grouparray;

    }
}
