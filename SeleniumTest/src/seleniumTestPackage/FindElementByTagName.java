package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.*;

public class FindElementByTagName extends MoreSeleniumTestClass	 {
	
	/** So this does work but is too generalized. The issue has to do with tags names. I don't fully understand selenium websearch by tags!!!!
	 * html syntax of tags: <tag>   something   <tag>
	 */
	
	public void findByTagName()	{
		WebDriver tracy = new FirefoxDriver();
		tracy.get("http://www.google.com");
//		WebElement searchBox = tracy.findElement(By.tagName("input"));
		List<WebElement> searchBox = tracy.findElements(By.tagName("input")); //NOTE this is using LIST 
		int temp = 0;
		for(int i = 0; i <= searchBox.size() -1; i++)	{
			System.out.println(searchBox.get(i));
			temp = temp + i;
		}
		System.out.println();
		
		System.out.println(searchBox.get(3) + " tag number " + 3 + " on the page.");
		toSleep(5);

//		searchBox.sendKeys("microsoft"); //searchBox is a List of WebElements!!!!!
		toSleep(5);
//		searchBox.submit();  //searchBox is a List of WebElements
		toSleep(5);
		tracy.navigate().to("http://www.bing.com");  //using navigate() instead of get()
		toSleep(5);
		tracy.quit();
		System.out.println(dateTime() + " Successfully used findElement(By.tagName())");
		System.out.println("tags define the html line. HTML tags describe different document content");
		toSleep(5);
	}
}
