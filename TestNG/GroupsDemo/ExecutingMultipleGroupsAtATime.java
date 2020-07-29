package GroupsDemo;

import org.testng.annotations.Test;

public class ExecutingMultipleGroupsAtATime 
{
	@Test(groups="Smoke1")
	public void test1()
	{
		System.out.println("Method Belongs to Group-Smoke1");
	}
	@Test(groups="Smoke2")
	public void test2()
	{
		System.out.println("Method Belongs to Group-Smoke2");
	}
	@Test(groups="Smoke3")
	public void test3()
	{
		System.out.println("Method Belongs to Group-Smoke3");
	}
	@Test(groups="Regression1")
	public void testA()
	{
		System.out.println("Method Belongs to Group-Regression1");
	}
	@Test(groups="Regression2")
	public void testB()
	{
		System.out.println("Method Belongs to Group-Regression2");
	}
	@Test(groups="Regression3")
	public void testC()
	{
		System.out.println("Method Belongs to Group-Regression3");
	}
}
