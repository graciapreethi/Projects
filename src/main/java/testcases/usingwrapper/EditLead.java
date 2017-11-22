package testcases.usingwrapper;

import wrappers.*;

import org.junit.Test;

public class EditLead extends GenericWrappersInaTech{
	
	@Test
	public void editLead() throws Exception  {
		
		invokeApp("chrome", "http://www.leaftaps.com/opentaps");
		
		//Enter the UserName
		enterById("username", "DemoSalesManager");
		//Enter the Password
		enterById("password", "crmsfa");
		
		//Click on the Login		
		clickByClassName("decorativeSubmit");
		
		//Verify the text		
		verifyTextByXpath("//*[@id='form']/h2","Demo Sales Manager");
		
		//Click Action		
		clickByXpath("//*[@id='button']/a/img");
				
	    //Leads
		clickByLink("Leads");	      
	    
	    //Find Leads	   
	    clickByLink("Find Leads");
	    
	    //first name	    
	    enterByXpath("//*[@id='ext-gen248']","preethi");	    		
	    		
	    // find leads
	    clickByXpath("//*[@id='ext-gen334']");	    
	    
	    clickByLink("Preethi");
	    
	    //Edit	       
	    clickByLink("Edit");
	    
	    //Enter the updateLeadForm_companyName
	  	enterById("updateLeadForm_companyName", "Inatech123");
	    
	  	clickByName("submitButton");
	    
	  	//verify text
	 	verifyTextById("viewLead_companyName_sp", "Inatech123");
	    
	}

}