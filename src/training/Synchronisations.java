package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisations {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
	driver.get("https://alaskatrips.poweredbygps.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.xpath("//*[@id='tab-hotel-tab']/span[1]")).click();
	System.out.println("Clicked on Hotels!!");

	WebDriverWait w1= new WebDriverWait(driver, 15);
	w1.until(ExpectedConditions.elementToBeClickable(By.id("hotel-destination")));
	
	driver.findElement(By.id("hotel-destination")).sendKeys("nyc",Keys.TAB);
	
	driver.findElement(By.id("hotel-checkin")).sendKeys(Keys.ENTER);
	
	WebDriverWait w= new WebDriverWait(driver,20);
	//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href='New-Rochelle-Hotels-Radisson-Hotel...')]")));
	w.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='17117062']/div[2]/div/a")));
	
	driver.findElement(By.xpath(".//*[@id='17117062']/div[2]/div/a")).click();
	
}
catch(Exception e)
{
	System.out.println(e);
}
	driver.close();
	
	}
	

}
