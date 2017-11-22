package leaftaps.lead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inatechspecific.InatechWrappers;

public class CreateLead extends InatechWrappers  {	

	
	
	
	@Test (dataProvider =  "fetchData")
	public void createLead(String cName,String fName,String lName) throws Exception{
		
		//Click on create lead		
		clickByLink("Create Lead");
		
		//Enter the company name
		enterById("createLeadForm_companyName", cName);
		
		//Enter the first name
		enterById("createLeadForm_firstName",fName);
		
		//Enter the last name
		enterById("createLeadForm_lastName",lName);
		
		//click submit
		clickByName("submitButton");
		
		// get text 
		verifyTextById("viewLead_companyName_sp", cName);		
		
	}

	@DataProvider(name = "fetchData")
	public String[][] getData(){
		String [][] data = new String[2][3];
		data[0][0] = "Inatech";
		data[0][1] = "Preethi";
		data[0][2] = "Gracia";
		data[1][0] = "Inatech";
		data[1][1] = "Nithin";
		data[1][2] = "Timothy";
		return data;
		
	}
}
