package seleniumTestPackage;

import org.openqa.selenium.firefox.*; // import necessary Webdriver classes
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver; // import necessary Webdriver classes

public class MoreSeleniumTestClass	{
	
	public void toSleep(int num)	{
		for(int i = 1; i <= num; i++)	{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)	{
				System.err.println("ERROR");
			}
			System.out.print(i + " ");
//			System.out.println();
		}
	System.out.println();
	}
	
	public void setWindowSize(WebDriver stuff)	{
		stuff.manage().window().maximize();
	}
	
	public void resizeWindow(WebDriver stuff)	{
		Dimension size = new Dimension(900,600);	
		stuff.manage().window().setSize(size);
		System.out.println("Resized window");
	}
}			



