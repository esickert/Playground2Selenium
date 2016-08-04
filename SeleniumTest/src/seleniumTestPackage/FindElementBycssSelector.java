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
	System.out.print("We are sleeping here befroe finding element ");
	toSleep(5);
	//******************************************************************************************
	WebElement link = steve.findElement(By.cssSelector("a[class='_Gs'][@id='fsl']/a[2]"));  //this doesn't work!!!!!!!!!!!!!!!!
	//******************************************************************************************
//	WebElement link = steve.findElement(By.xpath("//*[@id='fsl']/a[2]"));
//	WebElement link = steve.findElement(By.linkText("About"));
//	toSleep(5);
	link.click();
//	steve.quit();
	}
}