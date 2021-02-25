package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Common;
import CommonMethods.MenuCommonMethods;
import CommonMethods.PerakCommonMethods;
import PageLocaters.Homepage;
import PageLocaters.Menu;
import Utility.BaseClass;

public class PerakBookNow  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void perakBookNow() throws Exception {
		Homepage.FraudAlertClose.click();
	  Wait();
		Homepage.perak.click();
		Wait();
		PerakCommonMethods.BookNow();
		
		}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
