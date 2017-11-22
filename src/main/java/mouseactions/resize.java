package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {
	   public static void main(String[] args) {

				// set path of driver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				// set URL for the URL
				driver.get("https://jqueryui.com/resizable/");		
				
				driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
				//driver.manage().window().maximize();
				
				
				 driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
				
				 WebElement resizable =   driver.findElementById("resizable");
				 
				 Actions builder = new Actions(driver);
				
				 builder.moveToElement(resizable, 1200,1200).build().perform();
				 
								 
		   }

}
