package annotationtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C_BeforeTestTest {

	@BeforeTest
	public void loginNetwork(){
		System.out.println("Login Network");
	}
	
	@AfterTest
	public void logoutNetwork(){
		System.out.println("Logout Network");
	}
	
	@BeforeClass
	public void loginDB(){
		System.out.println("Login DB");
	}
	
	@AfterClass
	public void logOutDB(){
		System.out.println("Logout DB");
	}
	
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
/**
 *test=>class=>method=>testmehodname 
 * 
 * 
 */





