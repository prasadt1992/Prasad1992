package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

}
