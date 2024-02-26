package Demo.Demo123;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoTestAnnotations {
	
	
	@AfterMethod
	public void method3()
	{
		System.out.println("After Method");
	}
	
	
	@BeforeMethod
	public void method4()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void zethod1()
	{
		System.out.println("Method 1");
	}
	
	
	@Test
	public void method2()
	{
		System.out.println("Method 2");
	}

}
