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
		WebElement findElement = mary.findElement(By.partialLinkText("Tumblr"));
		Sleep(5);
		findElement.click();
		Sleep(5);
		mary.quit();
		System.out.println("okay this works with whole text. now to find partial text");
		
	}
}
