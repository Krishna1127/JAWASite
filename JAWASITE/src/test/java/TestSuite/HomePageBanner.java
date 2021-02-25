package TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageLocaters.Homepage;
import Utility.BaseClass;

public class HomePageBanner extends BaseClass{

	
	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void HomePageBaner() throws Exception {
		
	Homepage.FraudAlertClose.click();
	Wait();
	Homepage.Banner1.click();
	
	Wait();
	driver.findElement(By.xpath("//img[@class='header__logo-img']")).click();
	Wait();
	WebElement Banner=driver.findElement(By.xpath("//div[@class='tns-item tns-slide-active']//a[@class='banner__fig h__img-gratio js-analytics-element']//img"));
	try {
		Banner.click();
		Wait();
	}catch(Exception e) {
		Banner=driver.findElement(By.xpath("//div[@class='tns-item tns-slide-active']//a[@class='banner__fig h__img-gratio js-analytics-element']//img"));
		Banner.click();
		Wait();
	}
	Wait();
	
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
