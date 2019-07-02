package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.flipkart.com/");
		
		
		//Implicit Wait
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act= new Actions(dr);
        act.moveToElement(dr.findElement(By.xpath("//span[text()='Sports, Books & More']"))).build().perform();
        act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
        
        WebDriverWait wait=new WebDriverWait(dr,10);
        wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']")))).click();
        
        
	}

}
