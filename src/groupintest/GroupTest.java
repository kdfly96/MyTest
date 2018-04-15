package groupintest;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(priority=1,groups={"BOOK","CANCEL"})
	public void loginTest(){
		System.out.println("Login Completed");
	}
	@Test(priority=2,groups={"BOOK"})
	public void regTest(){
		System.out.println("Reg Completed");
	}
	@Test(priority=3,groups={"BOOK","CANCEL"})
	public void bookTest(){
		System.out.println("Book Completed");
	}
	@Test(priority=4,groups={"CANCEL"})
	public void cancelTest(){
		System.out.println("Cancel Completed");
	}
	
	
	
}
