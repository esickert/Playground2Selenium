package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElementByID {
	
	WebDriver samantha = new FirefoxDriver();
	
	WebElement searchBox = samantha.findElement(By.id("lst-ib")); //By.id method to find Google search box Used chrome
}
