package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Jawa42Common;

import PageLocaters.Homepage;
import Utility.BaseClass;

public class Jawa42PriceCheck  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void ExShowroomPriceCheck() throws Exception {
	
		Homepage.FraudAlertClose.click();
		Wait();
		Homepage.jawa42.click();
		Wait();
		Jawa42Common.priceCheck();
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
