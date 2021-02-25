package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.PerakCommonMethods;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class PerakpriceCheck  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	@Test
	public void PerakPriceCheck() throws Exception {
		Homepage.FraudAlertClose.click();
		Homepage.perak.click();
		Wait();
		PerakCommonMethods.priceCheck();
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
