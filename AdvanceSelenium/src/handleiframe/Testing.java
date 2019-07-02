package handleiframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.paytm.com/");

		Thread.sleep(10000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		

		//dr.switchTo().frame(0);
 	    //guuosame but thro ta
	
	    dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
		
		dr.switchTo().defaultContent();
		Thread.sleep(10000);
		dr.findElement(By.xpath("//a[@class='_3i6R']")).click();
	}

}
