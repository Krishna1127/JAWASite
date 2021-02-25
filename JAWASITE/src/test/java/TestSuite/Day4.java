package TestSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.HomepageCommon;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class Day4  extends BaseClass{

	@BeforeTest
	public void Setup() throws Exception {
		LaunchBrowser("chrome");
		
		Application();
		Wait();
	}
	
	@Test
	public void HomePage() throws Exception {
		Homepage.FraudAlertClose.click();
		
       HomepageCommon.Day4Test();
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
