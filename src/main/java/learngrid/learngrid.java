package learngrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class learngrid {
	
		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			 //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//ChromeDriver driver = new ChromeDriver();
			
			DesiredCapabilities dc =  new DesiredCapabilities();
			dc.setPlatform(Platform.MAC);
			dc.setBrowserName("chrome");
			
			//RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.1.30.23:4444/wd/hub"), dc);
			
			//sauce labs			
			RemoteWebDriver driver = new RemoteWebDriver(new URL("http://rams7573:80e4f021-dda1-4c6d-83e7-051e8311c732@ondemand.saucelabs.com/wd/hub"), dc);		 
				
				
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



