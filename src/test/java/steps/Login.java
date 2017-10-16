package steps;
import hook.Hook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends Base {

	public Login(Hook testBase){

		this.testBase=testBase;
		driver=this.testBase.getDriver();
		loginPage=new LoginPage(driver);
		log.info("--Login Feature--");
		/*loginPage=new LoginPage(driver);
		PropertyConfigurator.configure("C:/Eclipse/com.thinksys.workmarket/Configuration/Log4j.properties");*/
	}
	
	@Given("^Open Browser and start application$")
	public void open_Browser_and_start_application() throws Throwable {
	   driver.get("https://qa.workmarket.com/login");
	    System.out.println("URL Opened");
	    log.info("Login page Opened");
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_username_and_valid_password1(String Email, String pass) throws Throwable {
		loginPage.login(Email, pass);
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		//Assert.assertEquals("https://qa.workmarket.com/home", driver.getCurrentUrl());
		System.out.println("Url After Login: "+driver.getCurrentUrl());	
		System.out.println("Titlel After Login: "+driver.getCurrentUrl());		
	}
	
	/*//Created a nested class. POJO- Plain old java object.
	public class LoginDetails{
		
		//These variable names should match with the data table first row. These should be small case otherwise it does not work. 
		public String email;
		public String password;
		
		public LoginDetails(String Email, String Password){
			
			email=Email;
			password=Password;
			
		}*/
}
