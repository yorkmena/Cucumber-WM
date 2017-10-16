package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Create Assignment']")
	public WebElement createAssignment;
	
	
	public AddAssignment clickOnCreateAssignment(){
		
		click(createAssignment);
		AddAssignment addAssignment=new AddAssignment(driver);
		return addAssignment;
	}
	
}
