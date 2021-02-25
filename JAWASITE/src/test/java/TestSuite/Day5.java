package TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageLocaters.Homepage;
import Utility.BaseClass;

public class Day5  extends BaseClass{
	
	@BeforeTest
	public void Setup() throws Exception {
		LaunchBrowser("chrome");
		
		Application();
		Wait();
	}
	
	@Test
	public void Homepage() throws Exception  {
		Homepage.FraudAlertClose.click();
		
		Homepage.Legacy.click();
		Wait();
	driver.navigate().back();
	WebElement History=driver.findElement(By.xpath("//a[contains(text(),'HISTORY')]"));
	try {
		History.click();
		
	}catch(Exception e) {
		
		History=driver.findElement(By.xpath("//a[contains(text(),'HISTORY')]"));
		History.click();
		Wait();
	}
	driver.navigate().back();
	WebElement steedsofsteel=driver.findElement(By.xpath("//a[contains(text(),'STEEDS OF STEEL')]"));
	try {
		steedsofsteel.click();
		
	}catch(Exception e) {
		steedsofsteel=driver.findElement(By.xpath("//a[contains(text(),'STEEDS OF STEEL')]"));
		steedsofsteel.click();
		Wait();
	}
	
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}

}
