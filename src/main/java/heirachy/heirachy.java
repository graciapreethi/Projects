package heirachy;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
// Comment

public class heirachy {
	
	@BeforeSuite
	public void Bsuite(){
		System.out.println("This is Before Suite");
	}
	
	@BeforeTest
	public void BTest(){
		System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void BClass(){
		System.out.println("This is Before class");
	}
	
	@BeforeMethod
	public void Bmethod(){
		System.out.println("This is Before method");
	}
	
	//@Test
	//public void start(){
		//System.out.println("This is Start Method");
	//}
	
	@AfterMethod
	public void Amethod(){
		System.out.println("This is After method");
	}
	
	@AfterTest
	public void ATest(){
		System.out.println("This is After test");
	}
	
	@AfterSuite 
	public void ASuite(){
		System.out.println("This is After Suite");
	}
	
	
	
}
