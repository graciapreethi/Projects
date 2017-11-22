package leaftaps.leads.provider;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inatechspecific.InatechWrappers;

public class CreateLead extends InatechWrappers  {	
	@BeforeClass
	public void setExcelName(){
		excelFileName = "CreateLead";
	}
	
	@Test (dataProvider =  "fetchData" )
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
	
	
}
