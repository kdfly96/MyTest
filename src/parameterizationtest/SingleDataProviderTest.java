package parameterizationtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDataProviderTest {
	@Test(dataProvider="dataset1")
	public void loginTest(String username, String password){
		System.out.println(username);
		System.out.println(password);
		System.out.println("Click");
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
}
//dataprovider first call
//one more dataprovider call test