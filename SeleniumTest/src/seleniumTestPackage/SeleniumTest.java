package seleniumTestPackage; 		         //name of the package in which class files are stored

import java.util.*;

import org.openqa.selenium.firefox.*;        // import necessary Webdriver classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;        // import necessary Webdriver classes
import org.openqa.selenium.WebElement;       // need to import WebElement class to use it...see below.

public class SeleniumTest {  				 //class declaration

	public static void main(String[] args) { //start of the main method
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver(); // implementation is done 
												// in 2 classes: RemoteWebDriver and 
												// HtmlUnitDriver. Firefox driver is a 
												// subclass of RemoteWebDriverClass.
		List<WebDriver> driver2 = new ArrayList<WebDriver>(); //not sure syntax is correct!!
		MoreSeleniumTestClass stuff = new MoreSeleniumTestClass(); 
		
//		driver.get("http://www.duckduckgo.com");
//		driver.navigate().to("http://www.yahoo.com");// <Webdriver Instance>.navigate().to("www. ... .com")
		driver.get("http://www.google.com");
		stuff.Sleep(5);
//		stuff.setWindowSize(driver);
		stuff.Sleep(5);
//		stuff.resizeWindow(driver);
		stuff.Sleep(10);
//****************************************************************************************
//		see page 20 - 24 in book		
//		WebElement searchBox = driver.findElement(By.name("q")); //WebElement class needs to be imported ... see above. (google searchbox)
		WebElement searchBox = driver.findElement(By.id("lst-ib")); //By.id method to find Google search box Used crome
//		WebElement searchBox = driver.findElement(By.id("uh-search-box")); //finding WebElement by id, yahoo search box using firebug
//		WebElement searchBox = driver.findElement(By.name("p")); //finding WebElement by name, yahoo search box (using firebug using yahoo)
//		WebElement searchBox = driver.findElement(By.className("js-search-input")); //finding WebElement by className(using firefox on DuckDuckGo) 
//		WebElement searchBox = driver.findElements(By.className("js-search-input")); //don't know what's wrong here!!!!!!
		
//****************************************************************************************		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println("The buttons List size is: " + buttons.size());
		for (int i = 0; i <= buttons.size()-1; i++) {
			System.out.println(buttons.get(i));
		}
				
		searchBox.sendKeys("Microsoft");
		stuff.Sleep(5);
//		searchBox = driver.findElement(By.name("btnk"));  //trying to locate "Google Search" button on Google page
		searchBox.submit();
		stuff.Sleep(5);
		
		
		driver.quit();

	}

}
//cloned from Github. Coding is now in moreSeleniumCode branch... branch moreSeleniumCode merged with master