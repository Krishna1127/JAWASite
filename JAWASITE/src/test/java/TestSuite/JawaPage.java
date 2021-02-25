package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.jawaCommon;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class JawaPage extends BaseClass{

	@BeforeTest
	public void Setup() throws Exception {
		LaunchBrowser("chrome");
		
		Application();
		Wait();
	}
	
	@Test
	public void JawapageTest() throws Exception {
		Homepage.FraudAlertClose.click();
Homepage.jawa.click();
		jawaCommon.booktestRide();
		Wait();
		jawaCommon.FinanceOffers();
		Wait();
		jawaCommon.EmiCal();
		Wait();
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
