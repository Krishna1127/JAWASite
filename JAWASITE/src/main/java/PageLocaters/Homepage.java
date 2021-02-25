package PageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.BaseClass;

public class Homepage extends BaseClass {

	public static WebElement JawaHomeClick=driver.findElement(By.xpath("//img[@class='header__logo-img']"));
	
	public static WebElement Steedofsteel=driver.findElement(By.xpath("//a[@class='steeds__btn btn-outline h__lc js-analytics-element']"));
	
	public static WebElement JawaRig=driver.findElement(By.xpath("//a[contains(text(),'The Jawa RIG')]"));
	
	public static WebElement RiderEnsemble=driver.findElement(By.xpath("//a[contains(text(),'Rider Ensemble')]"));
	
	public static WebElement BookTestRide=driver.findElement(By.xpath("//span[@class='grid-flex grid-am'][contains(text(),'Book a test ride')]"));
		
	public static WebElement MediaSpotlight=driver.findElement(By.xpath("//span[@class='h__uppercase h__mr20']"));
	
	public static WebElement VideoNext=driver.findElement(By.xpath("//div[@class='v-card__list h__relative']//span[@class='h__icon-arrow']"));
	
	public static WebElement WhatsappNum=driver.findElement(By.xpath("//input[@id='whatsappsubscriber-mobile']"));
	
	public static WebElement Legacy=driver.findElement(By.xpath("//a[contains(text(),'LEGACY')]"));
	
	public static WebElement Dealers=driver.findElement(By.xpath("//span[contains(text(),'Dealers')]"));
	
	public static WebElement steedsofsteel=driver.findElement(By.xpath("//a[contains(text(),'STEEDS OF STEEL')]"));
	
	public static WebElement SearchClick=driver.findElement(By.xpath("//button[@class='header__btn header__search js-open-search']"));
	
	public static WebElement Search=driver.findElement(By.xpath("//input[@id='search-input']"));
	
	public static WebElement BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
	
	public static WebElement perak=driver.findElement(By.xpath("//div[@class='model']//a[4]//i[1]"));
	
	public static WebElement jawa=driver.findElement(By.xpath("//div[@class='model']//a[1]//i[1]"));
	
	public static WebElement jawa42=driver.findElement(By.xpath("//a[3]//i[1]"));
	
	public static WebElement J42=driver.findElement(By.xpath("//div[@class='model']//a[2]//i[1]"));
	
	public static WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));

	public static WebElement BannerNxt=driver.findElement(By.xpath("//div[@class='banner__slider']//span[@class='h__icon-arrow']"));

	public static WebElement Banner1=driver.findElement(By.xpath("//div[@class='tns-item tns-slide-active']//a[@class='banner__fig h__img-gratio js-analytics-element']//img"));
}

