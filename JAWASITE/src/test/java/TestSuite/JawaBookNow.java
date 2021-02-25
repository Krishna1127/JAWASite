package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Common;
import CommonMethods.MenuCommonMethods;
import CommonMethods.jawaCommon;
import PageLocaters.Homepage;
import PageLocaters.JawaPage;
import PageLocaters.Menu;
import Utility.BaseClass;

public class JawaBookNow  extends BaseClass{

	
	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void JawaBookNowtest() throws Exception {
	  
		
		Homepage.FraudAlertClose.click();
		Homepage.jawa.click();
		Wait();
		JawaPage.BookOnline.click();
		Wait();
		jawaCommon.BookNowBlackColor();
		
		}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
