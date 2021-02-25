package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageLocaters.Homepage;
import Utility.BaseClass;
import Utility.utils;

public class HomepageCommon extends BaseClass{
public static void dealers() throws Exception {
	
	Select state=new Select(driver.findElement(By.xpath("//select[@id='dealer-id_state']")));
	state.selectByIndex(1);
	Select City=new Select(driver.findElement(By.xpath("//select[@id='dealer-id_city']")));
	City.selectByIndex(1);
	driver.findElement(By.xpath("//button[@class='dealer__btn btn-outline js-dealer-search js-analytics-element']")).click();
	Wait();
	driver.findElement(By.xpath("//a[@class='address-card__map grid-flex grid-am js-get-direction']")).click();
	Wait();
	}
	

	public static void day3test() throws Exception {
		WebElement Steedofsteel=driver.findElement(By.xpath("//a[@class='steeds__btn btn-outline h__lc js-analytics-element']"));
	try{
		Steedofsteel.click();
		}catch(Exception e) {
			Steedofsteel=driver.findElement(By.xpath("//a[@class='steeds__btn btn-outline h__lc js-analytics-element']"));
			Steedofsteel.click();
		}
	
   Wait();
   driver.findElement(By.xpath("//button[@class='stable-list__ctrl-next tns-controls__prev grid-flex grid-ac grid-am']")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@class='stable-list__ctrl-next tns-controls__prev grid-flex grid-ac grid-am']")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@class='stable-list__ctrl-next tns-controls__prev grid-flex grid-ac grid-am']")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@class='stable-list__ctrl-next tns-controls__prev grid-flex grid-ac grid-am']")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@class='stable-list__ctrl-next tns-controls__prev grid-flex grid-ac grid-am']")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//button[@class='stable-list__ctrl-next tns-controls__prev grid-flex grid-ac grid-am']")).click();
   Thread.sleep(1000);
   Assert.assertEquals(driver.getTitle(), "JAWA Motorcycles | JAWA Bikes Collections | JAWA Motorcycle Company");{
		System.out.println("Steeds Of Steel page validation Success..");}
   
   driver.navigate().back();
   Wait();
   WebElement JawaRig=driver.findElement(By.xpath("//a[contains(text(),'The Jawa RIG')]"));
   try {
	   
	   JawaRig.click();
	   Wait();
	   
   } catch(Exception e) {
	   JawaRig=driver.findElement(By.xpath("//a[contains(text(),'The Jawa RIG')]"));
	   JawaRig.click();
	   Wait();
   }
   Assert.assertEquals(driver.getTitle(), "Gear Up your Ride | Jawa Bike Accessories");{
		System.out.println("The Jawa RIG page validation Success..");}
   
   driver.navigate().back();
   Wait();
   WebElement RiderEnsemble=driver.findElement(By.xpath("//a[contains(text(),'Rider Ensemble')]"));
try {
	   
	   RiderEnsemble.click();
	   Wait();
	   
   } catch(Exception e) {
	   RiderEnsemble=driver.findElement(By.xpath("//a[contains(text(),'Rider Ensemble')]"));
	   RiderEnsemble.click();
	   Wait();
   }
Assert.assertEquals(driver.getTitle(), "Gear Up your Ride | Jawa Bike Accessories");{
	System.out.println("Rider Ensemble page validation Success..");
}

driver.navigate().back();
Wait();
   

	}
	
public static void FinanceSchemes() throws Exception {
	driver.findElement(By.xpath("//body/div[1]/div[2]/div[4]/div[1]/div[3]/div[2]/a[2]")).click();
		   Wait();
		   driver.findElement(By.xpath("//div[contains(text(),'Choose Your Motorcycle')]/following::div[4]")).click();//jawa
		   driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
		   Wait();
		   Select sl=new Select(driver.findElement(By.xpath("//select[@id='finance-scheme']")));
		   sl.selectByIndex(1);
	Common.FinanceschemeMSD();
	driver.findElement(By.id("pan-number")).sendKeys("APCHPK7883H");
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hari");
	driver.findElement(By.xpath("//input[@id='monthly-income']")).sendKeys("100000");
	driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
	driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
		//driver.findElement(By.xpath("//button[contains(text(),'Apply Now')]")).click();
		Wait();
		Wait();
	}
	public static void BookTestRide() throws Exception {
		WebElement BookTestRide=driver.findElement(By.xpath("//span[@class='grid-flex grid-am'][contains(text(),'Book a test ride')]"));
		try {
			BookTestRide.click();
			Wait();
		}catch(Exception e) {
			BookTestRide=driver.findElement(By.xpath("//span[@class='grid-flex grid-am'][contains(text(),'Book a test ride')]"));
			BookTestRide.click();
			Wait();
			}
		Select model=new Select(driver.findElement(By.xpath("//select[@id='id-bike-model']")));
		model.selectByIndex(1);
		Wait();
		Common.FinanceschemeMSD();
		driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
		driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
		driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-user-info-form-submit js-analytics-element']")).click();
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
	public static void Day4Test() throws Exception {
		
		utils.Scroll();
		Homepage.MediaSpotlight.click();
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
