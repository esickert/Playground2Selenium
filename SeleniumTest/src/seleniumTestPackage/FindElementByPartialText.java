package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByPartialText extends MoreSeleniumTestClass {
	
	public void findByPartialText()	{
		
		int num = 3;
		
		WebDriver mary = new FirefoxDriver();
		mary.get("http://www.yahoo.com");
		System.out.println("Successfully opened Yahoo");

//		WebElement findElement = mary.findElement(By.partialLinkText("Ma")); //okay this worked for partial
    	WebElement findElement = mary.findElement(By.partialLinkText("Tum")); //okay this works also. tumblr is a link on Yahoo.
		toSleep(num);
		findElement.click();
		toSleep(num);
		mary.quit();
		System.out.println(dateTime() + " Successfully located webElement 'tumblr' by partialLinkText() in yahoo");
		
	}
}
