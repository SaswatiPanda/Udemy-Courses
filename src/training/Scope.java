package training;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1. Links count on the page
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Count of the links in the footer section.
		
		WebElement footer = driver.findElement(By.id("gf-BIG")); //Limiting WebDriver scope
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//3. Count of links in the first column.
		
		WebElement col = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());
		
		//4. Click on each link and check if its opening.
		for(int i=0; i<col.findElements(By.tagName("a")).size();i++)
		{
			//String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			col.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			Thread.sleep(5000L);
		} // opens all the tabs
			
			Set<String> loop = driver.getWindowHandles();
			Iterator<String> it = loop.iterator();
			
			while(it.hasNext())
			{
				//it.next();
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
	}


