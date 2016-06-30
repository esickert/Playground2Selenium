package seleniumTestPackage; 		  //name of the package in which class files are stored

import org.openqa.selenium.firefox.*; // import necessary Webdriver classes
import org.openqa.selenium.WebDriver; // import necessary Webdriver classes

public class SeleniumTest {  				  //class declaration

	public static void main(String[] args) {  //start of the main method
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver(); // implementation is done 
												// in 2 classes: RemoteWebDriver and 
												// HtmlUnitDriver. Firefox driver is a 
												// subclass of RemoteWebDriverClass.
		MoreSeleniumTestClass stuff = new MoreSeleniumTestClass(); 
		
		driver.get("http://www.bing.com");
		stuff.Sleep(5);
		stuff.setWindowSize(driver);
		stuff.Sleep(5);
		stuff.resizeWindow(driver);
		
		
		driver.quit();

	}

}
//cloned from Github. Coding is now in moreSeleniumCode branch