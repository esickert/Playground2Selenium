package seleniumTestPackage;

import org.openqa.selenium.firefox.*; // import necessary Webdriver classes
import org.openqa.selenium.WebDriver; // import necessary Webdriver classes

public class MoreSeleniumTestClass	{
	
	public void Sleep(int num)	{
		for(int i = 1; i <= num; i++)	{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)	{
				System.err.println("ERROR");
			}
			System.out.print(i + " ");
			System.out.println();
		}
	}
	
	public void setWindowSize(WebDriver stuff)	{
		stuff.manage().window().maximize();
		
	}
}			



