package basicAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


public class TestNGClass3 {
	
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test ");
	}
	
	

	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test ");
	}

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite");
	}
}
