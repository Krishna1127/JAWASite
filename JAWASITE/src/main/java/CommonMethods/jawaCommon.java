package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageLocaters.JawaPage;
import Utility.BaseClass;

public class jawaCommon extends BaseClass{

	public static void Videos() throws Exception {
		
		driver.findElement(By.xpath("//div[@id='player-home-0']//img[@class='v-card__play h__icon']")).click();
		Wait();
		Wait();
		driver.navigate().refresh();
		Wait();
		driver.findElement(By.xpath("//span[@class='h__icon-arrow']")).click();
		Wait();
		driver.findElement(By.xpath("//div[@id='player-home-1']//img[@class='v-card__play h__icon']")).click();
		Wait();
		Wait();
		driver.navigate().refresh();
		Wait();
		driver.findElement(By.xpath("//span[@class='h__icon-arrow']")).click();
		driver.findElement(By.xpath("//span[@class='h__icon-arrow']")).click();
		Wait();
		driver.findElement(By.xpath("//div[@id='player-home-2']//img[@class='v-card__play h__icon']")).click();
		Wait();
		Wait();
		driver.navigate().refresh();
		Wait();
		
	}
	public static void TechSpecification() throws Exception {

		driver.findElement(By.xpath(propinit("TechnicalSpecifications","Engine"))).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'293 CC')]")).getText(),propinit("TechnicalSpecifications","EngineCC"));
		//Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Single Cylinder, 4 Stroke, Liquid Cooled, DOHC BSV')]")).getText(),propinit("TechnicalSpecifications","EngineType"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'27.33 PS')]")).getText(),propinit("TechnicalSpecifications","MaxPower"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'27.02 NM')]")).getText(),propinit("TechnicalSpecifications","MaxTorque"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Electronic Fuel Injection')]")).getText(),propinit("TechnicalSpecifications","FuelSystem"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'76 x 65 MM')]")).getText(),propinit("TechnicalSpecifications","Borestroke"));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Twin Exhaust')]")).getText(),propinit("TechnicalSpecifications","Exhaust"));
		Wait();
		driver.findElement(By.xpath(propinit("TechnicalSpecifications","Dimension"))).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'172 kg')]")).getText(),propinit("TechnicalSpecifications","Kerbweight"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'14 L')]")).getText(),propinit("TechnicalSpecifications","FuelTankCapacity"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'1369 MM')]")).getText(),propinit("TechnicalSpecifications","Wheelbase"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'765 MM')]")).getText(),propinit("TechnicalSpecifications","SeatHeight"));
		Wait();
		driver.findElement(By.xpath(propinit("TechnicalSpecifications","Transmission"))).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Constant Mesh 6 Speed')]")).getText(), Exceldata("Technical Spec",11,1));
		Wait();
		driver.findElement(By.xpath(propinit("TechnicalSpecifications","Chassis"))).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Double Cradle')]")).getText(),propinit("TechnicalSpecifications","Frame"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Telescopic Hydraulic Fork')]")).getText(),propinit("TechnicalSpecifications","FrontSuspension"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Gas Canister - Twin shock hydraulic')]")).getText(),propinit("TechnicalSpecifications","RearSuspension"));
		Wait();
		driver.findElement(By.xpath(propinit("TechnicalSpecifications","Braking"))).click();
		Assert.assertEquals(driver.findElement(By.xpath("//li[5]//div[1]//div[1]//div[1]//div[1]//div[2]")).getText(),propinit("TechnicalSpecifications","FrontBrakeType"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'280 MM')]")).getText(),propinit("TechnicalSpecifications","FrontDisksize"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'153 MM')]")).getText(),propinit("TechnicalSpecifications","RearDrumsize"));
		Wait();
		driver.findElement(By.xpath(propinit("TechnicalSpecifications","Wheels"))).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Wheel and Tyres')]//following::div[6]")).getText(),propinit("TechnicalSpecifications","FrontTyre"));
	//	Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Wheel and Tyres')]//following::div[9]")).getText(),propinit("TechnicalSpecifications","RearTyre"));
		Wait();
		
	}
	public static void BookNowBlackColor() throws Exception {
		
		WebElement Color=driver.findElement(By.xpath("//span[contains(text(),'Black')]"));
		Color.click();
		Wait();
		driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-book-now js-analytics-element']")).click();
		Wait();
		Common.BookOnlineMSD();
		driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
		
		driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
		Wait();
		
		
	}
	public static void priceCheck() throws Exception {
		
		Select city=new Select(driver.findElement(By.xpath("//select[@id='city']")));
		city.selectByVisibleText("Hyderabad");
		Wait();
		String price=JawaPage.singleChanel.getText();
		String pricev=price.substring(2,10);
		
		if(pricev.equalsIgnoreCase(propinit("jawaprice","HydMaroonsingleAbs"))) {
			
			System.out.println("Hyderabad single Chanel Abs Price Validation Success");
		}else {
			
			System.out.println("Hyd Validation failed");
		}
		
		System.out.println();
		city.selectByVisibleText("Chennai");
		Wait();
		String TNprice=JawaPage.DualChanel.getText();
		String TNpricev=TNprice.substring(2,10);
		
if(TNpricev.equalsIgnoreCase(propinit("jawaprice", "ChennaiMaroonDualAbs"))) {
			
			System.out.println("Chennai Dual Chanel Abs Price Validation Success");
		}else {
			
			System.out.println("Chennai Validation failed");
		}
		
Select color=new Select(driver.findElement(By.xpath("//select[@id='bike-color']")));

		color.selectByVisibleText("Black");
		Thread.sleep(1000);
	city.selectByVisibleText("Mumbai");
	
	String MIPrice=JawaPage.singleChanel.getText();
	String MIPricev=MIPrice.substring(2, 10);
	//System.out.println(MIPricev);
	if(MIPricev.equalsIgnoreCase(propinit("jawaprice", "MIBlackSingleAbs"))) {
		
		System.out.println("Mumbai single Chanel Abs Price Validation Success");
	}else {
		
		System.out.println("Mumbai Validation failed");
	}
city.selectByVisibleText("Bangalore");
	
	String BlrPrice=JawaPage.singleChanel.getText();
	String BlrPricev=BlrPrice.substring(2, 10);
	
	if(BlrPricev.equalsIgnoreCase(propinit("jawaprice", "JawaBlrSingleAbs"))) {
		
		System.out.println("Bangalore single Chanel Abs Price Validation Success");
	}else {
		
		System.out.println(" Bangalore Validation failed");
	}
	color.selectByVisibleText("Maroon");
	city.selectByVisibleText("New Delhi");
	Thread.sleep(1000);
	String DelhiPrice=JawaPage.DualChanel.getText();
	String DelhiPricev=DelhiPrice.substring(2, 10);
	//System.out.println(DelhiPrice + " "+DelhiPricev + " "+propinit("jawaprice", "JawaDelhiDualAbs"));
	if(DelhiPricev.equalsIgnoreCase(propinit("jawaprice", "JawaDelhiDualAbs"))) {
		
		System.out.println("Delhi Dual Chanel Abs Price Validation Success...");
	}else {
		System.out.println("Delhi validation Failed..");
	}
	}
	public static void EmiCal() throws Exception {
		WebElement emi=driver.findElement(By.xpath("//span[contains(text(),'EMI Calculator')]"));
		try{
			emi.click();
		}catch(Exception e) {
			emi=driver.findElement(By.xpath("//span[contains(text(),'EMI Calculator')]"));
			emi.click();
			
		}
		Wait();
		WebElement LoanAmount=driver.findElement(By.xpath("//div[@id='loanamountslider']//div[@class='noUi-handle noUi-handle-lower']"));
		WebElement Loantermslider=driver.findElement(By.xpath("//div[@id='loantermslider']//div[@class='noUi-handle noUi-handle-lower']"));
		Actions move = new Actions(driver);
		move.moveToElement(LoanAmount).clickAndHold().moveByOffset(120,0).release().perform();
		Wait();
		move.moveToElement(Loantermslider).clickAndHold().moveByOffset(70,0).release().perform();
		Thread.sleep(3500);
		driver.navigate().back();
		Wait();
	}
