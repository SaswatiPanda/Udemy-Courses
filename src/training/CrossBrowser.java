package training;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowser {
	static WebDriver driver;
	
	public static  WebDriver Driver(String browserName, WebDriver driver)
	{
		if(browserName=="IE")
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		return driver ;
}

}
