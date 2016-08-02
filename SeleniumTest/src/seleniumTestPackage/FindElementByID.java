package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByID extends MoreSeleniumTestClass{
	
	public void findElementByID()	{
		WebDriver patricia = new FirefoxDriver();
		patricia.get("http://www.yahoo.com");
		WebElement searchBox = patricia.findElement(By.id("uh-search-box")); //By.id method to find Google search box
		toSleep(5);
		searchBox.sendKeys("comcast");
		toSleep(5);
		searchBox.submit();
		toSleep(5);
//		patricia.navigate().to("http://www.bing.com");
		toSleep(5);
		patricia.quit();
		System.out.println("That's all folks!!! finding web element by id works");
	}
}
