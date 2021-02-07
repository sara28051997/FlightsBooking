package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;

public class fourthtestngfile {
  
	WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarath Nithyananthan\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
      driver.manage().window().maximize();
  }

  @Test
  public void f() throws InterruptedException {
	  WebElement date = driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']"));
	  date.click();
	  Thread.sleep(3000);
	  date.findElement(By.xpath("//a[@class='k-link k-nav-next']"));
	  date.click();
	  Thread.sleep(3000);
	  date.findElement(By.xpath("//a[@class='k-link k-nav-prev']"));
	  date.click();
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
