package seleniumTestPackage; 		         //name of the package in which class files are stored

//import java.util.*;

import org.openqa.selenium.firefox.*;        // import necessary Webdriver classes
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;        // import necessary Webdriver classes
//import org.openqa.selenium.WebElement;       // need to import WebElement class to use it...see below.
//import org.openqa.selenium.Keys;

public class SeleniumTest	{  				 //class declaration

	public static void main(String[] args) { //start of the main method
		// TODO Auto-generated method stub
		
		WebDriver samantha = new FirefoxDriver(); // implementation is done 
												// in 2 classes: RemoteWebDriver and 
												// HtmlUnitDriver. Firefox driver is a 
												// subclass of RemoteWebDriverClass.
//		List<WebDriver> driver2 = new ArrayList<WebDriver>(); //not sure syntax is correct!!
		FindElementByID cathy = new FindElementByID(samantha);  //instance of class FindElementByID
		FindElementByClassName susan = new FindElementByClassName(samantha);
//		FindElementByTagName beth = new FindElementByTagName(); //this now works. better understanding of tags. there are mucho tags on a page
//		FindElementBylinkText carl = new FindElementBylinkText();
//		FindElementByPartialText bill = new FindElementByPartialText();
//		FindElementByxpath larry = new FindElementByxpath();
//		FindElementBycssSelector manu = new FindElementBycssSelector();
//		MoreSeleniumTestClass stuff = new MoreSeleniumTestClass();
		
		cathy.findElementByID(); //FIND ELEMENT BY ID  //**************************BROKEN
//		beth.findByTagName(); //this works but i don't fully grasp it!!. FIND ELEMENT BY TAG NAME, we can refine search via style?? i think.
//		susan.findByClassName(); // FIND ELEMENT BY CLASSNAME  //*******************************BROKEN
//		carl.findByLinkText(); //FIND ELEMENT BY TEXT  
//		bill.findByPartialText();
//		larry.findByxpath();  //this worked!!!
//		manu.findBycssSelector();
		
		System.out.println("That's all folks");

	}

}
