package sampletest;

import org.testng.annotations.Test;

public class I_InvokationTimeOutTest {

	@Test(priority=1,invocationTimeOut=5000)
	public void loginTest() throws InterruptedException{
		Thread.sleep(4000);
		System.out.println("LoginTest Completed");
	}
}
