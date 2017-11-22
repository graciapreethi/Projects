package testcases.usingwrapper;

import wrappers.*;

import org.junit.Test;

public class CreateLead extends GenericWrappersInaTech  {	
	
	@Test	
	public void createLead() throws Exception{
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
				
		//Click on create lead		
		clickByLink("Create Lead");
		
		//Enter the company name
		enterById("createLeadForm_companyName", "Inatech India Pvt Ltd");
		
		//Enter the first name
		enterById("createLeadForm_firstName", "Preethi");
		
		//Enter the last name
		enterById("createLeadForm_lastName", "Gracia");
		
		//click submit
		clickByName("submitButton");
		
		// get text 
		verifyTextById("viewLead_companyName_sp", "Inatech");		
		
	}

}
