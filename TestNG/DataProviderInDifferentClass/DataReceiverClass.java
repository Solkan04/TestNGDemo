package DataProviderInDifferentClass;

import org.testng.annotations.Test;

public class DataReceiverClass 
{
	@Test(dataProvider="data-provider", dataProviderClass=DataProviderClass.class)
	public void TestMethod(String param)
	{
		System.out.println(param);
	}
}
