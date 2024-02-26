package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRelativeLocatorLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("prasadst123@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

	}

}
