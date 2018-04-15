package sampletest;

import org.testng.annotations.Test;

public class C_SkipTest {
	@Test(priority=1)
	public void loginTest(){
		System.out.println("Login Completed");
	}
	@Test(priority=2,enabled=false)
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
