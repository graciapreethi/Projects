package inatechspecific;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wrappers.GenericWrappersInaTech;

public class InatechWrappers extends GenericWrappersInaTech {
	
	
	public String excelFileName;
	
	
	@Parameters({"browser","url","uName","pwd"})
	@BeforeMethod//(groups= "common")
	public void login(String browser,String url,String uName,String pwd ) throws Exception  {
        invokeApp(browser, url);
		
		//Enter the UserName
		enterById("username", uName);
		//Enter the Password
		enterById("password", pwd);
		
		//Click on the Login		
		clickByClassName("decorativeSubmit");
		
		//Verify the text		
		verifyTextByXpath("//*[@id='form']/h2","Demo Sales Manager");
		
		//Click Action		
		clickByXpath("//*[@id='button']/a/img");
	}

	@AfterMethod//(groups= "common")
	public void closeApp(){
		closeAllBrowsers();		
	}
	
	
	@DataProvider(name = "fetchData")
	public Object[][] getData() throws InvalidFormatException, IOException{		
		ReadExcel rExcel = new ReadExcel();
		return  rExcel.readTestdata(excelFileName);		
	}
	
	
}
