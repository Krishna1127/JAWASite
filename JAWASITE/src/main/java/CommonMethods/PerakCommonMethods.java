package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageLocaters.Homepage;
import PageLocaters.Menu;
import PageLocaters.PerakPage;
import Utility.BaseClass;

public class PerakCommonMethods extends BaseClass{

	public static void perakpage() throws Exception {
		Homepage.perak.click();
		Wait();
		PerakPage.Video1.click();
		Wait();
		driver.navigate().refresh();
		Wait();
		driver.findElement(By.xpath("//span[@class='h__icon-arrow']")).click();
		Wait();
		driver.findElement(By.xpath("//span[@class='h__icon-arrow']")).click();
		Wait();
		
	}
	public static void BookOnlinejourney() throws Exception {
		   driver.findElement(By.xpath("(//button[@class='booking-card__btn btn-outline h__mb20 js-open-slide js-analytics-element'])[4]")).click();
		
		   Common.BookOnlineMSD();
			Wait();
			driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("MVP");
			driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Harish");
			driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
			driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
			
			//driver.findElement(By.xpath("//input[@id='user_agreement']")).click();
			
			Wait();
			}
public static void priceCheck() throws Exception {
	String DelhiPrice=driver.findElement(By.id("variant-price")).getText();
	String Delhipricev=DelhiPrice.substring(1,8);
	
	if(Delhipricev.equalsIgnoreCase(propinit("PerakPrice","NewDelhi"))) {
		
		System.out.println("Delhi Dual Chanel Abs Price Validation Success...");
	}else {
		System.out.println("Delhi validation Failed..");
	}
		Select city=new Select(driver.findElement(By.xpath("//select[@id='city']")));
		city.selectByVisibleText("Hyderabad");
		Wait();
		String price=driver.findElement(By.id("variant-price")).getText();
		String Hydpricev=price.substring(1,8);
		
		if(Hydpricev.equalsIgnoreCase(propinit("PerakPrice", "Hyderabad"))) {
			
			System.out.println("Hyderabad single Chanel Abs Price Validation Success");
		}else {
			
			System.out.println("Hyd Validation failed");
		}
		city.selectByVisibleText("Chennai");
		Wait();
		String TNprice=driver.findElement(By.id("variant-price")).getText();
		String TNpricev=TNprice.substring(1,8);

if(TNpricev.equalsIgnoreCase(propinit("PerakPrice", "Chennai"))) {
			
			System.out.println("Chennai Dual Chanel Abs Price Validation Success");
		}else {
			
			System.out.println("Chennai Validation failed");
		}
		Thread.sleep(1000);
	city.selectByVisibleText("Mumbai");
	
	String MIPrice=driver.findElement(By.id("variant-price")).getText();
	String MIPricev=MIPrice.substring(1,8);
	
	if(MIPricev.equalsIgnoreCase(propinit("PerakPrice","Mumbai"))) {
		
		System.out.println("Mumbai single Chanel Abs Price Validation Success");
	}else {
		
		System.out.println("Mumbai Validation failed");
	}
city.selectByVisibleText("Bangalore");
	
	String BlrPrice=driver.findElement(By.id("variant-price")).getText();
	String BlrPricev=BlrPrice.substring(1,8);
	//System.out.println(BlrPricev);
	if(BlrPricev.equalsIgnoreCase(propinit("PerakPrice", "Bangalore"))) {
		
		System.out.println("Bangalore single Chanel Abs Price Validation Success");
	}else {
		
		System.out.println(" Bangalore Validation failed");
	}
	city.selectByVisibleText("New Delhi");
	Thread.sleep(1000);
	
	}
	
	public static void BookNow() throws Exception {
		
		driver.findElement(By.xpath("//div[@class='quicklinks hero__btn-grid grid grid-ac']//span[@class='banner__btn-lg h__display-inline h__relative'][contains(text(),'Book Online -')]")).click();
		Wait();
		Common.BookOnlineMSD();
		driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
		driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
		driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
		Wait();
		//driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-bike-booking js-analytics-element']")).click();
		
	
		
	}
public static void TechSpecification() throws Exception {
		
	driver.findElement(By.xpath(propinit("TechnicalSpecifications","Engine"))).click();
	
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Engine CC')]/following::div[1]")).getText(),propinit("TechnicalSpecifications","PerakEngineCC"));
	
	//Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Single Cylinder, 4 Stroke, Liquid Cooled, DOHC BSV')]")).getText(),propinit("TechnicalSpecifications","EngineType"));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'30.64 PS')]")).getText(),propinit("TechnicalSpecifications","PerakMaxPower"));

Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'32.74 NM')]")).getText(),propinit("TechnicalSpecifications","PerakMaxTorque"));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Electronic Fuel Injection')]")).getText(),propinit("TechnicalSpecifications","PerakFuelSystem"));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'81 x 65 MM')]")).getText(),propinit("TechnicalSpecifications","PerakBorestroke"));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Twin Exhaust')]")).getText(),propinit("TechnicalSpecifications","PerakExhaust"));
	Wait();
	driver.findElement(By.xpath(propinit("TechnicalSpecifications","Dimension"))).click();
	
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'175 kg')]")).getText(),propinit("TechnicalSpecifications","PerakKerbweight"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'14 L')]")).getText(),propinit("TechnicalSpecifications","PerakFuelTankCapacity"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'1485 MM')]")).getText(),propinit("TechnicalSpecifications","PerakWheelbase"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'750 MM')]")).getText(),propinit("TechnicalSpecifications","PerakSeatHeight"));
	Wait();
	driver.findElement(By.xpath(propinit("TechnicalSpecifications","Transmission"))).click();
	//Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Constant Mesh 6 Speed')]")).getText(), Exceldata("Technical Spec",11,1));
	Wait();
