package Demo.Demo123;

import org.testng.annotations.Test;

public class Assignment143 {
	
	
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logout functionality");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login functionality");
	}
	
	@Test(priority=2)
	public void search()
	{
		System.out.println("search functionality");
	}
	
	

}
