package week2.assigments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofIframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			// set URL for the URL
			driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");	
			
			// get the list of frame elements 
			List<WebElement> frameslistOfPage = 	driver.findElementsByTagName("iframe");
						
			// prints the count of list
			//System.out.println("Number of frames :  " + frameslistOfPage.size());
			int countOfFrames = frameslistOfPage.size();
			for(   WebElement link : frameslistOfPage )
			{
				driver.switchTo().frame(link);
				List<WebElement> frameslistOfPage1 =	driver.findElementsByTagName("iframe");
				if (frameslistOfPage1.size()>0)
				{
				countOfFrames = countOfFrames + frameslistOfPage1.size();
				}
				 driver.switchTo().defaultContent();				 			 
				 
			}
			System.out.println(" Total count Of Frames " + countOfFrames );	
						
	}

}
