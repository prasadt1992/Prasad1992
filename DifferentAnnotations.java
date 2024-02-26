package Demo.Demo123;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnnotations {
	
	
	@Test
	public void method1()
	{
		System.out.println("Test");
	}
	
	@BeforeMethod
	public void method2()
	{
		System.out.println("Before method");
	}
	
	@BeforeClass
	public void method3()
	{
		System.out.println("Before Class");
	}
	
	@BeforeSuite
	public void method4()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void method5()
	{
		System.out.println("Before Test");
	}
	
	@AfterMethod
	public void method12()
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void method13()
	{
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void method14()
	{
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void method15()
	{
		System.out.println("After Test");
	}

}
