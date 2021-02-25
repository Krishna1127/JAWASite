package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.jawaCommon;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class JawaPriceVariationCheck  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test(priority=1)
	public void jawaExShowroomPriceCheck() throws Exception {
	
		Homepage.FraudAlertClose.click();
		Wait();
		Homepage.jawa.click();
		Wait();
		jawaCommon.priceCheck();
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
