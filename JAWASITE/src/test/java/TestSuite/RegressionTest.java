package TestSuite;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CommonMethods.Common;
import CommonMethods.HomepageCommon;
import CommonMethods.Jawa42Common;
import CommonMethods.MenuCommonMethods;
import CommonMethods.PerakCommonMethods;
import CommonMethods.RegressionCommon;
import CommonMethods.jawaCommon;
import PageLocaters.Homepage;
import PageLocaters.Jawa42;
import PageLocaters.PerakPage;
import Utility.BaseClass;
import Utility.utils;

public class RegressionTest extends BaseClass{

	@BeforeMethod
	public void SetUp() {
		
		LaunchBrowser("chrome");
		Application();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test(priority=1,enabled=true)
	public void MenuNavigation1() throws Exception {
		
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		MenuCommonMethods.MenuNavigation();
		
	}
	@Test(priority=2,enabled=true)
	public void MenuNavigation2() throws Exception {
		
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		
		MenuCommonMethods.MenuNavigation2();
	
	}
	@Test(priority=3,enabled=true)
	public void HomePageTest1() throws Exception {
  
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		
		HomepageCommon.day3test();
		System.out.println("HomePage Test Validation is Success");
	
	}
	@Test(priority=4,enabled=true)
	public void HomePageTest2() throws Exception {
  
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		HomepageCommon.FinanceSchemes();
		driver.navigate().back();
		driver.navigate().back();
		Wait();
		driver.navigate().refresh();
		Wait();
       RegressionCommon.HomebooktestRide();
       System.out.println("HomePage Finance Schemes,Book A Test Ride Validation is Success");
	
	}
	@Test(priority=5,enabled=true)
	public void HomePageTest3() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		
		
       RegressionCommon.Day4Test();
       System.out.println("HomePage Test3 Validation is Success");
	}
	@Test(priority=6,enabled=true)
	public void HomepageTest4() throws Exception  {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		 WebElement Legacy=driver.findElement(By.xpath("//a[contains(text(),'LEGACY')]"));
		try{
			Legacy.click();
			}catch(Exception e) {
				Legacy=driver.findElement(By.xpath("//a[contains(text(),'LEGACY')]"));
				Legacy.click();
			}
		
		Wait();
	driver.navigate().back();
	WebElement History=driver.findElement(By.xpath("//a[contains(text(),'HISTORY')]"));
	try {
		History.click();
		
	}catch(Exception e) {
		
		History=driver.findElement(By.xpath("//a[contains(text(),'HISTORY')]"));
		History.click();
		Wait();
	}
	driver.navigate().back();
	WebElement steedsofsteel=driver.findElement(By.xpath("//a[contains(text(),'STEEDS OF STEEL')]"));
	try {
		steedsofsteel.click();
		
	}catch(Exception e) {
		steedsofsteel=driver.findElement(By.xpath("//a[contains(text(),'STEEDS OF STEEL')]"));
		steedsofsteel.click();
		Wait();
		}
	System.out.println("HomePage Test Legacy,Steeds Of Steel, History Validation is Success");
	}
	@Test(priority=7,enabled=true)
	public void Search() throws Exception {
  
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
	/*	WebElement SearchClick=driver.findElement(By.xpath("//button[@class='header__btn header__search js-open-search']"));
	
		try{
			SearchClick.click();
		}catch(Exception e) {
			SearchClick=driver.findElement(By.xpath("//button[@class='header__btn header__search js-open-search']"));
			SearchClick.click();
		}
		  Wait();
		  WebElement Search=driver.findElement(By.xpath("//input[@id='search-input']"));
		  	try{
		  		Search.sendKeys("jawa");
		  	}catch(Exception e) {
		  		Search=driver.findElement(By.xpath("//input[@id='search-input']"));
		  		Search.sendKeys("jawa");
		  	}
		  	WebElement Search1=driver.findElement(By.xpath("//div[@id='view-search']//li[1]"));
				Search1.click();
				Wait();
			//	driver.navigate().back();
				
				 SearchClick=driver.findElement(By.xpath("//button[@class='header__btn header__search js-open-search']"));
				 Search=driver.findElement(By.xpath("//input[@id='search-input']"));
				 WebElement JawaHomeClick=driver.findElement(By.xpath("//img[@class='header__logo-img']"));
				 try{
					 JawaHomeClick.click();
				 }catch(Exception e) {
					 JawaHomeClick=driver.findElement(By.xpath("//img[@class='header__logo-img']"));
					 JawaHomeClick.click();
					 Wait();
				 }
				try{
					
					SearchClick.click();
					//Search.clear();
					Search.sendKeys("Legends");
					Search1.click();
				}catch(Exception e) {
					SearchClick=driver.findElement(By.xpath("//button[@class='header__btn header__search js-open-search']"));
					
					SearchClick.click();
					Search=driver.findElement(By.xpath("//input[@id='search-input']"));
					
					Search.sendKeys("Legends");
					Wait();
					Search.sendKeys(Keys.ENTER);
					Wait();
				}
				try{
					 JawaHomeClick.click();
				 }catch(Exception e) {
					 JawaHomeClick=driver.findElement(By.xpath("//img[@class='header__logo-img']"));
					 JawaHomeClick.click();
					 Wait();
				 }
				try{
					
					SearchClick.click();
					//Search.clear();
					Search.sendKeys("Legacy");
					Search1.click();
				}catch(Exception e) {
					SearchClick=driver.findElement(By.xpath("//button[@class='header__btn header__search js-open-search']"));
					
					SearchClick.click();
					Search=driver.findElement(By.xpath("//input[@id='search-input']"));
					
					Search.sendKeys("Legacy");
					Wait();
					Search.sendKeys(Keys.ENTER);
					Wait();
				}
				try{
					 JawaHomeClick.click();
				 }catch(Exception e) {
					 JawaHomeClick=driver.findElement(By.xpath("//img[@class='header__logo-img']"));
					 JawaHomeClick.click();
					 Wait();
				 }
				try{
					
					SearchClick.click();
					//Search.clear();
					Search.sendKeys("perak");
					Search1.click();
				}catch(Exception e) {
					SearchClick=driver.findElement(By.xpath("//button[@class='header__btn header__search js-open-search']"));
					
					SearchClick.click();
					Search=driver.findElement(By.xpath("//input[@id='search-input']"));
					
					Search.sendKeys("perak");
					Wait();
					Search.sendKeys(Keys.ENTER);
					Wait();
				}*/
				System.out.println("Search  Validation is Success");
		}
	
