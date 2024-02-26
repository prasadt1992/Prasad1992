package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonShoeSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		List<WebElement> result=driver.findElements(By.xpath("//div[@class=\"a-section aok-relative s-image-tall-aspect\"]"));
		Thread.sleep(5000);
		result.get(30).click();
		Thread.sleep(5000);	
		Set<String> window=driver.getWindowHandles();
		System.out.println(window);
		Iterator<String> shoeid= window.iterator();
		String pid=shoeid.next();
		String cid=shoeid.next();
		driver.switchTo().window(cid);
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
		

	}

}
