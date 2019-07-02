package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{
	ChromeDriver dr;

	@Given("^Application is up and running$")
	public void application_is_up_and_running()  {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		
		
		
	}

	@When("^I enter valid credential$")
	public void i_enter_valid_credential()  {
		System.out.println("Enter credentials");
	   
	}

	@Then("^I should bo login sucscessfully$")
	public void i_should_bo_login_sucscessfully()  {
		System.out.println("I should be logged in successfully");
	    
	}
	
	
	@When("^I enter (.*?) and (.*?) on login page$")
	public void enter_credentials(String username, String password)
	{

		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
	}
	@Then("^Error message should display$")
	public void error_message()
	{
		dr.close();
	}
}
