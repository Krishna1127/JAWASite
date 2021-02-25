package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.HomepageCommon;
import CommonMethods.Jawa42Common;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class Jawa42Test1  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void Jawa42test() throws Exception {
	Homepage.FraudAlertClose.click();
		Homepage.jawa42.click();
		Wait();
		
   //    HomepageCommon.BookTestRide();
		
		Jawa42Common.booktestRide();
		Jawa42Common.FinanceOffers();
		Jawa42Common.EmiCal();
	}
	
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
