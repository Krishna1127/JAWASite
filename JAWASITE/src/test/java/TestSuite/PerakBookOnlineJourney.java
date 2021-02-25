package TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Common;
import CommonMethods.MenuCommonMethods;
import CommonMethods.PerakCommonMethods;
import PageLocaters.Homepage;
import PageLocaters.Menu;
import Utility.BaseClass;

public class PerakBookOnlineJourney  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	@Test
	public void perakBookOnlineJourney() throws Exception {
		
		Homepage.FraudAlertClose.click();
		Homepage.BookOnline.click();
		Wait();
		PerakCommonMethods.BookOnlinejourney();
		Wait();
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
