package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByClassName extends MoreSeleniumTestClass {
	
	public void findByClassName()	{
		WebDriver tracy = new FirefoxDriver();
		tracy.get("http://www.bing.com");
		Sleep(5);
		WebElement searchBox = tracy.findElement(By.className("b_searchbox")); //??????????????????
		Sleep(5);
		searchBox.sendKeys("microsoft");
		Sleep(5);
//		searchBox.submit();
		Sleep(5);
		tracy.navigate().to("http://www.yahoo.com");
		Sleep(5);
		tracy.quit();
		System.out.println("Okay this worked!!!!. tagName still doesn't work");
	}
}
