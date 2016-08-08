package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByID extends MoreSeleniumTestClass{
	
	public void findElementByID()	{
		
		int num = 3;
		
		WebDriver patricia = new FirefoxDriver();
		patricia.get("http://www.yahoo.com");
		System.out.println(dateTime() + " Successfully opened Yahoo");
		WebElement searchBox = patricia.findElement(By.id("uh-search-box")); //By.id method to find Google search box
		toSleep(num);
		searchBox.sendKeys("comcast");
		toSleep(num);
		searchBox.submit();
		toSleep(num);
		patricia.navigate().to("http://www.bing.com");
		System.out.println(dateTime() + " Successfully opened Bing");
		toSleep(num);
		patricia.quit();
		System.out.println(dateTime() + " Successfully used findElement(By.id())");
		toSleep(num);
	}
}