public static void booktestRide() throws Exception {
		
		Wait();
		 driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Book a test ride')]")).click();//bookatestride
		 Wait();
		 Common.FinanceschemeMSD();
			
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
	WebElement financeoffers=driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Finance Offers')]"));
	try{
		financeoffers.click();
	}catch(Exception e) {
		financeoffers=driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Finance Offers')]"));
		financeoffers.click();
	}
	
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
		driver.findElement(By.xpath("//body/div[@id='fancybox-container-5']/div[2]/div[4]/div[1]/div[1]/button[1]/*[1]")).click();
Wait();
		
}
	public static void gallery() throws Exception {
		
		
		driver.findElement(By.xpath("/html/body/div[1]/section[6]/div[2]/span[5]/img")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--arrow_right']//div//*[local-name()='svg']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--arrow_right']//div//*[local-name()='svg']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--arrow_right']//div//*[local-name()='svg']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--arrow_right']//div//*[local-name()='svg']")).click();
		Wait();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/button[4]/svg")).click();
		Wait();
	}
	public static void jawa360() throws Exception {
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
	WebElement Grey=driver.findElement(By.xpath("//div[@class='page page']//li[2]//div[1]"));
	
	try {
		Grey.click();
	}catch(Exception e) {
		Grey=driver.findElement(By.xpath("//div[@class='page page']//li[2]//div[1]"));
		Grey.click();

		Wait();
		Wait();
		
	}
	driver.navigate().refresh();
	WebElement Greyclick=driver.findElement(By.xpath("//*[@id=\"product-360\"]/div/div"));
	
	Greyclick.click();
	Wait();
	act.moveToElement(thresixty).clickAndHold().moveByOffset(300,0).release().perform();
	Wait();
	act.moveToElement(thresixty).clickAndHold().moveByOffset(220,0).release().perform();
	Wait();
	act.moveToElement(thresixty).clickAndHold().moveByOffset(220,0).release().perform();
		Wait();
		driver.navigate().refresh();
		
WebElement Red=	driver.findElement(By.xpath("//li[3]//div[1]"));
Red.click();
	/*try {
		Red.click();
		
	}catch(Exception e) {
		Red=	driver.findElement(By.xpath("//li[3]//div[1]"));
		Red.click();
		
		
	}*/
		Wait();
		Wait();
		driver.findElement(By.xpath("//div[@class='cloudimage-inner-box']//div")).click();
		Wait();
		act.moveToElement(thresixty).clickAndHold().moveByOffset(300,0).release().perform();
		Wait();
		act.moveToElement(thresixty).clickAndHold().moveByOffset(220,0).release().perform();
		Wait();
		act.moveToElement(thresixty).clickAndHold().moveByOffset(220,0).release().perform();
		Wait();
		}
}
