package TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import PageLocaters.Homepage;
import Utility.BaseClass;

public class Day5Test2 extends BaseClass{

	@BeforeTest
	public void Setup() throws Exception {
		LaunchBrowser("chrome");
		
		Application();
		
	}

	@Test
	public void Search() throws Exception {
  
	
		Homepage.SearchClick.click();
		  
		  	Homepage.Search.sendKeys("jawa");
		  	WebElement Search1=driver.findElement(By.xpath("//div[@id='view-search']//li[1]"));
				Search1.click();
				Wait();
			//	driver.navigate().back();
				
				WebElement SearchClick=driver.findElement(By.xpath("//button[@class='header__btn header__search js-open-search']"));
				WebElement Search=driver.findElement(By.xpath("//input[@id='search-input']"));
				
				try{
					Homepage.JawaHomeClick.click();
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
					Homepage.JawaHomeClick.click();
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
					Homepage.JawaHomeClick.click();
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
				}
		}
	
	@AfterTest
	public void teardown() { 
		
		driver.close();
	}
}
