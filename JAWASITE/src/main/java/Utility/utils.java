package Utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.google.common.io.Files;

public class utils extends BaseClass{

	public static JavascriptExecutor jse;
	   static FileInputStream reader;
		public static void Scroll() {
			
			jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0,1550);");
			
		}
		
	/*	public static ArrayList<Object[]> getdatafromexcel() {
			ArrayList<Object[]> mydata=new ArrayList<Object[]>();
			try {
				 reader=new FileInputStream("C:\\Users\\mfcwl1\\Desktop\\CarnBike\\urlSheet.xlsx");
				 XSSFWorkbook wb=new XSSFWorkbook();
					XSSFSheet sheet=wb.getSheet("Sheet1");
					for(int rownum=2;rownum<=sheet.getLastRowNum();rownum++) {
						String data=sheet.getRow(rownum).getCell(0).getStringCellValue();
						Object ob[]= {data};
						mydata.add(ob);
					}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return mydata;
		}

		
		 public static ArrayList<String> readExcel(String filepath) throws  IOException {
			 FileInputStream file= new FileInputStream(filepath);
		      HSSFWorkbook workbook=new HSSFWorkbook(file);
		        HSSFSheet sheet = workbook.getSheet("Sheet1");
		        HSSFCell row=sheet.getRow(0).getCell(0);
		     
		        Iterator<Row> rowit=sheet.iterator();
		        ArrayList<String> list=new ArrayList<String>();
		        while(rowit.hasNext()) {
		        
		        	list.add(rowit.next().getCell(1).getStringCellValue());
		        	 
		     	}
		        	
		         return list;
	     }

	/*	 public static WebElement getElement(String locatorKey) {
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
			}*/
		

		public static void Screenshot(String fileName) throws Exception {
			
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f,new File("D:\\Ediig\\JAWA\\src\\Screenshots"+fileName+".png"));
		}
		public static void tearDown() {

			
			driver.close();
			driver.quit();
		}

}
