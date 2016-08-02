package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FindElementByxpath	extends MoreSeleniumTestClass	{
/**
 * Major fuckup. you only have one main in the setup, screwhead!!
 */
	public void findByxpath()	{
		WebDriver kevin = new FirefoxDriver();
		kevin.get("http://www.google.com");
		toSleep(5);
		kevin.quit();
	}
}
