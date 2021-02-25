package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CommonMethods.jawaCommon;
import PageLocaters.Homepage;
import PageLocaters.JawaPage;

import Utility.BaseClass;

public class JawaTechnicalSpecCheck  extends BaseClass{


	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void JawaTechnicalSpecifications() throws Exception {
		
	  Homepage.FraudAlertClose.click();
		Homepage.jawa.click();
		Wait();
		JawaPage.TechSpec.click();
		Wait();
	jawaCommon.TechSpecification();
		}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
