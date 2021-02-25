package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageLocaters.BookOnline;
import PageLocaters.Homepage;
import PageLocaters.Jawa42;
import Utility.BaseClass;


public class Jawa42Common extends BaseClass{

	public static void Images() throws Exception {
		
		driver.findElement(By.xpath("//div[@class='gallery__figcaption']")).click();
		driver.findElement(By.xpath("//div[@class='gallery__figcaption']")).click();

		Wait();
		driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--arrow_right']//div//*[local-name()='svg']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--arrow_right']//div//*[local-name()='svg']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--arrow_right']//div//*[local-name()='svg']")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--arrow_right']//div//*[local-name()='svg']")).click();
		Wait();
		driver.navigate().refresh();
		
		Wait();
	}
	public static void BookOnlineJawajourney() throws Exception {
		   driver.findElement(By.xpath("(//button[@class='booking-card__btn btn-outline h__mb20 js-open-slide js-analytics-element'])[3]")).click();//fourty two
		
		driver.findElement(By.xpath("//label[2]//img[1]")).click();
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
public static void reviewpageColorvariant() throws Exception {
		
		Select col=new Select(driver.findElement(By.xpath("//select[@id='booking-color']")));
		col.selectByIndex(0);
		Assert.assertEquals(driver.findElement(By.xpath("//span[@id='booked-color-name']")).getText(),Exceldata("Payment", 0, 0));
		Select Var=new Select(driver.findElement(By.xpath("//select[@id='booking-variant']")));
		Var.selectByIndex(0);
		Assert.assertEquals(driver.findElement(By.xpath("//span[@id='booking-variant-name']")).getText(),Exceldata("Payment", 1, 0));

		}
public static void priceCheck() throws Exception {
		
		Select city=new Select(driver.findElement(By.xpath("//select[@id='city']")));
		city.selectByVisibleText("Hyderabad");
		Wait();
		String Hydprice=Jawa42.SinglePrice.getText();
		String Hydpricev=Hydprice.substring(2,10);
		
		//System.out.println(pricev+ " "+propinit("jawaprice","jawaMaroonsingleAbs"));
		if(Hydpricev.equalsIgnoreCase(propinit("jawa42price","jawa42HydsingleGalactic"))) {
			
			System.out.println("Hyderabad single Chanel Abs Price Validation Success");
		}else {
			
			System.out.println("Hyd Price Validation failed");
		}
		city.selectByVisibleText("Chennai");
		Wait();
		String TNprice=Jawa42.DualPrice.getText();
		String TNpricev=TNprice.substring(2,10);
		
if(TNpricev.equalsIgnoreCase(propinit("jawa42price", "Jawa42TNDualGalactic"))) {
			
			System.out.println("Chennai Dual Chanel Abs Price Validation Success");
		}else {
			
			System.out.println("Chennai Price Validation failed");
		}
		
Select color=new Select(driver.findElement(By.xpath("//select[@id='bike-color']")));

		color.selectByIndex(0);
		Thread.sleep(1000);
	city.selectByVisibleText("Mumbai");
	
	String MIPrice=Jawa42.SinglePrice.getText();
	String MIPricev=MIPrice.substring(2, 10);
	//System.out.println(MIPricev);

	if(MIPricev.equalsIgnoreCase(propinit("jawa42price", "Jawa42MISingleNebula"))) {
		
		System.out.println("Mumbai single Chanel Abs Price Validation Success");
	}else {
		
		System.out.println("Mumbai Validation failed");
	}
city.selectByVisibleText("Bangalore");
	
	String BlrPrice=Jawa42.DualPrice.getText();
	String BlrPricev=BlrPrice.substring(2, 10);
	
	if(BlrPricev.equalsIgnoreCase(propinit("jawa42price", "Jawa42BlrDualNebula"))) {
		
		System.out.println("Bangalore single Chanel Abs Price Validation Success");
	}else {
		
		System.out.println(" Bangalore Validation failed");
	}
	color.selectByIndex(2);
	city.selectByVisibleText("New Delhi");
	Thread.sleep(1000);
	String DelhiPrice=Jawa42.SinglePrice.getText();
	String DelhiPricev=DelhiPrice.substring(2, 10);
	//System.out.println(DelhiPricev);
	//System.out.println(DelhiPrice + " "+DelhiPricev + " "+propinit("jawaprice", "JawaDelhiDualAbs"));
	if(DelhiPricev.equalsIgnoreCase(propinit("jawa42price", "Jawa42DelhiSingleStarlightBlue"))) {
		
		System.out.println("Delhi single Chanel Abs Price Validation Success...");
	}else {
		System.out.println("Delhi validation Failed..");
	}
	}
	public static void jawa42threesixty() throws Exception {
		//utils.Scroll();
		
		WebElement image=driver.findElement(By.xpath("//div[@class='cloudimage-inner-box']//div"));
		image.click();
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
	public static void BookNow() throws Exception {
		
		Homepage.jawa42.click();
		Wait();
		driver.findElement(By.xpath("//div[@class='banner__content']//span[@class='banner__btn-lg'][contains(text(),'Book Online -')]")).click();
		Wait();
		driver.findElement(By.xpath("//span[contains(text(),'Nebula Blue (Glossy)')]")).click();
		Wait();
		driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-book-now js-analytics-element']")).click();
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
	public static void FinanceOffers() throws Exception {
		Jawa42.FinanceOffers.click();
		
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
			driver.findElement(By.xpath("//body/div[@id='fancybox-container-5']/div[2]/div[4]/div[1]/div[1]/button[1]/*[1]")).click();
	Wait();
	}
public static void EmiCal() throws Exception {
		
		Jawa42.Emical.click();
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
}
