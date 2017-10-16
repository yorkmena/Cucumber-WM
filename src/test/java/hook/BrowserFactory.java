package hook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	protected static WebDriver driver;

	public BrowserFactory() {
		initialize();
	}
	
	    public void initialize() {
	        if (driver == null)
	            createNewDriverInstance();
	    }

	    private void createNewDriverInstance() {
	    	 System.setProperty("webdriver.chrome.driver",".//Configuration//chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	    public WebDriver getDriver() {
	        return driver;
	    }

	    public void destroyDriver() {
	        driver.quit();
	        driver = null;
	    }
}
