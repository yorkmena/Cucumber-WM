package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBase {

	WebDriver driver;
	
	
	public TestBase(WebDriver driver) {
		this.driver=driver;
	}

	public void click(WebElement element){
		
		element.click();
	}
	
	public String getText(WebElement element){
		
		return element.getText();
		
	}
	
	public void sendKeys(WebElement element, String text){
		
		element.sendKeys(text);
		
	}
	
	
	
	
}
