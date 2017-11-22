package Techoil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddPhysicalBuyTrade {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//loging to techoil
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// set URL for the URL
		driver.get("http://qc.techoil.com:2050");		
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		//driver.manage().window().maximize();
		
		
		//cred_userid_inputtext		
		driver.findElementById("cred_userid_inputtext").sendKeys("preethi.g@inatech.com");		
		//cred_password_inputtext			
		driver.findElementById("cred_password_inputtext").sendKeys("oct@2017");
		//cred_sign_in_button
		driver.findElementById("cred_password_inputtext").submit();
		
		//DisplayName		
		 String disName = driver.findElementById("DisplayName").getText();  
		 
		 System.out.println(disName);
		 
		 if (disName.contains("Preethi"))
		  System.out.println("Preethi logged in successfully");
		 else
			 System.out.println("Preethi not logged In");
		
	     //Navigate to Trade >> Physical Trade
		 driver.get("http://qc.techoil.com:2050/V2/#/Contract/PhysicalDeal/PhysicalDealList");
		 
		//	click on the '+' Add button  btnAddNewgrdphysicalDeal
		 driver.findElementById("btnAddNewgrdphysicalDeal").click();
		 
		Thread.sleep(3000);
		// Select the radio Button - Buy: radioBuy		 
		 driver.findElementById("radioBuy").click();		
		 
		//Select the trade type dropdown ddlDealType		 
		 WebElement ddlDealType = driver.findElement(By.id("ddlDealType"));
		 ddlDealType.click();
		 ddlDealType.sendKeys("Cargo",Keys.TAB);
		
		 Thread.sleep(1000);
		//	Click the No in the dialog
		 driver.findElement(By.id("cfcancelbtntext")).click();
		 
		//	Enter the Company name
		 WebElement companylookup = driver.findElement(By.id("companylookup"));		 
		 companylookup.clear();
		 companylookup.sendKeys("OCM US");
		 Thread.sleep(2000);
		 companylookup.sendKeys(Keys.TAB);
		 
		//	Enter trade date
		 WebElement tradedate = driver.findElement(By.id("inputDealDate"));		 
		 tradedate.clear();
		 tradedate.sendKeys("03-11-2017",Keys.TAB);
		 
		 
		//	Enter existing Vessel Name :vessellookup
		 WebElement vessellookup = driver.findElement(By.id("vessellookup"));		 
		 vessellookup.clear();
		 vessellookup.sendKeys("**Preethi");
		 Thread.sleep(2000);
		 vessellookup.sendKeys(Keys.TAB);	 
		 
		 
		//	Enter Supply Broker  txtOtherDetailsTabTrader
		 WebElement supplyBroker = driver.findElement(By.id("txtOtherDetailsTabTrader"));		 
		 supplyBroker.clear();
		 supplyBroker.sendKeys("preethi.g@inatech.com");
		 Thread.sleep(2000);
		 supplyBroker.sendKeys(Keys.TAB);
		 
		//	Enter Book Name booklookup
		 WebElement booklookup = driver.findElement(By.id("booklookup"));		 
		 booklookup.clear();
		 booklookup.sendKeys("bookPG");
		 Thread.sleep(2000);
		 booklookup.sendKeys(Keys.TAB);
		 
		//	Enter Counterparty Ref CustomerReferenceId
		 driver.findElement(By.id("CustomerReferenceId")).sendKeys("gracia'assa",Keys.TAB);
		 
		//	Enter the Buyer/Seller Counterparty
		//	Enter Contact Name
		//	enter the Final Payment Terms
		//	Select the VAT applicable
		//	Select broker name
		//	Enter Agent name
		//	enter Payment method
		//	Select Arbitration
		//	Select Q&Q Determination
		//	Select Governance Law
		//	Select Strategy
		//	select load location
		//	Select Disch. Location
		//	Select Business Location
		//	Select Demurrage
		//	Select GTC/INCOTerms
		//	Select Delivery Terms
		//	Specify date for Disch.Laycan From
		//	specify date for Disch.Laycan to
		//	select Nomination
		//	select the Title Transfer and Risk
		//	specify the Special Remarks
		//	select Product
		//	select Spec
		//	select Min Qty
		//	select Max Qty
		//	select Qty UOM
		//	specify Price
		//	"select Currency	"
		//	select Price UOM
		//	select the MTM Price
		//	specify the Currency
		//	specify the MTM UOM
		//	specify the date for Planned Date
		//	click Save button to save the trade
		//	click the confirm button to confirm trade
		
				

	}

}
