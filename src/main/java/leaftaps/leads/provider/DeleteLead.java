package leaftaps.leads.provider;


import org.junit.Test;
import wrappers.GenericWrappersInaTech;

public class DeleteLead extends GenericWrappersInaTech {

	@Test
	public void deleteLead() throws Exception {
		// TODO Auto-generated method stub
		invokeApp("chrome", "http://www.leaftaps.com/opentaps");
		
		///Enter the UserName
		enterById("username", "DemoSalesManager");
		//Enter the Password
		enterById("password", "crmsfa");
		
		///Click on the Login		
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
	    
	    /* need to complete*/
	     //viewLead_companyName_sp
	    String companyText =  driver.findElementById("viewLead_companyName_sp").getText();
	    
	    String LeadId = companyText.substring(companyText.indexOf("(")+1,companyText.indexOf(")"));
	    System.out.println(LeadId);
	    
	  // int numLeadId = Integer.parseInt(LeadId);
	    
	    //Delete
	  // driver.findElementByLinkText("Delete").click();
	}

}
