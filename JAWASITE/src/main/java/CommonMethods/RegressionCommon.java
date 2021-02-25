package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Utility.BaseClass;
import Utility.utils;

public class RegressionCommon extends BaseClass{

public static void Login() throws Exception {
	WebElement Login=driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
		try{
			Login.click();
			}catch(Exception e) {
				Login=driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]"));
				Login.click();
			}
		
		Wait();
		driver.findElement(By.xpath("//*[@id=\"mobile-number\"]")).sendKeys(Exceldata("Login", 0, 1));
		Wait();
		driver.findElement(By.xpath("//*[@id=\"otp-login-form\"]/div/button")).click();
		Wait();
		Wait();
		driver.findElement(By.xpath("//input[@name='otp']")).sendKeys(propinit("common","OTP"));
		Wait();
		Assert.assertEquals(driver.findElement(By.xpath("//img[@class='h__icon h__icon-80']//following::div[2]")).getText(),Exceldata("Login", 0, 2));
		System.out.println();
		driver.findElement(By.xpath("//img[@class='header__logo-img']")).click();
		System.out.println("Successfully Logged in...");
		
	}
public static void BookOnlineJawajourney() throws Exception {
	   driver.findElement(By.xpath("(//button[@class='booking-card__btn btn-outline h__mb20 js-open-slide js-analytics-element'])[3]")).click();//fourty two
	
	WebElement img=driver.findElement(By.xpath("//label[2]//img[1]"));
	try {
		img.click();
		
	}catch(Exception e) {
		img=driver.findElement(By.xpath("//label[2]//img[1]"));
		img.click();
		
	}
	   driver.findElement(By.xpath("//*[text()='Next']")).click();
			Wait();
			driver.findElement(By.xpath("//input[@id='price2']")).click();
			Wait();
			 driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click();
				Wait();
				Common.BookOnlineMSD();
				Wait();
				driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("MVP");
				driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Harish");
				driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
				driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
				
				//driver.findElement(By.xpath("//input[@id='user_agreement']")).click();
				driver.findElement(By.xpath("(//*[text()='Next'])[3]")).click();
				Wait();
		}
