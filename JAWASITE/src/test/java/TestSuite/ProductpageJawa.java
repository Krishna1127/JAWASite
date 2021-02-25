package TestSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.jawaCommon;
import PageLocaters.Homepage;

import Utility.BaseClass;
import Utility.utils;

public class ProductpageJawa  extends BaseClass{

	@BeforeTest
	public void Setup() throws Exception {
		LaunchBrowser("chrome");
		
		Application();
		Wait();
	}
	
	@Test
	public void jawapageTest() throws Exception {
		try {
			Homepage.FraudAlertClose.click();
			Homepage.jawa.click();
			Wait();
			jawaCommon.Videos();
			
			Wait();
			jawaCommon.jawa360();
		} catch (Exception e) {
			utils.Screenshot("JawaPage");
		}
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
