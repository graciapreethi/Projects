package week1.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadScreenCapture {
	public static void main(String[] args) throws InterruptedException, IOException {
		// set path of driver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				// set URL for the URL
				driver.get("http://www.leaftaps.com/opentaps");		
				
				driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
				//driver.manage().window().maximize();
				capture(driver);
				// Pass the user Name
				driver.findElementById("username").sendKeys("DemoSalesManager");
				// Pass the password		
				driver.findElementById("password").sendKeys("crmsfa");
				//capture(driver);
				//Click the login
				driver.findElementByClassName("decorativeSubmit").click();
				//capture(driver);
			    String welcometext = driver.findElementById("form").getText();
			    welcometext = welcometext.replaceAll("<br\\/>"," ");
			     System.out.println(welcometext);
			    
			    if (welcometext.contains("Demo Sales Manager"))
			    	System.out.println("login passed");
			    else
			    	System.out.println("login failed");
			    
			    
			    driver.findElementByXPath("//*[@id='button']/a/img").click();				    
			    driver.findElementByLinkText("Create Lead").click();
			    
			    capture(driver);
			    //company Name
			    
			    driver.findElementById("createLeadForm_companyName").sendKeys("Inatech");	    
			    driver.findElementById("createLeadForm_firstName").sendKeys("Preethi");
			    driver.findElementById("createLeadForm_lastName").sendKeys("Gracia");

			    driver.findElementByName("submitButton").click();
			    
			    String companyText = driver.findElementById("viewLead_companyName_sp").getText();  
			   capture(driver);
			    
			    if (companyText.contains("Inatech"))
			    	System.out.println("Create Lead passed");
			    else
			    	System.out.println("Create Lead failed");
	}
	public static void capture(ChromeDriver driver ) throws IOException
	{
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./Images/createleadscreenshot"+  System.currentTimeMillis() + ".png"));
	}

}
