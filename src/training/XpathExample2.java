package training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;



public class XpathExample2 {

	
public static void register(WebDriver driver) {
	/*public static void launchBrowser(WebDriver driver) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();*/
		
	System.out.println("Heyaaaaaaaaaaaaaaaaa!");
	
	try {
				
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Saswati");
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input[name*='pho']")).sendKeys("8895871550");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("saswatibprkp@gmail.com");	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
		}
}