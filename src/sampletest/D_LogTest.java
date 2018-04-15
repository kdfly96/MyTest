package sampletest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class D_LogTest {
	@Test(priority=1)
	public void loginTest(){
//		System.out.println("LoginTest Completed");
		Reporter.log("Login Completed");
	}
	@Test(priority=2)
	public void regTest(){
//		System.out.println("Reg Completed");
		Reporter.log("Reg Completed");
	}
	@Test(priority=3)
	public void bookTest(){
//		System.out.println("Book Completed");
		Reporter.log("Book Completed");
	}
	@Test(priority=4)
	public void cancelTest(){
//		System.out.println("Cancel Completed");
		Reporter.log("Cancel Completed");
	}
	
}
