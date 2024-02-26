package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechMindRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("FirstName")).sendKeys("Prasad");
		driver.findElement(By.id("LastName")).sendKeys("Tadasad");
		driver.findElement(By.id("male")).click();
		/*WebElement skills=driver.findElement(By.id("Skills"));
		skills.click();
		Select s1=new Select(skills);
		s1.selectByIndex(1);
		WebElement country=driver.findElement(By.id("Country"));
		country.click();
		Select s2=new Select(country);
		s2.selectByVisibleText("India");*/
		driver.findElement(By.className("select2-selection__arrow")).click();
		WebElement select=driver.findElement(By.className("select2-search__field"));
		select.sendKeys("Tech");
		select.sendKeys(Keys.ENTER);
		
		

	}

}
