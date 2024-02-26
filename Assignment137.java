package Demo.Demo123;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment137 {
	
	
	@Test
	public void method1()
	{
		System.out.println("Test");
	}
	
	@BeforeClass
	public void method2()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void method3()
	{
		System.out.println("Before Method");
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

}
