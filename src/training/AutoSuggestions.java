package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.name("fromPlaceName")).sendKeys("benga");
		driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.DOWN);
		
		JavaScriptExecutor js = (JavaScriptExecutor)driver;
		
			
		
	}

}
