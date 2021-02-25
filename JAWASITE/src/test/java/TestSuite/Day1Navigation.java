package TestSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.MenuCommonMethods;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class Day1Navigation extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("Chrome");
		
		Application();
		
	}
	
	@Test
	public void Navigation() throws Exception {
		
		Homepage.FraudAlertClose.click();
	
		MenuCommonMethods.MenuNavigation();
		 
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
		driver.quit();
	}
}
