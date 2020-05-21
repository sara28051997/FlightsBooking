package com.expedia.cli;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Test3 {
	
	@BeforeClass(alwaysRun=true)
	public void setUp()
	{
		System.out.println("runs before class");
	}
	
	@AfterClass(alwaysRun=true)
	public void cleanUp()
	{
		System.out.println("runs after class");
	}
	
	@Test(groups= {"cars","suv"})
	public void func1() {
		System.out.println("running the test1 for audi");
	}
	
	@Test(groups= {"cars","sedan"})
	public void func2() {
		System.out.println("running the test2 for benz");
	}
	
	@Test(groups= {"bike"})
	public void func3() {
		System.out.println("running the test3 for honda");
	}

	

}
