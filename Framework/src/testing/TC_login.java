package testing;


import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import configuration.Config;
import libraries.ApplicationLibrary;
import libraries.Xls_Reader;
import pages.FlightFinder;
import pages.HomePage;


@Test
public class TC_login {
	
	
	
	
	public void script() throws Exception
	{
		
		
		ApplicationLibrary lib= new ApplicationLibrary();
		
		//Launch browser
		WebDriver dr=lib.lunchBrowser();
		assertTrue(dr!=null);
		
		//Navigate to application
		String res=lib.navigate(dr, Config.applicationURL);
		assertTrue(res.contains("Mercury Tours"));
		
		//Login
		HomePage page =new HomePage(dr);
		
		Xls_Reader x1 = new Xls_Reader("E:\\TestData.xls");

		
		String row=x1.getCellData("Sheet1", 2, 1);
		String col=x1.getCellData("Sheet1", 2, 2);
		
		System.out.println(row);
		System.out.println(col);
		
     
		page.login(row, col);
		
		FlightFinder page2=new FlightFinder(dr);
		assertTrue(lib.isElementPresent(dr, page2.oneway));
		
	}

}