driver.findElement(By.xpath(propinit("TechnicalSpecifications","Chassis"))).click();
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Double cradle Tubular Frame')]")).getText(),propinit("TechnicalSpecifications","PerakFrame"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Telescopic Hydraulic Fork')]")).getText(),propinit("TechnicalSpecifications","PerakFrontSuspension"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Mono Shock Absorber, 7 Step Adjustable')]")).getText(),propinit("TechnicalSpecifications","PerakRearSuspension"));
	Wait();
	driver.findElement(By.xpath(propinit("TechnicalSpecifications","Braking"))).click();
	Assert.assertEquals(driver.findElement(By.xpath("//li[5]//div[1]//div[1]//div[1]//div[1]//div[2]")).getText(),propinit("TechnicalSpecifications","PerakFrontBrakeType"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'280 MM')]")).getText(),propinit("TechnicalSpecifications","PerakFrontDisksize"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'240 MM')]")).getText(),propinit("TechnicalSpecifications","PerakRearDrumsize"));
	Wait();
	driver.findElement(By.xpath(propinit("TechnicalSpecifications","Wheels"))).click();
	Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Wheel and Tyres')]//following::div[6]")).getText(),propinit("TechnicalSpecifications","PerakFrontTyre"));
	Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Wheel and Tyres')]//following::div[9]")).getText(),propinit("TechnicalSpecifications","PerakRearTyre"));
	Wait();
	}
	public static void Images() throws Exception {
		
		driver.findElement(By.xpath("//button[@class='gallery__nxt js-gallery-ctrls']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='gallery__nxt js-gallery-ctrls']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='gallery__nxt js-gallery-ctrls']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='gallery__nxt js-gallery-ctrls']")).click();
		Wait();
	}
	public static void threesixty() throws Exception {
		Wait();
		driver.findElement(By.xpath("//div[@class='cloudimage-inner-box']//div")).click();
		Wait();
		WebElement thresixty=driver.findElement(By.xpath("//div[@class='cloudimage-inner-box']//canvas"));
		Actions act=new Actions(driver);
		act.moveToElement(thresixty).clickAndHold().moveByOffset(300,0).release().perform();
		Wait();
		act.moveToElement(thresixty).clickAndHold().moveByOffset(220,0).release().perform();
		Wait();
		act.moveToElement(thresixty).clickAndHold().moveByOffset(220,0).release().perform();
Wait();
	}
	public static void booktestRide() throws Exception {
		
		WebElement perak=driver.findElement(By.xpath("//div[@class='model']//a[3]//i[1]"));
		try{
			perak.click();
			}catch(Exception e) {
				perak=driver.findElement(By.xpath("//div[@class='model']//a[3]//i[1]"));
				perak.click();
				Wait();
			}
		
		Wait();
		 PerakPage.BookTesTRide.click();
		 Wait();
		 Common.BookOnlineMSD();
		 Wait();
			driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
			driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
			driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
			driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
			Wait();
			driver.findElement(By.xpath("//button[contains(text(),'BOOK TEST RIDE')]")).click();
			Wait();
			driver.findElement(By.xpath("//body/div[@id='fancybox-container-2']/div[2]/div[4]/div[1]/div[1]/button[1]/*[1]")).click();
			Wait();
	}
	public static void FinanceOffers() throws Exception {
		
		PerakPage.financeOffers.click();
		Wait();
		Common.FinanceschemeMSD();
		 Wait();
		 
		 driver.findElement(By.id("pan-number")).sendKeys("APCHPO7883L");
		 driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
			driver.findElement(By.xpath("//input[@id='monthly-income']")).sendKeys("60000");
			driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
			driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
			driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
			driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
			Wait();
			driver.findElement(By.xpath("//*[@id=\"fancybox-container-2\"]/div[2]/div[4]/div/div/button")).click();
	Wait();
	}
	public static void EmiCalculator() throws Exception {
		
		PerakPage.EmiCalculator.click();
		Wait();
		WebElement LoanAmount=driver.findElement(By.xpath("//div[@id='loanamountslider']//div[@class='noUi-handle noUi-handle-lower']"));
		WebElement Loantermslider=driver.findElement(By.xpath("//div[@id='loantermslider']//div[@class='noUi-handle noUi-handle-lower']"));
		Actions move = new Actions(driver);
		move.moveToElement(LoanAmount).clickAndHold().moveByOffset(150,0).release().perform();
		Wait();
		move.moveToElement(Loantermslider).clickAndHold().moveByOffset(70,0).release().perform();
		Thread.sleep(3500);
		driver.navigate().back();
		Wait();
	}
}
