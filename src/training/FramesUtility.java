package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesUtility {

	public static int find_Frames(WebDriver driver, By by)
	{
		int i;
	
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for( i=0; i< framecount; i++)
		{
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
		
		if(count>0)
		{
			driver.findElement(by).click();
			break;
		}
		else {
		System.out.println(framecount);
		}
		}
		driver.switchTo().defaultContent();
		return i;
}




}
