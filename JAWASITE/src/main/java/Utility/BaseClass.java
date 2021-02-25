package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.openxml4j.opc.Package;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

public class BaseClass {

public static WebDriver driver;
	
	public static Properties prop;
	
public static String propinit(String filename,String Locatername) {
		
		if(prop==null) {
			prop=new Properties();
			try {
				
	FileInputStream fis=new FileInputStream("C:\\Users\\mfcwl1\\git\\repository7\\JAWASITE\\src\\main\\java\\Config\\"+filename+".properties");
				prop.load(fis);
			
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
		String data=prop.getProperty(Locatername);
		return data;
	}

	public static void Wait() throws Exception {
		Thread.sleep(2000);
	}
	public static void LaunchBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mfcwl1\\git\\repository7\\JAWASITE\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
			
			FirefoxOptions options=new FirefoxOptions();
			options.setCapability("BrowserName","Firefox");
			options.setCapability("Version","56.0");
			options.setCapability("Platform",Platform.WINDOWS);
			options.setCapability("marionette",false);
			System.setProperty("webdriver.gecko.driver","C:\\Users\\mfcwl1\\Desktop\\MFCWL\\jars\\geckodriver-v0.9.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver(options);
		}
		driver.manage().window().maximize();
	}
	public static String ExcelSheetdata(String Sheetname,int row,int col) throws Exception {
		File f=new File("C:\\Users\\mfcwl1\\Desktop\\JAWA\\Report\\TestReport.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet(Sheetname);
		XSSFCell cel=sheet.getRow(row).getCell(col);
		String data1=cel.toString();
		
		return data1;
	}
	public static String Exceldata(String Sheetname,int row,int col) throws Exception {
		File f=new File("C:\\Users\\mfcwl1\\Desktop\\JAWA\\AutomationTestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet(Sheetname);
		XSSFCell cel=sheet.getRow(row).getCell(col);
		String data1=cel.toString();
		
		return data1;
	}
	public static void WriteData(int row,int col,String Value) throws Exception {
		File f=new File("C:\\Users\\mfcwl1\\Desktop\\JAWA\\Report\\TestReport.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("report");
		 Row rw= sheet.getRow(row);
			Cell cl=rw.createCell(col);
		        
		//	cl.setCellType(CellType.STRING);
		        
			cl.setCellValue(Value);
			FileOutputStream fos=new FileOutputStream(f);
			book.write(fos);
			fos.close();
		
	}
	public static void WriteData1(int row,int col,String Value) throws Exception {
		File f=new File("C:\\Users\\mfcwl1\\Desktop\\JAWA\\Report\\Test1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("report");
		 Row rw= sheet.getRow(row);
			Cell cl=rw.createCell(col);
		        
			cl.setCellValue(Value);
			FileOutputStream fos=new FileOutputStream(f);
			book.write(fos);
			fos.close();
		
	}
	public static void WriteDataTest(String dataToWrite) throws Exception {
		File f=new File("C:\\Users\\mfcwl1\\Desktop\\JAWA\\Report\\Test1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("report");
		 
		        
		//	cl.setCellType(CellType.STRING);
		        
			
			int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

		    //Get the first row from the sheet

		    Row rw = sheet.getRow(1);

		    //Create a new row and append it at last of sheet

		  Row newRow = sheet.getRow(rowCount+1);


		    for(int j = 0; j < rw.getFirstCellNum(); j++){

		        //Fill data in row

		        Cell cell = newRow.createCell(j);

		        cell.setCellValue(dataToWrite);

		    }

		   

		    FileOutputStream outputStream = new FileOutputStream("C:\\Users\\mfcwl1\\Desktop\\JAWA\\Report\\Test1.xlsx");

		    //write data in the excel file

		    book.write(outputStream);


		    outputStream.close();
			
		
	}
	public static void Application() {
		driver.get("https://www.jawamotorcycles.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	public void Click(String xpathele) {
		
		getElement(xpathele).click();
	}
	public void type(String xpathele,String data) {
		
		getElement(xpathele).sendKeys(data);
	}
	public WebElement getElement(String locatorKey) {
		WebElement e=null;
		try{
		if(locatorKey.endsWith("_id"))
			e = driver.findElement(By.id(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_name"))
			e = driver.findElement(By.name(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_xpath"))
			e = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
		else{
			
			Assert.fail("Locator not correct - " + locatorKey);
		}
		
		}catch(Exception ex){
			// fail the test and report the error
			
			ex.printStackTrace();
			Assert.fail("Failed the test - "+ex.getMessage());
		}
		return e;
	}
}
