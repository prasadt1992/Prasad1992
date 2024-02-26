package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("India");
		Thread.sleep(5000);
		List<WebElement> result=driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
		int element=result.size();
		System.out.println(element);
		result.get(4).click();
		

	}

}
