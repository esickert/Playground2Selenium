package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FindElementBycssSelector extends MoreSeleniumTestClass		{
/*
 * you did it again, remember that the class needs a defined method BONER!!	
 */
	public void findBycssSelector() {
	WebDriver steve = new FirefoxDriver();
	steve.get("http://www.google.com");
	toSleep(7);
	steve.quit();
	}


}