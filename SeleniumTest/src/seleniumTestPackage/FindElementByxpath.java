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
		
		int num = 3;
		
		WebDriver kevin = new FirefoxDriver();
		kevin.get("http://www.google.com");
		toSleep(num);
		//the following will find the "mail" button in google page using xpath (xml)
//		WebElement link = kevin.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a"));//errored with
		//following is the 
		WebElement mail = kevin.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		//double quotes needed single quotes. This is firefox not chrome

		toSleep(num);
		System.out.println("The button is " + mail.getText());
		toSleep(num);
		mail.click();
		System.out.println(dateTime() + " Successfully opened by By.xpath");
		toSleep(num);
		kevin.quit();
		System.out.println(dateTime() + " Successfully found element by By.xpath() in Google"); 
	}
}
