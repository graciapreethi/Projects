package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draggable {
	
	   public static void main(String[] args) {

			// set path of driver
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			// set URL for the URL
			driver.get("https://jqueryui.com/draggable/");		
			
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
			//driver.manage().window().maximize();
			
			
			 driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
			
			 WebElement draggable =   driver.findElementById("draggable");
			 
			 Actions builder = new Actions(driver);
			
			 builder.dragAndDropBy(draggable, 100, 100).build().perform();
			
	   }

}
