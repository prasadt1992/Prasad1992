package Demo.Demo123;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment140 {
	
	
	@Test
	public void add()
	{
		System.out.println("Test");
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("Before method");
	}
	
	@Test
	public void mul()
	{
		System.out.println("Test");
	}
	
	@Test
	public void div()
	{
		System.out.println("Test");
	}

}
