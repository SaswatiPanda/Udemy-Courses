package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdowns {

	public static WebDriver driver= null;
	public static void launchBrowser(WebDriver driver) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[text()=' Kolkata (CCU)']")).click();
		
		//driver.findElement(By.xpath(".//a[@value='SXR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()=' Delhi (DEL)'])[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		//driver.findElement(By.xpath("(//*[text()='12'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='24']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='28'])[2]")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("KO");
		
		//driver.findElement(By.linkText("Kolkata (CCU)"));
		//driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[3]/a")).click();
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		Thread.sleep(2000);
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s1.selectByValue("INR");
		System.out.println(s1.getFirstSelectedOption());
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);
		driver.quit();
		driver.close();
	}
	
}
