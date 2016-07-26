package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class FindElementByTagName extends MoreSeleniumTestClass	 {
	
	public void findByTagName()	{
		WebDriver tracy = new FirefoxDriver();
		tracy.get("http://www.google.com");
		WebElement searchBox = tracy.findElements(By.tagName("q")); //??????????????????
		Sleep(5);
		searchBox.sendKeys("microsoft");
		Sleep(5);
		searchBox.submit();
		Sleep(5);
		tracy.navigate().to("http://www.bing.com");
		Sleep(5);
		tracy.quit();
		System.out.println("That's all folks!!!");
	}
}
