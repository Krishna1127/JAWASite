package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageLocaters.Menu;
import Utility.BaseClass;


public class MenuCommonMethods extends BaseClass {
	
	public static void Login() throws Exception {
		
		Menu.Login.click();
		Wait();
		driver.findElement(By.xpath("//*[@id=\"mobile-number\"]")).sendKeys("9700667771");
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
public static void EditProfile() throws Exception {
	
	driver.findElement(By.xpath("//span[@class='other-menu__link-in'][contains(text(),'My Account')]")).click();
	Wait();
	driver.findElement(By.xpath("//button[@class='profile__edit grid-flex grid-am h__mb50 js-edit-priofile\']")).click();
	Wait();
	driver.findElement(By.xpath("//button[@class='input__edit grid-flex grid-am js-edit-btn']")).click();
	driver.findElement(By.id("quickuserinfoform-name")).clear();
	driver.findElement(By.id("quickuserinfoform-name")).sendKeys("Hema");
	driver.findElement(By.xpath("//button[@class='input__btn input__suffix js-edit-update']")).click();
	Wait();
	driver.navigate().back();
driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[4]/div[1]/div[1]/button[1]/*[local-name()='svg'][1]")).click();
	Wait();
	driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-close-small']//*[local-name()='svg']")).click();
	Wait();
	driver.findElement(By.xpath("//img[@class='h__icon h__icon-20']")).click();
	driver.findElement(By.xpath("//span[@class='header__nav-linkin'][contains(text(),'Signout')]")).click();
	Wait();
}
public static void BecomeDealer() throws Exception {
	Menu.DealerLoc.click();
	Wait();
	driver.findElement(By.xpath("//button[@class='dealer__btn btn-outline js-open-sidebar']")).click();
	Wait();
	driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys(propinit("Menu", "Name"));
	driver.findElement(By.xpath("//fieldset[2]//div[1]//input[1]")).sendKeys(propinit("Menu", "MailId"));
	driver.findElement(By.xpath("//input[@id='mobile-number']")).sendKeys(propinit("common", "MobileNum"));
	driver.findElement(By.xpath("//fieldset[4]//div[1]//input[1]")).sendKeys(propinit("common", "PAN"));
	driver.findElement(By.xpath("//input[@id='aadhar-number']")).sendKeys(propinit("Menu", "AdharNum"));
	driver.findElement(By.xpath("//input[@id='dealer-name']")).sendKeys(propinit("Menu", "DealerName"));
	driver.findElement(By.xpath("//input[@id='address-1']")).sendKeys(propinit("Menu", "Adress"));
	Select sel=new Select(driver.findElement(By.xpath("//select[@name='state']")));
	sel.selectByIndex(2);
	Select city=new Select(driver.findElement(By.xpath("//select[@id='dealershiplead-id_city']")));
	city.selectByIndex(1);
	Wait();
	driver.findElement(By.xpath("//button[@class='sidebar__action btn-grey js-dealer-form-submit js-analytics-element']")).click();
	Wait();
}
	public static void MenuNavigation() throws Exception {
		
		 WebElement Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			try {
				Menutxt.click();
				Wait();
			} catch (StaleElementReferenceException e) {
				  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
				 Menutxt.click();
				 
			}
		Wait();
		WebElement jawa=driver.findElement(By.xpath("//div[@class='model-menu submenu__pad submenu__line']//a[1]//img[1]"));
		try{
			jawa.click();
		}catch(Exception e) {
			jawa=driver.findElement(By.xpath("//div[@class='model-menu submenu__pad submenu__line']//a[1]//img[1]"));
			jawa.click();
		}
		
		if(driver.getTitle().equals("JAWA Jawa Price, Buy Jawa, JAWA Jawa Mileage, Review - JAWA Bikes")){
			System.out.println("Perak Page Validation Sucess");
		}else {
			System.out.println("Perak Page Validation Fail");
		}
		Wait();
		  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 
		}
	
	driver.findElement(By.xpath("//div[@class='model-menu submenu__pad submenu__line']//a[3]//img[1]")).click();//jawa
	
	if(driver.getTitle().equals("JAWA Forty Two Price, Buy Forty Two, JAWA Forty Two Mileage, Review - JAWA Bikes")){
		System.out.println("Jawa Page Validation Sucess");
	}else {
		System.out.println("Jawa Page Validation Fail");
	}

		Wait();
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 
		}
		Wait();
		driver.findElement(By.xpath("//div[@class='model-menu submenu__pad submenu__line']//a[4]//img[1]")).click();//42
		
		if(driver.getTitle().equals("JAWA Perak Price, Buy Perak, JAWA Perak Mileage, Review - JAWA Bikes")){
			System.out.println("Jawa42 Page Validation Sucess");
		}else {
			System.out.println("Jawa42 Page Validation Fail");
		}
		Wait();
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//*[@id=\"submenu\"]/div/div/div/div/div[3]/ul[1]/li[2]/a/span")).click();//kommuniti
		
		if(driver.getTitle().equals("Kommuniti - Reconnecting Fellow Riders of JAWA Motorcycles")){
			System.out.println("Kommuniti Page Validation Sucess");
		}else {
			System.out.println("Kommuniti Page Validation Fail");
		}
		Wait();
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'kogo trails')]")).click();
		Wait();
		
		if(driver.getTitle().equals("JAWA BLOG | KOGO")){
			System.out.println("Kogo Trails Page Validation Sucess");
		}else {
			System.out.println("Kogo trails Page Validation Fail");
		}
		
		driver.navigate().back();
		Wait();
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'IJYD 2020')]")).click();
		Wait();
			
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'Jawa Nomads')]")).click();
		Wait();
		

		if(driver.getTitle().equals("Jawa Nomads | JAWA")){
			System.out.println("Jawa Nomads Page Validation Sucess");
		}else {
			System.out.println("Jawa Nomads Page Validation Fail");
		}
		
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'gear')]")).click();
		Wait();
		

		if(driver.getTitle().equals("Gear Up your Ride | Jawa Bike Accessories")){
			System.out.println("Gear Page Validation Sucess");
		}else {
			System.out.println("Gear Page Validation Fail");
		}
		
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'The jawa rig')]")).click();
		Wait();
		

		if(driver.getTitle().equals("Gear Up your Ride | Jawa Bike Accessories")){
			System.out.println("Jawa Rig Page Validation Sucess");
		}else {
			System.out.println("Jawa Rig Page Validation Fail");
		}
		
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'Rider ensemble')]")).click();
		Wait();
		

		if(driver.getTitle().equals("Gear Up your Ride | Jawa Bike Accessories")){
			System.out.println("Rider Ensemble Page Validation Sucess");
		}else {
			System.out.println("Rider Ensemble Page Validation Fail");
		}
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'Fully Loaded RSA')]")).click();
		Wait();
		driver.findElement(By.xpath("//span[contains(text(),'More Details')]")).click();
		Wait();
	}
	
	public static void MenuNavigation2() throws Exception {
		WebElement Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 
		}
		
		Wait();
		WebElement DealerLoc=driver.findElement(By.xpath("//span[contains(text(),'Dealer Locator')]"));
	try{
		DealerLoc.click();
		
	}catch(Exception e) {
		DealerLoc=driver.findElement(By.xpath("//span[contains(text(),'Dealer Locator')]"));
		
		DealerLoc.click();
	}
		Wait();
		if(driver.getTitle().equals("Jawa Motorcycles Authorised Jawa Dealers in India | Find a Dealer")){
			System.out.println("Dealer Locater Page Validation Sucess");
		}else {
			System.out.println("Dealer Locater Page Validation Fail");
		}
		
		 Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'Finance Schemes')]")).click();
		Wait();
		
	//	Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"fancybox-container-3\"]/div[2]/div[4]/div/div/button"))).click().build().perform();
		Wait();
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'Emi Calculator')]")).click();
		Wait();
		if(driver.getTitle().equals("Jawa Bikes EMI Calculator - Finance Offers")){
			System.out.println("Emi Calculator Page Validation Sucess");
		}else {
			System.out.println("Emi Calculator Page Validation Fail");
		}
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]")).click();
		Wait();
		
		if(driver.getTitle().equals("JAWA Motorcycle Company | JAWA Motorcycles India")){
			System.out.println("Contact us Page Validation Sucess");
		}else {
			System.out.println("Contact US Validation Fail");
		}
		
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'TERMS OF USE')]")).click();
		Wait();
		
		if(driver.getTitle().equals("Jawa Motorcycles | Terms Of Use")){
			System.out.println("TERMS OF USE Page Validation Sucess");
		}else {
			System.out.println("TERMS OF USE Validation Fail");
		}
		
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'PRIVACY POLICY')]")).click();
		Wait();
		
		if(driver.getTitle().equals("Privacy Policy")){
			System.out.println("PRIVACY Page Validation Sucess");
		}else {
			System.out.println("PRIVACY Page Validation Fail");
		}
		try {
			Menutxt.click();
			Wait();
		} catch (StaleElementReferenceException e) {
			  Menutxt=driver.findElement(By.xpath("//span[contains(text(),'Menu')]"));
			 Menutxt.click();
			 Wait();
		}
		driver.findElement(By.xpath("//span[contains(text(),'DISCLAIMER')]")).click();
		Wait();
		
		if(driver.getTitle().equals("Jawa Motorcycles | Disclaimer")){
			System.out.println("Disclaimer Page Validation Sucess");
		}else {
			System.out.println("Disclaimer Page Validation Fail");
		}
	
	}
}
