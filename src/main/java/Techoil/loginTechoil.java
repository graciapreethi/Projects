package Techoil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class loginTechoil {

	public static void main(String[] args) {
		// set path of driver
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
		
	}

}
