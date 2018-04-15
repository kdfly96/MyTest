package sampletest;

import org.testng.annotations.Test;

public class E_DependsOnMethodTest {
	
	@Test(priority=1)
	public void loginTest(){
		System.out.println("Login Completed");
	}
	
	@Test(priority=2)
	public void regTest(){
		int i=1/0;
		System.out.println("Reg Completed");
	}
	
	@Test(priority=3,dependsOnMethods="regTest")
	public void bookTest(){
		System.out.println("Book Completed");
	}
	@Test(priority=4,dependsOnMethods="loginTest")
	public void cancelTest(){
		System.out.println("Cancel Completed");
	}
}
