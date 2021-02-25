package PageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;

public class Jawa42 extends BaseClass{

	public static WebElement Jawa42=driver.findElement(By.xpath("//a[2]//i[1]"));
	
	public static WebElement FinanceOffers=driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Finance Offers')]"));
	
	public static WebElement Emical=driver.findElement(By.xpath("//span[contains(text(),'EMI Calculator')]"));
	
public static WebElement HydSingleNebulaBlue=driver.findElement(By.xpath("//div[@id='variant-price-10004']"));

	public static WebElement DualPrice=driver.findElement(By.xpath("//div[@id='variant-price-10005']"));
	
	public static WebElement SinglePrice=driver.findElement(By.xpath("//div[@id='variant-price-10004']"));
	
	public static WebElement TechnicalSpec=driver.findElement(By.xpath("//button[@class='spec__btn btn-outline btn-inline js-open-sidebar js-analytics-element']"));
}
