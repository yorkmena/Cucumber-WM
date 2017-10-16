package steps;

import hook.Hook;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddAssignment;
import pages.HomePage;
import pages.LoginPage;
import pages.TestBase;


public class Base {

	public Base() {
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	Hook testBase;
	LoginPage loginPage;
	//LoginPage loginPage=new LoginPage(driver);
	HomePage homePage;
	//HomePage homePage=new HomePage(driver);
	AddAssignment addAssignment;
	public static Logger log=Logger.getLogger(Base.class.getClass().getName());
    
}
