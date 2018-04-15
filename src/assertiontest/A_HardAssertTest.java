package assertiontest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A_HardAssertTest {

	@Test(priority=1)
	public void loginTest(){

		System.out.println("LoginTest Completed");
		
		int expected=1;
		int actual=1;//1
		Assert.assertEquals(actual, expected);//Static Functions
		System.out.println("Assertion Completed");
		
	}
}
