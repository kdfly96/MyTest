package assertiontest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B_SoftAssertionTest {
	@Test(priority=1)
	public void loginTest(){
		System.out.println("LoginTest Completed");
		int expected=1;
		int actual=2;
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(actual, expected);
		System.out.println("Assertion Completed");
		s.assertAll();//compulsury used at final
		
	}
}
