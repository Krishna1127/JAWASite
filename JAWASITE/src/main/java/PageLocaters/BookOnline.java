package PageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;

public class BookOnline extends BaseClass{

	public static WebElement Perak=driver.findElement(By.xpath("(//button[@class='booking-card__btn btn-outline h__mb20 js-open-slide js-analytics-element'])[4]"));
	
	public static WebElement Jawa=driver.findElement(By.xpath("((//button[@class='booking-card__btn btn-outline h__mb20 js-open-slide js-analytics-element'])[1]"));
	
	public static WebElement Fortytwo=driver.findElement(By.xpath("(//button[@class='booking-card__btn btn-outline h__mb20 js-open-slide js-analytics-element'])[3]"));
	
	public static WebElement Jawablack=driver.findElement(By.xpath("//label[1]//img[1]"));
	
	//public static WebElement JawaGrey=driver.findElement(By.xpath("//div[contains(text(),'Grey')]"));
	
	//public static WebElement Jawamaroon=driver.findElement(By.xpath("//div[contains(text(),'Maroon')]"));
	
	public static WebElement FortytwoNebulaBlue=driver.findElement(By.xpath("//div[contains(text(),'Nebula Blue (Glossy)')]"));
	
	public static WebElement FortytwoRed=driver.findElement(By.xpath("//div[contains(text(),'Comet Red (Glossy)')]"));
	public static WebElement FortytwoStarlightBlue=driver.findElement(By.xpath("//div[contains(text(),'Starlight Blue (Matte)')]"));
	public static WebElement FortytwoLumosLime=driver.findElement(By.xpath("//div[contains(text(),'Lumos Lime (Matte)')]"));
	public static WebElement FortytwoHalleystale=driver.findElement(By.xpath("//div[contains(text(),'s Teal (Matte)')]"));
	public static WebElement FortytwoGalacticGreen=driver.findElement(By.xpath("//div[contains(text(),'Galactic Green (Matte)')]"));
	
	public static WebElement Next=driver.findElement(By.xpath("//*[text()='Next']"));
	
	public static WebElement Back=driver.findElement(By.xpath("//*[text()='Back']"));
	
	public static WebElement JawaVariant1=driver.findElement(By.xpath("//input[@id='price2']"));
	
	public static WebElement JawaVariant2=driver.findElement(By.xpath("//input[@id='price1']"));
}
