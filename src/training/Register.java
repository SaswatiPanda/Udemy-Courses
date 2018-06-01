package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Register {
	static WebDriver driver=null;
	
	@Test
	@Parameters("browser")
	
public static void registerontheapplication(String browserName)

{
	CrossBrowser.Driver(browserName,driver);
	driver=CrossBrowser.Driver(browserName,driver);
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Saswati");
	driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Panda");
	driver.findElement(By.cssSelector("input[name*='pho']")).sendKeys("8895871550");
	driver.findElement(By.cssSelector("input#userName")).sendKeys("saswatibprkp@gmail.com");	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	XpathExample2.register(driver);
	
	
	driver.quit();

}
	

}
