package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertsExamples {
	
	public static void main(String[] args) 
	{
		try
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();  
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(2000);
		String a = driver.switchTo().alert().getText();
		
		System.out.println(a);
		driver.switchTo().alert().accept(); // Positive 
		//driver.switchTo().alert().dismiss(); //Negative
	}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}