	@Test(priority=8,enabled=true)
	public void JAwa42PageTest() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		WebElement Jawa42=driver.findElement(By.xpath("(//a[3]//i[1])[1]"));
		try{
			Jawa42.click();
		}catch(Exception e) {
			
			Jawa42=driver.findElement(By.xpath("(//a[3]//i[1])[1]"));
			Jawa42.click();
		}
		
		Wait();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,3000);");
		Thread.sleep(1000);
		RegressionCommon.jawa42threesixty();
		System.out.println("Jawa42 Page 360 degree Validation is Success");
	}
	
	@Test(priority=9,enabled=true)
	public void jawaExShowroomPriceCheck() throws Exception {
	
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		
		WebElement jawa=driver.findElement(By.xpath("//div[@class='model']//a[1]//i[1]"));
		try{
			jawa.click();
		}catch(Exception e) {
			jawa=driver.findElement(By.xpath("//div[@class='model']//a[1]//i[1]"));
			jawa.click();
		}
		Wait();
	//	jawaCommon.priceCheck();
		System.out.println("Jawa ExShowroom Price Validation is Success");
		
	}
	@Test(priority=10,enabled=true)
	public void jawa42ExShowroomPriceCheck() throws Exception {
	
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		WebElement jawa42=driver.findElement(By.xpath("//a[3]//i[1]"));
		try{
			jawa42.click();
		}catch(Exception e) {
			jawa42=driver.findElement(By.xpath("//a[3]//i[1]"));
			jawa42.click();
		}
		
		Wait();
		//Jawa42Common.priceCheck();
		System.out.println("Jawa42 ExShowroom Price Validation is Success");
		
	}
	@Test(priority=11,enabled=true)
	public void PerakPriceCheck() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		WebElement perak=driver.findElement(By.xpath("//div[@class='model']//a[4]//i[1]"));
		try{
			perak.click();
		}catch(Exception e) {
			perak=driver.findElement(By.xpath("//div[@class='model']//a[4]//i[1]"));
			perak.click();
		}
	
		Wait();
		//PerakCommonMethods.priceCheck();
		System.out.println("Perak ExShowroom Price Validation is Success");
	}

	@Test(priority=12,enabled=true)
	public void JawapageTest() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		WebElement jawa=driver.findElement(By.xpath("//div[@class='model']//a[1]//i[1]"));
		try{
			jawa.click();
		}catch(Exception e) {
			jawa=driver.findElement(By.xpath("//div[@class='model']//a[1]//i[1]"));
			jawa.click();
		}
		
		RegressionCommon.booktestRide();
		Wait();
		//jawaCommon.FinanceOffers();
		Wait();
		jawaCommon.EmiCal();
		Wait();
		System.out.println("Jawa Page Book Test Ride,Finance Schemes,EMI Calculator Validation is Success");
	}
	@Test(priority=13,enabled=true)
	public void JawaBookNowtest() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		Wait();
		
		WebElement jawa=driver.findElement(By.xpath("//div[@class='model']//a[1]//i[1]"));
		try{
			jawa.click();
		}catch(Exception e) {
			jawa=driver.findElement(By.xpath("//div[@class='model']//a[1]//i[1]"));
			jawa.click();
		}
		
		Wait();
		WebElement BookOnline=driver.findElement(By.xpath("//div[@class='banner__content']//span[@class='banner__btn-lg'][contains(text(),'Book Online -')]"));
		try{
			BookOnline.click();
		}catch(Exception e) {
			BookOnline=driver.findElement(By.xpath("//div[@class='banner__content']//span[@class='banner__btn-lg'][contains(text(),'Book Online -')]"));
			BookOnline.click();
		}
		Wait();
		RegressionCommon.BookNowBlackColor();
		System.out.println("Jawa Page Book Now Validation is Success");
		}
	@Test(priority=14)
	public void Jawa42Booknow() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		
		RegressionCommon.jawa42BookNow();
		
		System.out.println("Jawa42 Page Book Now Validation is Success");
	}
	@Test(priority=15)
	public void perakBookNow() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
	  Wait();
	  WebElement perak=driver.findElement(By.xpath("//div[@class='model']//a[4]//i[1]"));
		try{
			perak.click();
		}catch(Exception e) {
			perak=driver.findElement(By.xpath("//div[@class='model']//a[4]//i[1]"));
			perak.click();
		}
		Wait();
		RegressionCommon.PerakBookNow();
		System.out.println("Perak Page Book Now Validation is Success");
		}
	@Test(priority=16)
	public void BookOnlineJourney() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		
		WebElement BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
		try{
			BookOnline.click();
		}catch(Exception e) {
			BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
			BookOnline.click();
		}
		Wait();
		Common.BookOnlineJawajourney();
		Wait();
		System.out.println("Jawa Book Online Journey Validation is Success");
		
	}
	@Test(priority=17)
	public void New42BookonlineJourney() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		
		WebElement BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
		try{
			BookOnline.click();
		}catch(Exception e) {
			BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
			BookOnline.click();
		}
		Wait();
		Common.BookOnlinejourneyNew42();
		System.out.println("New 42 Book Online Journey Validation is Success");
	}
	@Test(priority=18)
	public void BookOnlineJawa42Journey() throws Exception {
		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		
		
		WebElement BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
		try{
			BookOnline.click();
		}catch(Exception e) {
			BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
			BookOnline.click();
		}
			Wait();
			RegressionCommon.BookOnlineJawajourney();
			Wait();
			System.out.println("Jawa42 Book Online Journey Validation is Success");

		}
	
@Test(priority=19)
	public void perakBookOnlineJourney() throws Exception {

		WebElement FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
		try {
		FraudAlertClose.click();
		}catch(Exception e) {
			FraudAlertClose=driver.findElement(By.xpath("//i[@class='h__icon h__icon-svg']//*[local-name()='svg']"));
			FraudAlertClose.click();
			Wait();
		}
		WebElement BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
		try{
			BookOnline.click();
		}catch(Exception e) {
			BookOnline=driver.findElement(By.xpath("//span[contains(text(),'Book Online')]"));
			BookOnline.click();
		}
		Wait();
		PerakCommonMethods.BookOnlinejourney();
		Wait();
		
		System.out.println("Perak Book Online Journey Validation is Success");
	}
@AfterMethod
public void getResult() throws Exception{

driver.close();
driver.quit();
}
}
