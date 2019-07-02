package testScript;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.Config;
import libraries.ApplicationLibrary;
import pages.FlightFinder;
import pages.HomePage;

@Test
public class TC_login {
	
	WebDriver dr;
	ApplicationLibrary lib;
	
	@BeforeMethod
	public void initialize()
	{
		
		lib=new ApplicationLibrary();
		
		//Launch Browser
		dr=lib.lunchBrowser();
		assertTrue(dr!=null);
		
	}
	
	
	public void script()
	{
		
	/*	
		ApplicationLibrary lib= new ApplicationLibrary();
		
		//Launch browser
		WebDriver dr=lib.lunchBrowser();
		assertTrue(dr!=null);*/
		
		//Navigate to application
		String res=lib.navigate(dr, Config.applicationURL);
		assertTrue(res.contains("Mercury Tours"));
		
		//Login
		HomePage page =new HomePage(dr);
		
		page.login("mercury", "mercury");
		
		FlightFinder page2=new FlightFinder(dr);
		assertTrue(lib.isElementPresent(dr, page2.oneway));
		
	}
	
	@AfterMethod
	public void teardown()
	{
		dr.quit();
	}

}
