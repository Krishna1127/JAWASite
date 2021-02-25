package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Common;

import PageLocaters.Homepage;
import PageLocaters.Jawa42;

import Utility.BaseClass;

public class Jawa42TechnicalSpecCheck  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void jawa42TechnicalSpecifications() throws Exception {
		
	  Homepage.FraudAlertClose.click();
		Homepage.jawa42.click();
		Wait();
		Jawa42.TechnicalSpec.click();
		Wait();
		Common.TechSpecification();
		}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
