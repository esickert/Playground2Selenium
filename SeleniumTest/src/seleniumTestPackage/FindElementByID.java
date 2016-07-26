package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByID extends MoreSeleniumTestClass{
	
	public void openWebsite()	{
		WebDriver patricia = new FirefoxDriver();
		patricia.get("http://www.google.com");
		WebElement searchBox = patricia.findElement(By.id("lst-ib")); //By.id method to find Google search box
		Sleep(5);
		searchBox.sendKeys("apple");
		Sleep(5);
		searchBox.submit();
		Sleep(5);
		patricia.navigate().to("http://www.bing.com");
		Sleep(5);
		patricia.quit();
		System.out.println("That's all folks!!!");
	}
}
