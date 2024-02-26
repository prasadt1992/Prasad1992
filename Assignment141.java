package Demo.Demo123;

import org.testng.annotations.Test;

public class Assignment141 {
	
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

}
