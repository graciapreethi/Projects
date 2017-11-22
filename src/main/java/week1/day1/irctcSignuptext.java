package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class irctcSignuptext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// set URL for the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");		
		
		driver.findElementByLinkText("Sign up").click();
		
		String signuptext = driver.findElementByXPath("//*[@id='userRegistrationForm']/div[2]/p").getText();
		
		System.out.println(signuptext);

	}

}
