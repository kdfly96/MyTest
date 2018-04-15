package annotationtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_BeforeMethodTest {

	@BeforeMethod
	public void openBrowser(){
		System.err.println("Open a Browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.err.println("Close a Browser");
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
