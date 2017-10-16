package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="features",
                 glue={"steps","hook"},// tags = {"@smoke"},
                 plugin={"html:target/cucumber-html-report"})
	
public class TestRunner extends AbstractTestNGCucumberTests  {

}