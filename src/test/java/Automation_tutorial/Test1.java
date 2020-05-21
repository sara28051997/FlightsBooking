package Automation_tutorial;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Test1 extends Baseclass{
	
    @Test
	public void func1() throws InterruptedException {
	      pg1.fromcity();
	      pg1.tocity();
	      pg1.departure();
	      pg1.returndate();
	      pg1.travellercount();
	      pg1.searchbutton();
	      pg1.backbutton();
	      pg1.trainbutton();
	      pg1.morebutton();
	      pg1.nationbutton();
	}
	
	
}
