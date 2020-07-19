package DataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithMultipleParameters
{
	@Test(dataProvider="data-provider")
	public void TestMethod(String firstName,String lastName,String email)
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println("***********************");
	}
	
	@DataProvider(name="data-provider")
	public Object[][] dataProviderMethod()
	{
		Object[][] data =new Object[2][3];//2 sets of data and 3 nos of parameters
		data[0][0]="FirstName1";
		data[0][1]="LastName1";
		data[0][2]="email1";
		
		data[1][0]="FirstName2";
		data[1][1]="LastName2";
		data[1][2]="email2";
		
		return data;
	}
}
