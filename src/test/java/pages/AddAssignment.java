package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAssignment extends TestBase {
	WebDriver driver;

	public AddAssignment(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="basics-title")
	public WebElement title;
	
	@FindBy(xpath=".//*[@id='assignment-creation--basic']/div[2]/div/div[2]/div/div/div[1]")
	public WebElement category;
	
	/*@FindBy(xpath=".//*[@id='assignment-creation--basic']/div[2]/div/div[2]/div/div/div[2]/div")
	public List<WebElement> categoryLists;*/
	
	@FindBy(xpath=".//*[@class='ql-editor ql-blank']")
	public WebElement description;
	
	//@FindBy(id=".//*[@class='ql-editor ql-blank']")
	@FindBy(id="addressTyper")
	public WebElement addressTyper;
	
	public void enterTitle(String Title){
		sendKeys(title,Title);
	}
	
	public void selectCategory(String categoryType) throws InterruptedException{
		category.click();
		List<WebElement> categoryLists= driver.findElements(By.xpath(".//*[@id='assignment-creation--basic']/div[2]/div/div[2]/div/div/div[2]/div/div"));
		
		/*String xpathValue="\\//*[@id='basics-industryId']//following-sibling::div/div[2]/div/div[text()='"+categoryType+"']\")";
		driver.findElement(By.xpath(xpathValue)).click();*/
		
		List<String> listText=new ArrayList<String>();
		
		for(WebElement ele:categoryLists){
			listText.add(ele.getText());
		}
		
		for(int i=0; i<listText.size();i++){
			if(categoryType.equals(listText.get(i).toString())){
				System.out.println(listText.get(i));
				categoryLists.get(i).click();
			}
		}
		
		
	}
	
	public void enterDescription(String descriptionText){
		sendKeys(description,descriptionText);
	}
	
	public void enterAddress(String address){
		sendKeys(addressTyper,address);
	}

}
