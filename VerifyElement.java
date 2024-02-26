package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		WebElement a1=driver.findElement(By.name("fname"));
		boolean disp=a1.isDisplayed();
		
		

	}

}
