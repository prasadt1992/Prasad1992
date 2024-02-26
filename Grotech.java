package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Prasad Tadasad");
		Thread.sleep(3000);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		
		
		
		
		
		
		

	}

}
