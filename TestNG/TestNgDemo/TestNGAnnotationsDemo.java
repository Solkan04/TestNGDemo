package TestNgDemo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGAnnotationsDemo
{
	/*The method annotated with @BeforeSuite will be executed before any tests declared inside the TestNG suite[.xml file]*/
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In Before Suite Method");
	}
	/*The method annotated with @AfterSuite will be executed after any tests declared inside the TestNG suite[.xml file]*/
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("In After Suite Method");
	}
	/*The method annotated with @BeforeTest will be executed before the test section declared inside the TestNG suite file.*/
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In Before Test Method");
	}
	/*The method annotated with @AfterTest will be executed after the test section declared inside the TestNG suite file.*/
	@AfterTest
	public void afterTest()
	{
		System.out.println("In After Test Method");
	}
	/*The method annotated with @BeforeClass will be executed before any of the test methods of a specific class.*/
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("In Before Class Method");
	}
	/*The method annotated with @AfterClass will be executed after any of the test methods of a specific class.*/
	@AfterClass
	public void afterclass()
	{
		System.out.println("In After Class Method");
	}
	/*The method annotated with @BeforeGroups will be executed before any of the test methods belonging to specific group. */
	@BeforeGroups(groups={"FirstGroup"})
	public void beforeFirstGroup()
	{
		System.out.println("In Before First Group Method");
	}
	/*The method annotated with @Aftergroup will be executed after any of the test methods belonging to specific group.*/
	@AfterGroups(groups={"FirstGroup"})
	public void afterFirstGroup()
	{
		System.out.println("In After First Group Method");
	}
	@BeforeGroups(groups={"SecondGroup"})
	public void beforeSecondGroup()
	{
		System.out.println("In Before Second Group Method");
	}
	@AfterGroups(groups={"SecondGroup"})
	public void afterSecondGroup()
	{
		System.out.println("In After Second Group Method");
	}
	/*The method annotated with @BeforeMethod will be executed before each test method.*/
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In BeforeMethod Method");
	}
	/*The method annotated with @AfterMethod will be executed after each test method.*/
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("In AfterMethod Method");
	}
	/*Test-method which belongs to group "firstgroup"*/
	@Test(groups={"FirstGroup"})
	public void FirstGroupMethodOne()
	{
		System.out.println("In Test Method One of FirstGroup");
	}
	/*Test-method which belongs to group "firstgroup"*/
	@Test(groups={"FirstGroup"})
	public void FirstGroupMethodTwo()
	{
		System.out.println("In Test Method Two of SecondGroup");
	}
	/*Test-method which belongs to group "secondgroup"*/
	@Test(groups={"SecondGroup"})
	public void SecondGroupMethodOne()
	{
		System.out.println("In Test Method One of Secondgroup");
	}
	/*Test-method which belongs to group "secondgroup"*/
	@Test(groups={"SecondGroup"})
	public void SecondGroupMethodTwo()
	{
		System.out.println("In Test Method Two of SecondGroup");
	}
}
