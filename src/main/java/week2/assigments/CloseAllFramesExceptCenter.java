package week2.assigments;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllFramesExceptCenter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			
			// set URL for the URL
			driver.get(" http://layout.jquery-dev.com/demos/iframe_local.html");			
					
			// west			
			driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
			
			//east
			driver.findElementByXPath("/html/body/div[2]/p/button").click();
			
			//switch to frame
			driver.switchTo().frame("childIframe");	
			
			//iframe west
			driver.findElementByXPath("/html/body/div[2]/p/button").click();
			
			//Iframe East
			driver.findElementByXPath("/html/body/div[3]/p/button").click();
			
	}

}
