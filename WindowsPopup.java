package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.id("Resume"));
		choosefile.sendKeys("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Test.txt");

	}

}
