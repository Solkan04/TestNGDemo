package TestNgDemo;

import org.testng.annotations.Test;

public class GroupsDemo 
{
	@Test(groups="Bike")
	public void Test1()
	{
		System.out.println("Test1: This Method belongs to Bike");
	}
	@Test(groups={"Car"})
	public void Test2()
	{
		System.out.println("Test2: This Method belongs to Car");
	}
	@Test(groups={"Bike"})
	public void Test3()
	{
		System.out.println("Test3: This Method belongs to Bike");
	}
	@Test(groups={"Car"})
	public void Test4()
	{
		System.out.println("Test4: This Method belongs to Car");
	}
}
