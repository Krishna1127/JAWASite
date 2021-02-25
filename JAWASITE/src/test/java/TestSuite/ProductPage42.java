package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Jawa42Common;
import PageLocaters.Homepage;

import Utility.BaseClass;
import Utility.utils;

public class ProductPage42  extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	
	@Test
	public void JAwa42PageTest() throws Exception {
	try {
		Homepage.FraudAlertClose.click();
		Homepage.jawa42.click();
		Wait();
		Jawa42Common.jawa42threesixty();
	} catch (Exception e) {
		
		utils.Screenshot("Jawa42");
	}
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
