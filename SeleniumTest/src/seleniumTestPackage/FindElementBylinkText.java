package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FindElementBylinkText extends MoreSeleniumTestClass	{
/**
 * this class will find an element by the text of a link. This works!! Play with this more!!	
 */
	public void findByLinkText()	{
		
		WebDriver bill = new FirefoxDriver();
		bill.get("http://www.google.com");
		WebElement aboutLink = bill.findElement(By.linkText("Gmail"));
		toSleep(5);
		aboutLink.click();  // click() is an action method on aboutLink which is element "mail"
		toSleep(5);
		bill.quit();
		
	}
}


