package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByClassName extends MoreSeleniumTestClass {
	
	public void findByClassName()	{
		WebDriver tracy = new FirefoxDriver();
		tracy.get("http://www.bing.com");
		toSleep(5);
		WebElement searchBox = tracy.findElement(By.className("b_searchbox")); //this checks by class (className).
//		WebElement searchBox = tracy.findElement(By.name("q")); //this is a test to check by name!!
		toSleep(5);
		searchBox.sendKeys("microsoft");
		toSleep(5);
//		searchBox.submit();
//		Sleep(5);
//		tracy.navigate().to("http://www.yahoo.com");
		toSleep(5);
		tracy.quit();
		System.out.println("okay...finding web element by class (className) works!!!");
	}
}
