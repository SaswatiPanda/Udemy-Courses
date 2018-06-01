package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		System.out.println("Choose the month");
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("March 2019"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			System.out.println("Month Selected!!");
		}
		
		List<WebElement> days = driver.findElements(By.cssSelector(".day"));
		int count= driver.findElements(By.cssSelector(".day")).size();
		
		for(int i= 0;i < count; i++)
		{
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("5"))
			{
				System.out.println("Choose the date!");
				driver.findElements(By.cssSelector(".day")).get(i).click();
				System.out.println("Date Selected!");
				break;
				
			}
		}
	}

}
