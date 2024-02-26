package Demo.Demo123;

import org.testng.annotations.Test;

public class EnabledDemo {
	
	@Test(enabled=true,invocationCount=11)
	public void add()
	{
		System.out.println("Method with using enable parameter set as true");
	}
	
	@Test(enabled=false)
	public void sub()
	{
		System.out.println("Method without using enable parameter");
	}
	
	
	
	

}
