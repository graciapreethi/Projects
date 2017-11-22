package week2.assigments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://legacy.crystalcruises.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementByLinkText("GUEST CHECK-IN").click();
			Set<String> allWindowSet =  driver.getWindowHandles();
			
			List<String> allWindowList = new ArrayList<String>();
			allWindowList.addAll(allWindowSet);
			
			String secondwindow = allWindowList.get(1);
			
			driver.close();
			
			

	}

}
