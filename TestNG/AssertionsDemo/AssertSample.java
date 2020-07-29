package AssertionsDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSample 
{
	@Test
	public void testNGAsserts1() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Mahesh\\Automation\\TestLead\\TestNGDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Test Condition 1: If Page title matches with actualTitle then it finds email
		// title and enters the value which we pass
		driver.get("https://www.gmail.com");
		String actualTitle = "Gmail";
		//Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
		Assert.assertEquals(driver.getTitle(), actualTitle);
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void testNGAsserts2() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Mahesh\\Automation\\TestLead\\TestNGDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Test Condition 2: If page title didnt match with actualTitle then script
		// throws an exception
		Thread.sleep(2000);
		driver.get("https://www.gmail.com");
		String actualTitle = "GoogleMail";
		Thread.sleep(2000);
		//Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
		Assert.assertEquals(driver.getTitle(), actualTitle);
		driver.close();
	}
}