public static void BookOnlineMSD() throws Exception {
	Select state=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-state']")));
	state.selectByIndex(1);
	Wait();
	Select city=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_city']")));
	city.selectByIndex(1);
	Wait();
	Select Del=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_dealer']")));
	Del.selectByIndex(0);
	
}
public static void TechSpecification() throws Exception {
	
	WebElement Engine=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Engine")));
	try{
		Engine.click();
	}catch(Exception e) {
		Engine=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Engine")));
		Engine.click();
		
	}
	
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'293 CC')]")).getText(), Exceldata("Technical Spec", 1, 1));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Single Cylinder, 4 Stroke, Liquid Cooled, DOHC BSV')]")).getText(),Exceldata("Technical Spec", 2, 1));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'26.51 PS')]")).getText(), Exceldata("Technical Spec", 3, 1));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'27.05 NM')]")).getText(), Exceldata("Technical Spec", 4, 1));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Electronic Fuel Injection')]")).getText(), Exceldata("Technical Spec", 5, 1));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'76 x 65 MM')]")).getText(), Exceldata("Technical Spec", 7, 1));
Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Twin Exhaust')]")).getText(), Exceldata("Technical Spec", 8, 1));
	Wait();
	WebElement dimension=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Dimension")));
	try{
		dimension.click();
	}catch(Exception e) {
		dimension=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Dimension")));
		dimension.click();
		
	}

	
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'172 kg')]")).getText(), Exceldata("Technical Spec",1,4));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'14 L')]")).getText(),Exceldata("Technical Spec",2,4));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'1369 MM')]")).getText(), Exceldata("Technical Spec",3,4));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'765 MM')]")).getText(), Exceldata("Technical Spec",4,4));
	Wait();
	WebElement transmission=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Transmission")));
	try{
		transmission.click();
	}catch(Exception e) {
		transmission=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Transmission")));
		transmission.click();
		
	}
	
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Constant Mesh 6 Speed')]")).getText(), Exceldata("Technical Spec",11,1));
	Wait();
	WebElement chassis=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Chassis")));
	try{
		chassis.click();
	}catch(Exception e) {
		chassis=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Chassis")));
		chassis.click();
		}
	
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Double Cradle')]")).getText(),Exceldata("Technical Spec",13,1));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Telescopic Hydraulic Fork')]")).getText(), Exceldata("Technical Spec",14,1));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Gas Canister - Twin shock hydraulic')]")).getText(), Exceldata("Technical Spec",15,1));
	Wait();
	WebElement braking=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Braking")));
	try{
		braking.click();
	}catch(Exception e) {
		braking=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Braking")));
		braking.click();
		}
	
	Assert.assertEquals(driver.findElement(By.xpath("//li[5]//div[1]//div[1]//div[1]//div[1]//div[2]")).getText(), Exceldata("Technical Spec",7,4));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'280 MM')]")).getText(), Exceldata("Technical Spec",9,4));
	Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'153 MM')]")).getText(), Exceldata("Technical Spec",10,4));
	Wait();
	WebElement wheels=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Wheels")));
	try{
		wheels.click();
	}catch(Exception e) {
		wheels=driver.findElement(By.xpath(propinit("TechnicalSpecifications","Wheels")));
		wheels.click();
	}
	
	Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Wheel and Tyres')]//following::div[6]")).getText(), Exceldata("Technical Spec",12,4));
	Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Wheel and Tyres')]//following::div[9]")).getText(), Exceldata("Technical Spec",13,4));
	Wait();
}
public static void JawaBookNowBlackColor() throws Exception {
	
	driver.findElement(By.xpath("//span[contains(text(),'Black')]")).click();
	Wait();
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-book-now js-analytics-element']")).click();
	Wait();
	RegressionCommon.BookOnlineMSD();
	driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
	Wait();
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-bike-booking js-analytics-element']")).click();
	Wait();
	Wait();
}
public static void JawaVideos() throws Exception {
	
	WebElement Videoclick=driver.findElement(By.xpath("//div[@id='player-home-0']//img[@class='v-card__play h__icon']"));
	try {
		
		Videoclick.click();
	}catch(Exception e) {
		Videoclick=driver.findElement(By.xpath("//div[@id='player-home-0']//img[@class='v-card__play h__icon']"));
		Videoclick.click();
		
	}
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
public static void FinanceSchemes() throws Exception {
	driver.findElement(By.xpath("//body/div[1]/div[2]/div[4]/div[1]/div[3]/div[2]/a[2]")).click();
	   Wait();
	   
RegressionCommon.MSCDdropdown();
	driver.findElement(By.id("pan-number")).sendKeys(propinit("common","PAN"));
	driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
	driver.findElement(By.xpath("//input[@id='monthly-income']")).sendKeys(propinit("common", "MnthlyIncome"));
	driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
	Wait();
	driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-close-small']//*[local-name()='svg']")).click();
Wait();

}
public static void HomebooktestRide() throws Exception {
	
	Wait();
	 WebElement Booktestride=driver.findElement(By.xpath("(//span[@class='grid-flex grid-am'])[1]"));//bookatestride
	Booktestride.click();
	 /* try {
		 
		 Booktestride.click();
		 
	 }catch(Exception e) {
		 Booktestride=driver.findElement(By.xpath("//button[@data-hash='testride']/span"));
		 Booktestride.click();
	 }*/
	 Wait();
	 Common.FinanceschemeMSD();
		
		Wait();
		driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
		driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
		driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Maharashtra");
		Wait();
		driver.findElement(By.xpath("//button[contains(text(),'BOOK TEST RIDE')]")).click();
		Wait();
		driver.findElement(By.xpath("//body/div[@id='fancybox-container-2']/div[2]/div[4]/div[1]/div[1]/button[1]/*[1]")).click();
		Wait();
}
public static void booktestRide() throws Exception {
	
	Wait();
	 WebElement Booktestride=driver.findElement(By.xpath("(//span[@class='grid-flex grid-ac grid-am'])[1]"));//bookatestride
	Booktestride.click();
	 /* try {
		 
		 Booktestride.click();
		 
	 }catch(Exception e) {
		 Booktestride=driver.findElement(By.xpath("//button[@data-hash='testride']/span"));
		 Booktestride.click();
	 }*/
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
public static void EMICalculator() throws Exception {
	
	WebElement Emicalculator=driver.findElement(By.xpath("//span[@class='h__mr10']"));
	try {
		Emicalculator.click();
		Wait();
	}catch (Exception e) {
		Emicalculator=driver.findElement(By.xpath("//span[@class='h__mr10']"));
		Emicalculator.click();
		Wait();
	}
	WebElement LoanAmount=driver.findElement(By.xpath("//div[@id='loanamountslider']//div[@class='noUi-handle noUi-handle-lower']"));
	WebElement Loantermslider=driver.findElement(By.xpath("//div[@id='loantermslider']//div[@class='noUi-handle noUi-handle-lower']"));
	Actions move = new Actions(driver);
	move.moveToElement(LoanAmount).clickAndHold().moveByOffset(150,0).release().perform();
	
	Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"loanamount\"]")).getAttribute("value"),propinit("common","LoanAmt"));
	move.moveToElement(Loantermslider).clickAndHold().moveByOffset(70,0).release().perform();
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='emi-calc__val']")).getText(),propinit("common","LoanMonths"));
	Thread.sleep(3500);
	Wait();
}

