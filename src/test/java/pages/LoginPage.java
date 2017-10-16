package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends TestBase {
	
	WebDriver driver;
	HomePage homePage;
	

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login-email")
	public WebElement emailAddress;
	
	@FindBy(id="login-password")
	public  WebElement password;
	
	//@FindBy(id="mdl-button__ripple-container")
	@FindBy(id="login_page_button")
	public WebElement submit;
	
	public HomePage login(String Email, String pass) throws InterruptedException{
		
		sendKeys(emailAddress, Email);
		sendKeys(password, pass);
		click(submit);
		homePage=new HomePage(driver);
		return homePage;
	}
}
