package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CommonMethods.Jawa42Common;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class Jawa42BookNow  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void jawa42bookNow() throws Exception {
		
		Homepage.FraudAlertClose.click();
		
		Jawa42Common.BookNow();
			
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
