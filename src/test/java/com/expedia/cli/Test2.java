package com.expedia.cli;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Test2 {
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("runs before class");
	}
	
	@AfterClass
	public void cleanUp()
	{
		System.out.println("runs after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nruns before every method for demo_class2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nruns after every method for demo_class2");
	}
	
	@Test(priority=2)
	public void func1() {
		System.out.println("running the test1 for demo_class2");
	}
	
	@Test(priority=1)
	public void func2() {
		System.out.println("running the test2 for demo_class2");
	}
	
	@Test(priority=0)
	public void func3() {
		System.out.println("running the test3 for demo_class2");
	}

	

}
