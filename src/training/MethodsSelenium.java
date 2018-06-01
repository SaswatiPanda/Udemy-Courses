package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MethodsSelenium {
	public static void main(String[] args) 
	{
		try
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		System.out.println("When the element is not visible");
		Thread.sleep(2000);
		Actions act1= new Actions(driver);
		act1.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed()); // true
		System.out.println("When the element is visible");
		driver.findElement(By.xpath("//*[@id='multicity']/label")).click(); 
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed()); //false
				
		int count= driver.findElements(By.xpath(".//*[@id='searchn']")).size();
		System.out.println(driver.findElement(By.xpath("//*[@id='hp-banner']/div[1]/div/div[7]/div/section/h4/b[1]")).getText());
		
if(count==0)
{
	System.out.println("Verified");
}
	
		driver.close();
		}
catch(Exception e)
{
	System.out.println(e);
}
		
}
}