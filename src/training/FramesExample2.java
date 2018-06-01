package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample2 {

	public static void main(String[] args)
	{

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		int number = FramesUtility.find_Frames(driver, By.xpath("//a[contains(@href,'live-selenium-project')]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//a[contains(@href,'live-selenium-project')]")).click();
		driver.switchTo().defaultContent();
		
	}
}
	
	