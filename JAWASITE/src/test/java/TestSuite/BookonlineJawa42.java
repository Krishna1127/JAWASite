package TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.Common;
import CommonMethods.Jawa42Common;
import CommonMethods.MenuCommonMethods;
import PageLocaters.Homepage;
import PageLocaters.Menu;
import Utility.BaseClass;
import Utility.utils;

public class BookonlineJawa42 extends BaseClass{

	@BeforeTest
	public void Setup() {
		LaunchBrowser("chrome");
		
		Application();
		
	}
	@Test
	public void BookOnlineJawa42Journey() throws Exception {
		
			
			Homepage.FraudAlertClose.click();
			
			Homepage.BookOnline.click();
			Wait();
			Jawa42Common.BookOnlineJawajourney();
			Wait();
			
			
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}

}
