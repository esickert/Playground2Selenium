package seleniumTestPackage; 		         //name of the package in which class files are stored

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
		MoreSeleniumTestClass stuff = new MoreSeleniumTestClass(); 
		
		driver.get("http://www.yahoo.com");
		stuff.Sleep(5);
		stuff.setWindowSize(driver);
		stuff.Sleep(5);
		stuff.resizeWindow(driver);
		stuff.Sleep(10);
		
//		WebElement searchBox = driver.findElement(By.name("q")); //WebElement class needs to be imported ... see above
//		WebElement searchBox = driver.findElement(By.id("uh-search-box")); //finding WebElement by id, yahoo search box using firebug
		WebElement searchBox = driver.findElement(By.name("p")); //finding WebElement by name, yahoo search box (using firebug)
		searchBox.sendKeys("Microsoft");
		stuff.Sleep(10);
		searchBox.submit();
		stuff.Sleep(10);
		
		
		driver.quit();

	}

}
//cloned from Github. Coding is now in moreSeleniumCode branch