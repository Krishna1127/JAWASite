package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Common;
import CommonMethods.PerakCommonMethods;

import PageLocaters.Homepage;

import PageLocaters.PerakPage;
import Utility.BaseClass;
import Utility.utils;

public class PerakTechnicalSpec  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
	}
	
	@Test
	public void perakTechnicalSpecifications() throws Exception {
	  Homepage.FraudAlertClose.click();
		Homepage.perak.click();
		Wait();
		utils.Scroll();
		PerakPage.TechnicalSpec.click();
		Wait();
		PerakCommonMethods.TechSpecification();
		
		}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
