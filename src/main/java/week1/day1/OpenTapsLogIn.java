package week1.day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTapsLogIn {

	public static void main(String[] args) {
		
		// set path of driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// set URL for the URL
		driver.get("http://www.leaftaps.com/opentaps");		
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		//driver.manage().window().maximize();
		
		// Pass the user Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// Pass the password		
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click the login
		driver.findElementByClassName("decorativeSubmit").click();
		
	    String welcometext = driver.findElementById("form").getText();
	    welcometext = welcometext.replaceAll("<br\\/>"," ");
	     System.out.println(welcometext);
	    
	     //
	    if (welcometext.contains("Demo Sales Manager"))
	    	System.out.println("login passed");
	    else
	    	System.out.println("login failed");
	    
	    
	    driver.findElementByXPath("//*[@id='button']/a/img").click();	
	    
	    driver.findElementByLinkText("Create Lead").click();
	    
	    //company Name
	    
	    driver.findElementById(" ").sendKeys("Inatech");	    
	    driver.findElementById("createLeadForm_firstName").sendKeys("Preethi");
	    driver.findElementById("createLeadForm_lastName").sendKeys("Gracia");

	    driver.findElementByName("submitButton").click();
	    
	    String companyText = driver.findElementById("viewLead_companyName_sp").getText();  
	    
	    
	    if (companyText.contains("Inatech"))
	    	System.out.println("Create Lead passed");
	    else
	    	System.out.println("Create Lead failed");
	    
	  	}

}
