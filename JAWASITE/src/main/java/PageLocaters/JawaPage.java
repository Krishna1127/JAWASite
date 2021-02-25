package PageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;

public class JawaPage extends BaseClass{

public static WebElement emi=driver.findElement(By.xpath("//span[contains(text(),'EMI Calculator')]"));
	
	public static WebElement financeoffers=driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Finance Offers')]"));

	
	public static WebElement BookOnline=driver.findElement(By.xpath("//div[@class='banner__content']//span[@class='banner__btn-lg'][contains(text(),'Book Online -')]"));
	
	
	public static WebElement TechSpec=driver.findElement(By.xpath("//span[@class='grid-flex grid-am grid-ac']"));
	
	public static WebElement threesixtyclick=driver.findElement(By.xpath("(//div[@class='page page']//a[2])[1]"));
	
	public static WebElement singleChanel=driver.findElement(By.xpath("//div[@id='variant-price-10002']"));
	
	public static WebElement DualChanel=driver.findElement(By.xpath("//div[@id='variant-price-10003']"));

	
	
	
	
}
