package training;

import org.openqa.selenium.WebDriver;

public class TheMainClass {

	private static  WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//Driver.launchBrowser(WebDriver);
			
			//XpathExample1.launchBrowser(WebDriver);
			
			//XpathExample2.launchBrowser(Webdriver);
			
			DynamicDropdowns.launchBrowser(driver);
			
			
			
		
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
	}

}
