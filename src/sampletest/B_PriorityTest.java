package sampletest;

import org.testng.annotations.Test;

public class B_PriorityTest {
	@Test(priority=1)
	public void loginTest(){
		System.out.println("Login Completed");
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
