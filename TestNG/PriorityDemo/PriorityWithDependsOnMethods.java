package PriorityDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//What is the execution flow of the methods
public class PriorityWithDependsOnMethods 
{
	@Test(priority=2)
	public void createUser()
	{
		System.out.println("The User demoUser1 has created successfully...");		
	}
	@Test (priority=1, dependsOnMethods={"createUser"})//dependsonmethods overrides the priority
	public void modifyUser()
	{
		System.out.println("The User demoUser1 has modified successfully...");	
	}
	@Test (priority=3)
	public void deleteUser()
	{
		System.out.println("The User demoUser1 has deleted successfully...");		
	}
	@BeforeClass
	public static void setUp()
	{
		System.out.println("Launch and navigate the application URL...");		
	}
	@AfterClass
	public static void closeApplication()
	{
		System.out.println("Logout and Close Application successfully");		
	}

}
