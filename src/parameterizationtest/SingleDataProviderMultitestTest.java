package parameterizationtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SingleDataProviderMultitestTest {
	public String username;
	public String password;
	public String movie1;
	public String movie2;
	@Factory(dataProvider="dataset1")
	public SingleDataProviderMultitestTest(String username, String password,String movie1, String movie2){
		this.username=username;
		this.password=password;
		this.movie1=movie1;
		this.movie2=movie2;
	}
	
	@Test(priority=1)
	public void loginTest(){
		System.out.println(username);
		System.out.println(password);
		System.out.println("Click");
	}
	@Test(priority=2)
	public void bookingTest(){
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println("Submit");
	}
	@DataProvider(name="dataset1")
	public static Object[][] getData(){
		Object [][] data=new Object[3][4];
		//First Dataset
		data[0][0]="ValidUsername";
		data[0][1]="ValidPassword";
		data[0][2]="tm1";
		data[0][3]="tm2";
		//Second Dataset
		data[1][0]="InValidUsername";
		data[1][1]="InValidPassword";
		data[1][2]="em1";
		data[1][3]="em2";
		//Third Dataset
		data[2][0]="EmptyUsername";
		data[2][1]="EmptyPassword";
		data[2][2]="hm1";
		data[2][3]="hm2";
		return data;
	}
	
}
