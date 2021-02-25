package TestSuite;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CommonMethods.HomepageCommon;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class Day3Test2  extends BaseClass{
	
	
	@BeforeTest
	public void Setup() throws Exception {
		LaunchBrowser("chrome");
		
		Application();
		Wait();
	}
	
	@Test
	public void HomePage() throws Exception {
		Homepage.FraudAlertClose.click();
		HomepageCommon.FinanceSchemes();
		driver.navigate().back();
		driver.navigate().back();
		Wait();
       HomepageCommon.BookTestRide();
	
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}

}
