package TestSuite;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.PerakCommonMethods;
import PageLocaters.Homepage;
import Utility.BaseClass;

public class Perak360  extends BaseClass{

	@BeforeTest
	public void Setup() throws Exception {
		LaunchBrowser("chrome");
		
		Application();
		Wait();
	}
	
	@Test
	public void perak360() throws Exception {
		
		Homepage.FraudAlertClose.click();
		Homepage.perak.click();
		Wait();
		driver.findElement(By.xpath("//div[@class='page page']//a[3]")).click();
		
	       Wait();
		PerakCommonMethods.threesixty();
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
}
