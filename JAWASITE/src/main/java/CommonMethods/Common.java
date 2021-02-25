package CommonMethods;



import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Utility.BaseClass;

public class Common extends BaseClass{

	public static void MSCDdropdown() throws Exception {
		
	Select model=new Select(driver.findElement(By.xpath("//select[@id='id-bike-model']")));
		model.selectByIndex(1);
		Wait();
		Select state=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-state']")));
		state.selectByIndex(1);
		Wait();
		Select city=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_city']")));
		city.selectByIndex(1);
		Wait();
		Select Del=new Select(driver.findElement(By.xpath("//select[@id='quickuserinfoform-id_dealer']")));
		Del.selectByIndex(1);
	}
	public static void FinanceschemeMSD() throws Exception {
		Select state=new Select(driver.findElement(By.xpath("//select[@id='id-state']")));
		state.selectByIndex(1);
		Wait();
		Select city=new Select(driver.findElement(By.xpath("//select[@id='id-city']")));
		city.selectByIndex(1);
		Wait();
		Select Del=new Select(driver.findElement(By.xpath("//select[@id='id-dealer']")));
		Del.selectByIndex(1);
		
	}
	public static void BookOnlinejourneyNew42() throws Exception {
		   driver.findElement(By.xpath("//button[@data-event-label='42']")).click();
		   driver.findElement(By.xpath("//label[1]//img[1]")).click();
		   driver.findElement(By.xpath("//*[text()='Next']")).click();
				Wait();
				 driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click();
					Wait();
					Common.BookOnlineMSD();
					Wait();
					driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
					driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
					
					driver.findElement(By.xpath("//input[@id='full-email']")).sendKeys("Hari.qaeng07@gmail.com");
					driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys("9700667771");
					
					//driver.findElement(By.xpath("//input[@id='user_agreement']")).click();
					driver.findElement(By.xpath("(//*[text()='Next'])[3]")).click();
					Wait();
			}
	public static void payment() throws Exception {
		
		driver.switchTo().frame("boltFrame");
		Wait();
		Wait();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// set google search bar value
		js.executeScript("document.getElementById('cardNumber').value='5123456789012346'");
		//driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("5123456789012346");
		js.executeScript("document.getElementById('cardExp').value='05/21'");
		//driver.findElement(By.id("cardExp")).sendKeys("0521");
		driver.findElement(By.id("cvvNumber")).sendKeys("123");
		driver.findElement(By.id("cardHolderName")).sendKeys("Test");
		Wait();
		Wait();
		driver.findElement(By.id("citrusCardPayButton")).click();
Thread.sleep(5000);
	
		Wait();
		Wait();
		////*[@id="password"]
		//js.executeScript("document.getElementById('password').value='123456'");
		//driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.id("submitBtn")).click();
		Wait();
		Wait();
		//ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(0));
	}
public static void TechSpecification() throws Exception {
		
		driver.findElement(By.xpath(propinit("TechnicalSpecifications","Engine"))).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Engine CC')]/following::div[1]")).getText(),propinit("TechnicalSpecifications","EngineCC"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Single Cylinder, 4 Stroke, Liquid Cooled, DOHC BSV')]")).getText(),propinit("TechnicalSpecifications","EngineType"));
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
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[4]/div/div/div/div/ul/li[5]/div/div/div/div[1]/div[2]")).getText(),propinit("TechnicalSpecifications","FrontBrakeType"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'280 MM')]")).getText(),propinit("TechnicalSpecifications","FrontDisksize"));
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'153 MM')]")).getText(),propinit("TechnicalSpecifications","RearDrumsize"));
		Wait();
		driver.findElement(By.xpath(propinit("TechnicalSpecifications","Wheels"))).click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Wheel and Tyres')]//following::div[6]")).getText(),propinit("TechnicalSpecifications","FrontTyre"));
		Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Wheel and Tyres')]//following::div[9]")).getText(),propinit("TechnicalSpecifications","RearTyre"));
		Wait();
	}
	public static void Signup() throws Exception {
		
		driver.findElement(By.xpath("//a[@class='signin__link js-mobile-signup']")).click();
		Wait();
		driver.findElement(By.xpath("//input[@id='signup-mobile-number']")).sendKeys("7777777777");
		driver.findElement(By.xpath("//input[@id='signup-name']")).sendKeys("krishna");
		driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-signup-request-otp']")).click();
		driver.findElement(By.xpath("//input[@id='digit-1']")).sendKeys("1111");
		Wait();
driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-verify-otp js-analytics-element']")).click();
Wait();
	}
	public static void BookOnlineJawajourney() throws Exception {
   driver.findElement(By.xpath("//div[@id='slide-a1']//div[1]//button[1]")).click();
   driver.findElement(By.xpath("//label[1]//img[1]")).click();
   driver.findElement(By.xpath("//*[text()='Next']")).click();
		Wait();
		driver.findElement(By.xpath("//input[@id='price2']")).click();
		Wait();
		 driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click();
			Wait();
			Common.BookOnlineMSD();
			Wait();
			driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys("Test");
			driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("Hari");
			
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
		Del.selectByIndex(1);
		
	}
	public static void reviewpageColorvariant() {
		
		Select col=new Select(driver.findElement(By.xpath("//select[@id='booking-color']")));
		col.selectByVisibleText("Grey");
		Select Var=new Select(driver.findElement(By.xpath("//select[@id='booking-variant']")));
		Var.selectByIndex(0);
		
		
	}
	
	
}
