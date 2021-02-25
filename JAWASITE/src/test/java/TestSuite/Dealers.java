package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CommonMethods.HomepageCommon;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class Dealers extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void Dealer() throws Exception {
		
		Homepage.FraudAlertClose.click();
		
		Homepage.Dealers.click();
		Wait();
		HomepageCommon.dealers();
	
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