public static void MSCDdropdown() throws Exception {
	
	Select model=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_bike_model']")));
		model.selectByIndex(1);
		Wait();
		Select state=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-state']")));
		state.selectByIndex(1);
		Wait();
		Select city=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_city']")));
		city.selectByIndex(1);
		Wait();
		Select Del=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_dealer']")));
		Del.selectByIndex(0);
	}
public static void perakpage() throws Exception {
	
	WebElement Video1=driver.findElement(By.xpath("//div[@id='player-home-0']//img[@class='v-card__play h__icon']"));
	try{
		Video1.click();
	}catch(Exception e) {
		Video1=driver.findElement(By.xpath("//div[@id='player-home-0']//img[@class='v-card__play h__icon']"));
		Video1.click();
	}
	Wait();
	driver.navigate().refresh();
	Wait();
	driver.findElement(By.xpath("//span[@class='h__icon-arrow']")).click();
	Wait();
	driver.findElement(By.xpath("//span[@class='h__icon-arrow']")).click();
	Wait();
	//PerakCommonMethods.Images();
	Wait();
}
public static void jawa42threesixty() throws Exception {
	

	WebElement image=driver.findElement(By.xpath("//*[@id=\"product-360\"]/div/div"));
	try {
		
		image.click();
	}catch(Exception r) {
		image=driver.findElement(By.xpath("//*[@id=\"product-360\"]/div/div"));
		
		image.click();
	}
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
public static void PerakBookNow() throws Exception {
	
	WebElement BookOnline=driver.findElement(By.xpath("/html/body/div[1]/div[9]/button[2]/span"));
  BookOnline.click();
	/*	try {
		BookOnline.click();
		
	}catch(Exception e) {
		BookOnline=driver.findElement(By.cssSelector("div.page.page:nth-child(3) div.hero.h__relative div.hero__cont.grid-flex.grid-col.grid-sb div.hero__btn-grid.grid.grid-2 button.btn-pri.js-open-sidebar.js-analytics-element > span.banner__btn-lg.h__display-inline.h__relative"));
		BookOnline.click();
		
	}*/
	Wait();
	Common.BookOnlineMSD();
	driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
	driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
	driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
	driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
	Wait();
	
	

	
}
public static void jawa42BookNow() throws Exception {
	WebElement jawa42=driver.findElement(By.xpath("//a[3]//i[1]"));
	try{
		jawa42.click();
	}catch(Exception e){
		jawa42=driver.findElement(By.xpath("//a[3]//i[1]"));
		jawa42.click();
	}
	Wait();
	WebElement BookOnline=driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[6]/button[2]/span/span[1]"));
	BookOnline.click();
	/*try {
		
		BookOnline.click();
	}catch(Exception f){
		BookOnline=driver.findElement(By.xpath("(//button[@class='btn-pri js-open-sidebar js-id_variant js-analytics-element']/span[1])[1]"));
		BookOnline.click();
	}
	Wait();*/
	WebElement Color=driver.findElement(By.xpath("//span[contains(text(),'Nebula Blue (Glossy)')]"));
try {
		
		Color.click();
	}catch(Exception g){
		Color=driver.findElement(By.xpath("//span[contains(text(),'Nebula Blue (Glossy)')]"));
		Color.click();
	}
	Wait();
	WebElement Booknow=driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-book-now js-analytics-element']"));
try {
		
		Booknow.click();
	}catch(Exception g){
		Booknow=driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-book-now js-analytics-element']"));
		Booknow.click();
	}
	Wait();
	Common.BookOnlineMSD();
	driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
	driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
	driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
	driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
	Wait();
	Wait();
	
}
public static void BookNowBlackColor() throws Exception {
	
	WebElement Color=driver.findElement(By.xpath("(//img[@class='select-clr__fig h__img-contain'][1])[1]"));
	try {
		Color.click();
		
	}catch(Exception e) {
		
		Color=driver.findElement(By.xpath("(//img[@class='select-clr__fig h__img-contain'][1])[1]"));
		Color.click();
	}
	Wait();
	WebElement Booknow=driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-book-now js-analytics-element']"));
	try {
			
			Booknow.click();
		}catch(Exception g){
			Booknow=driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-book-now js-analytics-element']"));
			Booknow.click();
		}
	Wait();
	Common.BookOnlineMSD();
	driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
	driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
	driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
	driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
	
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
	Wait();
	
	
}
public static void Jawa42FinanceOffers() throws Exception {
	WebElement FinanceOffers=driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Finance Offers')]"));
	try{
		FinanceOffers.click();
	}catch(Exception e) {
		FinanceOffers=driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Finance Offers')]"));
		FinanceOffers.click();
	}
	
	Wait();
	 RegressionCommon.BookOnlineMSD();
	 Wait();
		driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");

	 driver.findElement(By.id("pan-number")).sendKeys("APCHPO7883L");
		driver.findElement(By.xpath("//input[@id='monthly-income']")).sendKeys("60000");
		driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");

		driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
		Wait();
}
public static void Jawa42EmiCal() throws Exception {
	WebElement Emical=driver.findElement(By.xpath("//span[contains(text(),'EMI Calculator')]"));
	try{
		Emical.click();
	}catch(Exception e) {
		Emical=driver.findElement(By.xpath("//span[contains(text(),'EMI Calculator')]"));
		Emical.click();
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
public static void Jawa42booktestRide() throws Exception {
	
	
	WebElement jawa42=driver.findElement(By.xpath("//a[3]//i[1]"));
	try{
		jawa42.click();
		}catch(Exception e) {
			jawa42=driver.findElement(By.xpath("//a[3]//i[1]"));
			jawa42.click();
			Wait();
		}
	
	Wait();
	 driver.findElement(By.xpath("//span[@class='grid-flex grid-ac grid-am'][contains(text(),'Book a test ride')]")).click();//bookatestride
	 Wait();
	 RegressionCommon.BookOnlineMSD();

		driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
		driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
		driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
			driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
			Wait();
			
}
public static void Day4Test() throws Exception {
	
	utils.Scroll();
	WebElement MediaSpotlight=driver.findElement(By.xpath("//span[@class='h__uppercase h__mr20']"));
	try{
		MediaSpotlight.click();
		
	}catch(Exception e) {
		MediaSpotlight=driver.findElement(By.xpath("//span[@class='h__uppercase h__mr20']"));
		MediaSpotlight.click();
	}
	Wait();
driver.navigate().back();
WebElement VideoNext=driver.findElement(By.xpath("//div[@class='v-card__list h__relative']//span[@class='h__icon-arrow']"));
VideoNext.click();

try {
	VideoNext.click();
	Wait();
}catch(Exception e) {
	
	VideoNext=driver.findElement(By.xpath("//div[@class='v-card__list h__relative']//span[@class='h__icon-arrow']"));
	VideoNext.click();
	Wait();
}
VideoNext.click();
Wait();
WebElement WhatsappNum=driver.findElement(By.xpath("//input[@id='whatsappsubscriber-mobile']"));
try {
WhatsappNum.sendKeys("9700667771");
}catch(Exception e) {
	WhatsappNum=driver.findElement(By.xpath("//input[@id='whatsappsubscriber-mobile']"));
	WhatsappNum.sendKeys("9700667771");
	driver.findElement(By.xpath("//*[@id=\"whatsapp-subscriber-form\"]/fieldset/button")).click();
	Wait();
}
driver.findElement(By.xpath("//*[@id=\"whatsapp-subscriber-form\"]/fieldset/button")).click();
Wait();
}
}
