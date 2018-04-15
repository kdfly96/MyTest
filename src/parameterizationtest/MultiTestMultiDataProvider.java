package parameterizationtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiTestMultiDataProvider {
	@Test(dataProvider="dataset1",priority=1)
	public void loginTest(String username, String password){
		System.out.println(username);
		System.out.println(password);
		System.out.println("Click");
	}
	@Test(dataProvider="dataset2",priority=2)
	public void bookingTest(String movie1, String movie2){
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println("Submit");
	}
	@DataProvider(name="dataset1")
	public static Object[][] getData(){//void replace
		Object [][] data=new Object[3][2];//dataset=>iterations
		//First dataset
		data[0][0]="ValidUsername";
		data[0][1]="Validpassword";
		//Second dataset
		data[1][0]="InvalidUsername";
		data[1][1]="Validpassword";
		//Third dataset
		data[2][0]="EmptyUsername";
		data[2][1]="Emptypassword";
		return data;
	}
	@DataProvider(name="dataset2")
	public static Object[][] getBookingData(){//void replace
		Object [][] data=new Object[3][2];//dataset=>iterations
		//First dataset
		data[0][0]="tm1";
		data[0][1]="tm2";
		//Second dataset
		data[1][0]="em1";
		data[1][1]="em2";
		//Third dataset
		data[2][0]="hm1";
		data[2][1]="hm2";
		return data;
	}

}
