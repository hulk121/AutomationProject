package libraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config;

public class ApplicationLibrary {
	//Author: Kalyani
	//Date : 28/06/2019
	//Description: this function will launch browser
	//Param: No parameter
	//Return: It will return the instance of driver
	public WebDriver lunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", Config.chromeDriverPath);
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		return dr;
		
	}
	    //Author: Kalyani
		//Date : 28/06/2019
		//Description: this function navigate to url
		//Param: webdriver and url
	    //Return: It will return
		
	public String navigate(WebDriver dr, String url)
	{
		dr.get(url);
		return dr.getTitle();
	}
	
	public boolean isElementPresent(WebDriver dr, By ele)
	{
		int size=dr.findElements(ele).size();
		
		if(size>=1)
		{
			return true;
		}else
		{
			return true;
		}
	}

}
