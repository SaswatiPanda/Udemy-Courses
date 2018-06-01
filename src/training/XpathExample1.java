 package training;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class XpathExample1 {
	
	public static WebDriver driver= null;
	public static void launchBrowser(WebDriver driver) throws Exception
	{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver.get("https://google.com/");
	
	/*System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());*/
		
		//driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Wonder Woman");
		//driver.findElement(By.xpath("//*[@id='sf']/button")).click();
		
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//driver.navigate().back();
	// driver.navigate().forward();
	
	
	driver.findElement(By.cssSelector("#email")).sendKeys("saswatibprkp@gmail.com");
	driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("ncs.dbms.iter");
	driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
	Thread.sleep(9000);
Actions act1= new Actions(driver);
act1.sendKeys(Keys.ESCAPE).build().perform();

		driver.findElement(By.xpath("//*[@id=\'u_ps_0_7_0\']")).click();
		driver.close(); 
	}
}
