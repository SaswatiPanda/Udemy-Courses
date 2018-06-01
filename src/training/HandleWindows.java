package training;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Terms")).click();
		
		System.out.println(driver.getTitle());
		
		Set<String> ids= driver.getWindowHandles();
		
		Iterator<String> iterate = ids.iterator();
		String Parentid = iterate.next();
		String Childid = iterate.next();
		
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(Parentid);
		
		
		
		
	}

}
