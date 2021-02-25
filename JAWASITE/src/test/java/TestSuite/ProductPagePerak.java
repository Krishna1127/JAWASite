package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.PerakCommonMethods;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class ProductPagePerak  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	@Test
	public void PerakPageCheck() throws Exception {
		
		Homepage.FraudAlertClose.click();
		
		PerakCommonMethods.perakpage();
		PerakCommonMethods.Images();
		Wait();
		
	}

	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
