package week1.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.assertthat.selenium_shutterbug.core.Shutterbug;



public class irctcLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// set URL for the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");				
		driver.findElementByLinkText("Sign up").click();
		
		
		capture(driver);
		
		//userRegistrationForm:userName
		driver.findElementById("userRegistrationForm:userName").sendKeys("gracia.pre");
		//userRegistrationForm:password
		driver.findElementById("userRegistrationForm:password").sendKeys("gracia.serene");
		//userRegistrationForm:confpasword
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("gracia.serene");
		
		
		//userRegistrationForm:securityQ
		Select securityQ = new Select(driver.findElement(By.id("userRegistrationForm:securityQ")));		
		securityQ.selectByIndex(1);
		//userRegistrationForm:securityAnswer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Romy");
		
		//userRegistrationForm:prelan
		Select preLan= new Select(driver.findElement(By.id("userRegistrationForm:prelan")));		
		preLan.selectByIndex(0);
		//en
	
		//userRegistrationForm:firstName
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Preethi");
		
		//userRegistrationForm:lastName
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Gracia");
		
		//userRegistrationForm:gender:1
		WebElement rdBtn = driver.findElement(By.id("userRegistrationForm:gender:1"));
		rdBtn.click();
		
		//userRegistrationForm:maritalStatus:0
		WebElement rdMarStatus = driver.findElement(By.id("userRegistrationForm:maritalStatus:0"));
		rdMarStatus.click();
		
		//userRegistrationForm:dobDay
		Select dob= new Select(driver.findElement(By.id("userRegistrationForm:dobDay")));		
		dob.selectByValue("22");
		
		//userRegistrationForm:dobMonth
		Select dobMonth= new Select(driver.findElement(By.id("userRegistrationForm:dobMonth")));		
		dobMonth.selectByValue("03");
		
		//userRegistrationForm:dateOfBirth
		Select dobYear= new Select(driver.findElement(By.id("userRegistrationForm:dateOfBirth")));		
		dobYear.selectByValue("1983");
		
		
		//userRegistrationForm:occupation
		Select occupation= new Select(driver.findElement(By.id("userRegistrationForm:occupation")));		
		occupation.selectByValue("3");
		
		//userRegistrationForm:countries
		Select countries= new Select(driver.findElement(By.id("userRegistrationForm:countries")));		
		countries.selectByValue("94");
		
		//userRegistrationForm:email
		driver.findElementById("userRegistrationForm:email").sendKeys("gracia.preethi@gmail.com");
		
		//userRegistrationForm:mobile
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9940039866");
		
		//userRegistrationForm:nationalityId
		Select nationality= new Select(driver.findElement(By.id("userRegistrationForm:nationalityId")));		
		nationality.selectByValue("94");
		
		//userRegistrationForm:address
		driver.findElementById("userRegistrationForm:address").sendKeys("No:9");
		
		//userRegistrationForm:pincode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600088",Keys.TAB);
		Thread.sleep(3000);
			
		//userRegistrationForm:cityName - Kanchipuram
		Select cityName= new Select(driver.findElement(By.id("userRegistrationForm:cityName")));		
		cityName.selectByIndex(1);
		Thread.sleep(3000);
		
		//userRegistrationForm:postofficeName - Adambakkam S.O
		Select postofficeName= new Select(driver.findElement(By.id("userRegistrationForm:postofficeName")));		
		postofficeName.selectByIndex(1);
		
		
		// scroll down
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,850)", "");
				
				
		//userRegistrationForm:landline
		driver.findElementById("userRegistrationForm:landline").sendKeys("22444180");
		
		capture(driver);
		
		
	}
	
	public static void capture(ChromeDriver driver ) throws IOException
	{
		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(scrFile, new File("./Images/screenshot"+  System.currentTimeMillis() + ".png"));*/
		
		Shutterbug.shootPage(driver).save("./Images/screenshot/");
	}

}
