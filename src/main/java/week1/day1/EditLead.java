package week1.day1;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// set URL for the URL
		driver.get("http://www.leaftaps.com/opentaps");		
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		
		// Pass the user Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// Pass the password		
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click the login
		driver.findElementByClassName("decorativeSubmit").click();
		
	    String welcometext = driver.findElementById("form").getText();
	    welcometext = welcometext.replaceAll("<br\\/>"," ");
	     System.out.println(welcometext);
	    
	    if (welcometext.contains("Demo Sales Manager"))
	    	System.out.println("login passed");
	    else
	    	System.out.println("login failed");
	    //CRM/SFA
	    driver.findElementByXPath("//*[@id='button']/a/img").click();	
	    //Leads
	    driver.findElementByLinkText("Leads").click();
	    //Find Leads
	    driver.findElementByLinkText("Find Leads").click();
	    //  first name  
	    driver.findElementByXPath("//*[@id='ext-gen248']").sendKeys("preethi",Keys.TAB);
	    // find leads  
	    driver.findElementByXPath("//*[@id='ext-gen334']").click();
	    ////*[@id="ext-gen894"]
	    Thread.sleep(2000);
	    //driver.findElementByXPath("//*[@id='ext-gen894']").click();
	    //top1 lead 10021
	  // driver.findElementByLinkText("10021").click();
	   driver.findElementByLinkText("Preethi").click();
	    //Edit
	    driver.findElementByLinkText("Edit").click();
	    
	    driver.findElementById("updateLeadForm_companyName").clear();	    
	    driver.findElementById("updateLeadForm_companyName").sendKeys("Inatech123");
	    driver.findElementByName("submitButton").submit();
	    
	    Thread.sleep(1000);
	    
	    String companyName =    driver.findElementById("viewLead_companyName_sp").getText();
	    System.out.println(companyName);
	    
	    if (companyName.equals("Inatech123"))
	    {
	    System.out.println("The Company Name is updated as " + companyName);
	    }
	    else
	    	System.out.println("The Company Name is not updated as " + companyName);
	    
	}

}