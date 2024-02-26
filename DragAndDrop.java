package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.id("drag2"));
		WebElement drop=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(5000);
		WebElement dragrev=driver.findElement(By.id("div2"));
		WebElement droprev=driver.findElement(By.id("div1"));
		a1.dragAndDrop(dragrev, droprev).perform();
		
		
		
		

	}

}


