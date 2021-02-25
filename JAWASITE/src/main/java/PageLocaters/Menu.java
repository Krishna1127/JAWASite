package PageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;

public class Menu extends BaseClass{

	
	public static WebElement Login=driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
	
	public static WebElement perak=driver.findElement(By.xpath("//div[@class='model-menu submenu__pad submenu__line']//a[1]//img[1]"));
	
	public static WebElement MenuTxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
	
	public static WebElement JAWA=driver.findElement(By.xpath("//div[@class='model-menu submenu__pad submenu__line']//a[2]//img[1]"));
	
	public static WebElement Fourtytwo=driver.findElement(By.xpath("//div[@class='model-menu submenu__pad submenu__line']//a[3]//img[1]"));
	
	public static WebElement BookTestride=driver.findElement(By.xpath("(//*[text()='Book a test ride'])[2]"));
	
	public static WebElement DealerLoc=driver.findElement(By.xpath("//span[contains(text(),'Dealer Locator')]"));
	
	public static WebElement Financeoffers=driver.findElement(By.xpath("//span[contains(text(),'Finance Offers')]"));
	
	
}
