package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(search);
		List<WebElement> value= s1.getOptions();
		for(WebElement e:value)
		{
			System.out.println(e.getText());
		}
		
		

	}

}
