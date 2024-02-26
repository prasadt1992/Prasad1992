package Demo.Demo123;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment142 {
	
	@Test
	public void method1()
	{
		System.out.println("Test without invocation");
	}
	@Test
	public void method2()
	{
		System.out.println("Test without invocation");
	}
	@Test(invocationCount=11)
	public void method3()
	{
		System.out.println("Test with invocation");
	}
	@Test
	public void method4()
	{
		System.out.println("Test without invocation");
	}
	
	@BeforeMethod
	public void method5()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void method6()
	{
		System.out.println("After Method");
	}


}
