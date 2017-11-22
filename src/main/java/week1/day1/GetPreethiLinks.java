package week1.day1;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPreethiLinks {
	 public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			// set URL for the URL
			driver.get("https://www.google.co.in");	
			
			// enter Preethi in the search box
			driver.findElementById("lst-ib").sendKeys("Preethi",Keys.ENTER);
			
			// get the list of link elements 
			List<WebElement> anchorlistOfPreethi = 	driver.findElementsByTagName("a");
			
			// prints the count of list
			System.out.println("Number of links :  " + anchorlistOfPreethi.size());
			
			// iterate the list 
			for(WebElement link: anchorlistOfPreethi)
			{
				System.out.println("Text : " + link.getText());						
				System.out.println("Attribute : "  + link.getAttribute("href"));				
				
			}
	 }

}
