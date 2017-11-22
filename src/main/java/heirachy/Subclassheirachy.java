package heirachy;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Subclassheirachy extends heirachy {

	@BeforeSuite
	public void Bcsuite(){
		System.out.println("This is Before child Suite");
	}
	
	@BeforeTest
	public void BcTest(){
		System.out.println("This is child Before Test");
	}
	
	@BeforeClass
	public void BcClass(){
		System.out.println("This is child Before class");
	}
	
	@BeforeMethod
	public void Bcmethod(){
		System.out.println("This is child Before method");
	}
	
	@Test
	public void start(){
		System.out.println("This is child Start Method");
	}
	
	@AfterMethod
	public void Acmethod(){
		System.out.println("This is child After method");
	}
	
	@AfterTest
	public void AcTest(){
		System.out.println("This is child After test");
	}
	
	@AfterSuite 
	public void AcSuite(){
		System.out.println("This is child After Suite");
	}
	
}
