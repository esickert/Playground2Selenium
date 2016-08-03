package seleniumTestPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FindElementByxpath	extends MoreSeleniumTestClass	{
/**
 * Major fuckup. you only have one main in the setup, screwhead!!
 */
	public void findByxpath()	{
		WebDriver kevin = new FirefoxDriver();
		kevin.get("http://www.google.com");
		toSleep(5);
		//the following will find the "mail" button in google page using xpath (xml)
//		WebElement link = kevin.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a"));//errored with 
		WebElement mail = kevin.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		//double quotes needed single quotes. This is firefox not chrome

		toSleep(5);
		System.out.println("The button is " + mail.getText());
		toSleep(5);
		mail.click();
		toSleep(5);
		kevin.quit();
		System.out.println("Okay this worked with xpath."); 
	}
}
