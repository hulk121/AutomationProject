package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinder {
	WebDriver dr;
	
	public FlightFinder(WebDriver dr)
	{
		this.dr=dr;
		
	}
	
	public By oneway= By.xpath("//input[@value='oneway']");

}
