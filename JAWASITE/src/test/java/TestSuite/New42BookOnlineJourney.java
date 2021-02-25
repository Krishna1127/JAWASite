package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Common;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class New42BookOnlineJourney extends BaseClass{

	
	@BeforeTest
	public void setup() {
		LaunchBrowser("chrome");
		Application();
		
	}
	@Test
	public void code() throws Exception {
		Homepage.FraudAlertClose.click();
		Homepage.BookOnline.click();
		Wait();
		Common.BookOnlinejourneyNew42();
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
