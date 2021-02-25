package TestSuite;


import java.util.List;

//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class BrokenImage extends BaseClass{

	private int invalidImageCount;

	@BeforeClass
	public void setUp() {
		LaunchBrowser("chrome");
		Application();
	}

	@Test
	public void validateInvalidImages() {
		List<WebElement> imagesList = driver.findElements(By.tagName("img")); 
		System.out.println("Total no. of images are " + imagesList.size()); 

		for (WebElement imgElement : imagesList) { 
		 if (imgElement != null) { 
		  try { 
		 //  CloseableHttpClient client = HttpClientBuilder.create().build(); 
		//   HttpGet request = new HttpGet(imgElement.getAttribute("src")); 
		//   HttpResponse response = ((org.apache.http.client.HttpClient) client).execute(request); 

		   // verifying response code he HttpStatus should be 200 if not, 
		   // increment as invalid images count 

		 //  if (response.getStatusLine().getStatusCode() != 200) 
		     invalidImageCount++; 
		   } catch (Exception e) { 
		     e.printStackTrace(); 
		   }
		  } 
		 } 

		System.out.println("Total no. of invalid images are " + invalidImageCount);
		}
}
