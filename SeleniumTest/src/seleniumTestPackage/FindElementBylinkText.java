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
		
		int num = 3;
		
		WebDriver bill = new FirefoxDriver();
		bill.get("http://www.google.com");
		toSleep(num);
		WebElement aboutLink = bill.findElement(By.linkText("About"));
		toSleep(num);
		aboutLink.click();  // click() is an action method on aboutLink which is element "mail"
		toSleep(num);
		bill.quit();
		System.out.println(dateTime() + " Successfully used findElement(By.linkText())");
		
	}
}


