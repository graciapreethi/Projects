package leaftaps.leads.provider;



import org.testng.annotations.Test;

import inatechspecific.InatechWrappers;

public class EditLead extends InatechWrappers{
	
	@Test
	public void editLead() throws Exception  {		
				
	    //Leads
		clickByLink("Leads");	      
	    
	    //Find Leads	   
	    clickByLink("Find Leads");
	    
	    //first name	    
	    enterByXpath("//*[@id='ext-gen248']","preethi");	
	    //firstName
	    enterByName("firstName", "preethi");
	    		
	    // find leads
	    clickByXpath("//*[@id='ext-gen334']");
	    //clickByClassName("x-btn-text");
	    
	    Thread.sleep(3000);
	      
	    
	    clickByLink("Preethi");
	    
	    //Edit	       
	    clickByLink("Edit");
	    
	    //Enter the updateLeadForm_companyName
	  	enterById("updateLeadForm_companyName", "Inatech123");
	    
	  	clickByName("submitButton");
	    
	  	//verify text
	 	//verifyTextById("viewLead_companyName_sp", "Inatech123");	 	
	 	
	    
	}

	
}