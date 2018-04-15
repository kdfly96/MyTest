package sampletest;

import org.testng.annotations.Test;

public class F_ExpectedExceptionTest {

	@Test(priority=1,expectedExceptions=ArithmeticException.class)
	public void loginTest(){
		int i=1/0;
		System.out.println("LoginTest Completed");
	}
}
