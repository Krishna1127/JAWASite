package TestSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CommonMethods.PerakCommonMethods;
import PageLocaters.Homepage;
import PageLocaters.PerakPage;
import Utility.BaseClass;

public class Perakpage extends BaseClass{

	@BeforeTest
	public void Setup() throws Exception {
		LaunchBrowser("chrome");
		
		Application();
		Wait();
	}
	
	@Test
	public void perakpageTest() throws Exception {
		Homepage.FraudAlertClose.click();
		Homepage.perak.click();
		PerakCommonMethods.FinanceOffers();
		PerakCommonMethods.EmiCalculator();
		Wait();
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
