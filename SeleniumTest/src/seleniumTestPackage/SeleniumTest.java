package seleniumTestPackage; 		         //name of the package in which class files are stored

import java.util.*;

import org.openqa.selenium.firefox.*;        // import necessary Webdriver classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;        // import necessary Webdriver classes
import org.openqa.selenium.WebElement;       // need to import WebElement class to use it...see below.
//import org.openqa.selenium.Keys;

public class SeleniumTest	{  				 //class declaration

	public static void main(String[] args) { //start of the main method
		// TODO Auto-generated method stub
		
		
//		WebDriver samantha = new FirefoxDriver(); // implementation is done 
												// in 2 classes: RemoteWebDriver and 
												// HtmlUnitDriver. Firefox driver is a 
												// subclass of RemoteWebDriverClass.
//		List<WebDriver> driver2 = new ArrayList<WebDriver>(); //not sure syntax is correct!!
		FindElementByID cathy = new FindElementByID();  //instance of class FindElementByID
		FindElementByClassName susan = new FindElementByClassName();
		FindElementByTagName beth = new FindElementByTagName(); //this now works. better understanding of tags. there are mucho tags on a page
		FindElementBylinkText carl = new FindElementBylinkText();
		FindElementByPartialText bill = new FindElementByPartialText();
		FindElementByxpath larry = new FindElementByxpath();
		FindElementBycssSelector manu = new FindElementBycssSelector();
		MoreSeleniumTestClass stuff = new MoreSeleniumTestClass();
		
		cathy.findElementByID(); //FIND ELEMENT BY ID
		beth.findByTagName(); //this works but i don't fully grasp it!!. FIND ELEMENT BY TAG NAME, we can refine search via style?? i think.
		susan.findByClassName(); // FIND ELEMENT BY CLASSNAME
		carl.findByLinkText(); //FIND ELEMENT BY TEXT  
		bill.findByPartialText();

//		larry.findByxpath();  //this worked!!!
//		manu.findBycssSelector();
//		manu.findBycssSelector();
//		driver.get("http://www.duckduckgo.com");
//		driver.navigate().to("http://www.yahoo.com");// <Webdriver Instance>.navigate().to("www. ... .com")
//		samantha.get("http://www.google.com");
//		stuff.Sleep(5);
//		stuff.setWindowSize(driver);
//		stuff.Sleep(5);
//		stuff.resizeWindow(driver);
//		stuff.Sleep(5);
//****************************************************************************************
//		see page 20 - 24 in book		
//		WebElement searchBox = driver.findElement(By.name("q")); //WebElement class needs to be imported ... see above. (google searchbox)
//		**********************************************************************************	
//		WebElement searchBox = samantha.findElement(By.id("lst-ib")); //By.id method to find Google search box Used chrome
//		WebElement searchBox = driver.findElement(By.id("uh-search-box")); //finding WebElement by id, yahoo search box using firebug
//		WebElement searchBox = driver.findElement(By.name("p")); //finding WebElement by name, yahoo search box (using firebug using yahoo)
//		WebElement searchBox = driver.findElement(By.className("js-search-input")); //finding WebElement by className(using firefox on DuckDuckGo) 
//		WebElement searchBox = driver.findElements(By.className("js-search-input")); //don't know what's wrong here!!!!!!
//		**********************************************************************************
//	Locating the same element by different mechanisms. (same web element- google search box) 
//		WebElement searchBox = samantha.findElement(By.name("q"));
//		WebElement searchBox = samantha.findElement(By.className("gsfi"));
//****************************************************************************************		
/**		List<WebElement> input = samantha.findElements(By.tagName("input"));
		System.out.println("The inputs List size is: " + input.size());
		for (int i = 0; i <= input.size()-1; i++) {
			System.out.println(input.get(i));
		} **/
//		stuff.Sleep(5);
//		searchBox.sendKeys("Bing");
		//******************************************************************************************************
//		stuff.Sleep(5);
//		searchBox = samantha.findElement(By.className("l"));  //trying to locate "Google Search" button on Google page
//		stuff.Sleep(5);
//		searchBox.submit();
//		stuff.Sleep(5);
//		samantha.navigate().to("https://www.bing.com");
//		stuff.Sleep(5);
		
//		samantha.quit();
		System.out.println("That's all folks");

	}

}
