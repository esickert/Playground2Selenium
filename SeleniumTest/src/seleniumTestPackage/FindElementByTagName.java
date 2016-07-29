package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class FindElementByTagName extends MoreSeleniumTestClass	 {
	
	/** So this doesn't work. The issue has to do with tags names. I don't fully understand selenium websearch by tags!!!!
	 * html syntax of tags: <tag>   something   <tag>
	 */
	
	public void findByTagName()	{
		WebDriver tracy = new FirefoxDriver();
		tracy.get("http://www.google.com");
		List<WebElement> searchBox = tracy.findElements(By.tagName("input")); //NOTE this is using LIST 
		int temp = 0;
		for(int i = 0; i <= searchBox.size() -1; i++)	{
			System.out.println(searchBox.get(i));
			temp = temp + i;
		}
		System.out.println();
		int i = 3;
		System.out.println(searchBox.get(i) + " tag number " + i + " on the page.");
		Sleep(5);
//		searchBox.sendKeys("microsoft");
		Sleep(5);
//		searchBox.submit();
//		Sleep(5);
//		tracy.navigate().to("http://www.bing.com");
//		Sleep(5);
		tracy.quit();
		System.out.println("Success!! tags define the html line. HTML tags describe different document content");
	}
}
