package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByPartialText extends MoreSeleniumTestClass {
	
	public void findByPartialText()	{
		
		WebDriver mary = new FirefoxDriver();
		mary.get("http://www.yahoo.com");

//		WebElement findElement = mary.findElement(By.partialLinkText("Ma")); //okay this worked for partial
    	WebElement findElement = mary.findElement(By.partialLinkText("Tum")); //okay this works also. tumblr is a link on Yahoo.
		toSleep(5);
		findElement.click();
		toSleep(5);
		mary.quit();
		System.out.println("okay this works with whole text. now to find partial text");
		
	}
}
