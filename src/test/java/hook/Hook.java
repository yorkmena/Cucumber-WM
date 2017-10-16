package hook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pages.LoginPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BrowserFactory {
	
	//public WebDriver driver;
	
	/*@BeforeClass
	
	public void beforeEachFeatureFile(){
		System.out.println("BEFORE CLASS EXECUTED");
		
	}*/
	
	
	@Before
	public void setup() throws IOException{
	
		BrowserFactory factory=new BrowserFactory();
		PropertyConfigurator.configure("C:/Eclipse/com.thinksys.workmarket/Configuration/Log4j.properties");
		
	}
	
	@After
	public void tearDown(Scenario s){
		driver.quit();
		driver=null;
		if(s.isFailed()){
			System.out.println(s.getName()+" - Scenario Failed");
		}
		
	}
}
