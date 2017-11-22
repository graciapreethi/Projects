package testcases;

import org.junit.Test;

import wrappers.GenericWrappersInaTech;

public class Mergelead extends GenericWrappersInaTech  {
	@Test
	public  void MergeLead() throws Exception {
		
		invokeApp("chrome","http://www.leaftaps.com/opentaps");
		
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		
		clickByClassName("decorativeSubmit");
		
		clickByXpath("//*[@id='button']/a/img");
		
		clickByLink("Leads");
		
		clickByLink("Merge Leads");
		
		clickByXpath("//*[@class='twoColumnForm']/tbody/tr[1]/td[2]/a");
		
		String winHandleBefore = driver.getWindowHandle();		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		enterById("ext-gen25", "10609");
		clickById("ext-gen114");
		clickByLink("10609");
		driver.switchTo().window(winHandleBefore);
		clickByXpath("//*[@class='twoColumnForm']/tbody/tr[2]/td[2]/a");
		String winHandleBefore1 = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		enterById("ext-gen25", "10613");
		clickById("ext-gen114");
		clickByLink("10613");
		driver.switchTo().window(winHandleBefore1);
		clickByLink("Merge");
		driver.switchTo().alert().accept();

	}

}
