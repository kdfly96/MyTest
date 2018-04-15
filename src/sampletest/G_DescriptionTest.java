package sampletest;

import org.testng.annotations.Test;

public class G_DescriptionTest {

	@Test(priority=1,description="Validating Login Test")
	public void loginTest(){
		System.out.println("LoginTest Completed");
	}
	
	@Test(priority=2,description="Validating Reg Test")
	public void regTest(){
		System.out.println("Reg Completed");
	}
	
	@Test(priority=3,description="Validating Booking Test")
	public void bookTest(){
		System.out.println("Book Completed");
	}
	
	@Test(priority=4,description="Validating Cancel Test")
	public void cancelTest(){
		System.out.println("Cancel Completed");
	}
}
