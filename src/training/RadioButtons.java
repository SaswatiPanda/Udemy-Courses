package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {


		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Winy\\eclipse-workspace\\Selenium Automation\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("http://www.echoecho.com/htmlforms10.htm");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@value='Milk']")).click();
			System.out.println("This is group1 value");
			
			
			int count = driver.findElements(By.xpath("//input[@name='group2']")).size();
			for(int i=0;i<count;i++)
			{
				//driver.findElements(By.xpath("//input[@value='group2']")).get(i).click();
			
			String text= driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value");
			if (text.equals("Water"))
			{
				driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
				System.out.println("This is group2 value");
			}
			}
			Thread.sleep(2000);
			driver.quit();
	

}
}
