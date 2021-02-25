package TestSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CommonMethods.Common;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class Day7BookOnlineJawa  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	@Test
	public void JawaBookOnlineJourney() throws Exception {
		Homepage.FraudAlertClose.click();
		Homepage.BookOnline.click();
		Wait();
		Common.BookOnlineJawajourney();
		Wait();
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
