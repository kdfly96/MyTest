package annotationtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RoughTest {
	@BeforeTest
	public void TestSample(){
		System.out.println("Before Test=1");
	}
	
	@AfterTest
	public void testSample(){
		System.out.println("After Test=1");
	}
	@BeforeClass
	public void loginDB(){
		System.out.println("Before Class=2");
	}
	
	@AfterClass
	public void logOutDB(){
		System.out.println("After Class=2");
	}
	
	@BeforeMethod
	public void openBrowser(){
		System.err.println("Before Method=3");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.err.println("After Method=3");
	}
	
	@Test(priority=1)
	public void loginTest(){
		System.out.println("LoginTest Completed");
	}
	@Test(priority=2)
	public void regTest(){
		System.out.println("Reg Completed");
	}
	@Test(priority=3)
	public void bookTest(){
		System.out.println("Book Completed");
	}
	@Test(priority=4)
	public void cancelTest(){
		System.out.println("Cancel Completed");
	}
}
