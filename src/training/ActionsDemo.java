package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args)
	{
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement element = driver.findElement((By.className("nav-line-1")));
		a.moveToElement(element).contextClick().build().perform(); 
		
		WebElement move= driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("arm chairs").doubleClick().build().perform();
		
		
	}
}
