package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}

}
