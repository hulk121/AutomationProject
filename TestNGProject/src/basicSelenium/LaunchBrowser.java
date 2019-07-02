package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LaunchBrowser {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		WebElement ele=dr.findElement(By.name("passCount"));
		
		Select sel= new Select(ele);
		sel.selectByIndex(2);
		
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
	}

}
