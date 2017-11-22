package week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
	    Thread.sleep(2000);
	    
	    driver.findElementByLinkText("Preethi").click();
	    
	     //viewLead_companyName_sp
	    String companyText =  driver.findElementById("viewLead_companyName_sp").getText();
	    
	    String LeadId = companyText.substring(companyText.indexOf("(")+1,companyText.indexOf(")"));
	    System.out.println(LeadId);
	    
	    int numLeadId = Integer.parseInt(LeadId);
	    
	    //Delete
	  // driver.findElementByLinkText("Delete").click();
	}

}
