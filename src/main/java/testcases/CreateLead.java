package testcases;

import org.testng.annotations.Test;

import inatechspecific.InatechWrappers;

public class CreateLead extends InatechWrappers  {	
	
	@Test (invocationCount= 2)
	public void createLead() throws Exception{
		
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
		//verifyTextById("viewLead_companyName_sp", "Inatech");		
		
	}

}
