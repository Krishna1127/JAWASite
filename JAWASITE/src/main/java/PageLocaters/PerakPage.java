package PageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;

public class PerakPage extends BaseClass{

	public static WebElement Video1=driver.findElement(By.xpath("//div[@id='player-home-0']//img[@class='v-card__play h__icon']"));
	
	public static WebElement BookTesTRide=driver.findElement(By.xpath("//span[@class='grid-flex grid-am']"));
	
	public static WebElement financeOffers=driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Finance Offers')]"));
	
	public static WebElement EmiCalculator=driver.findElement(By.xpath("//span[contains(text(),'EMI Calculator')]"));
	
	public static WebElement TechnicalSpec=driver.findElement(By.xpath("//button[contains(text(),'Technical specification')]"));
}
