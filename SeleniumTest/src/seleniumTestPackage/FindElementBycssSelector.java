package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FindElementBycssSelector extends MoreSeleniumTestClass		{
/*
 * you did it again, remember that the class needs a defined method BONER!!
 * Note: this works but more understanding on cssSelectors is needed!!	
 */
	public void findBycssSelector() {
	WebDriver steve = new FirefoxDriver();
	steve.get("http://www.google.com");
	System.out.print("We are sleeping here befroe finding element ");
	toSleep(5);
	//******************************************************************************************
//	WebElement link = steve.findElement(By.cssSelector("a[class='_Gs']"));  //this works but i don't know how this opens drop up menu
	
//	<a class="_Gs" href="//www.google.com/intl/en/policies/terms/?fg=1">Terms</a> //html code for below
	WebElement link = steve.findElement(By.cssSelector("#fsr > a:nth-child(1)"));
	
	//******************************************************************************************

//	WebElement link = steve.findElement(By.xpath("//*[@id='fsl']/a[2]"));
//	WebElement link = steve.findElement(By.linkText("About"));
	toSleep(5);
	link.click(); //once the link is found it needs to be clicked on.
	System.out.println("Successfully open google privacy page via link");
//	steve.quit();
	}
}