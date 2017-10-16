package steps;

import hook.Hook;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import pages.AddAssignment;
import pages.HomePage;
import pages.LoginPage;
import pages.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAssignment extends Base {
	

	public CreateAssignment(Hook testBase){
		this.testBase=testBase;
		driver=this.testBase.getDriver();
		loginPage=new LoginPage(driver);
		homePage=new HomePage(driver);
		log.info("--Create Assignemnt Feature--");
		/*loginPage=new LoginPage(driver);
		homePage=new HomePage(driver);*/
		//PropertyConfigurator.configure("C:/Eclipse/com.thinksys.workmarket/Configuration/Log4j.properties");
	}

@Given("^I am logged in as an Employer with correct \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_am_logged_in_as_an_Employer_with_correct_username_and_password(String username, String password) throws Throwable {
   
	    driver.get("https://qa.workmarket.com/login");
	    log.info("On Login Page");
	    homePage= loginPage.login(username, password);
	    log.info("Succesfully Logged In");
}

@When("^I click on Create Assignments$")
public void i_click_on_Create_Assignments() throws InterruptedException {
	addAssignment=homePage.clickOnCreateAssignment();
	log.info("Create Assignment Clicked");
}

@When("^Fill the assignment Details$")
public void Fill_the_assignment_Details() throws InterruptedException {
	
	addAssignment.enterTitle("Sample_Title");
	addAssignment.selectCategory("Software Development");
	addAssignment.enterDescription("Sample Description");
	addAssignment.enterAddress("New York, NY, United States");
	log.info("Assignment Details Filled");
	
}

@When("^I save as Draft$")
public void i_save_as_Draft() {
	
    //driver.findElement(By.xpath("//button[@class='wm-modal--control -save-draft -primary -sidebar-main-control']"));
}

@Then("^Assigment should be saved in drafts$")
public void assigment_should_be_saved_in_drafts() throws InterruptedException{
    //Assert.assertEquals("True", "False");
	Thread.sleep(5000);
}

}
