package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSelectBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("url")).click();
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("url")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("url")).sendKeys("Software");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
