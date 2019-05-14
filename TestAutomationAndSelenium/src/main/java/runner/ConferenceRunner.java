package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Kavitha\\eclipse-workspace\\TestAutomationAndSelenium\\src\\main\\java\\feature\\login.feature", glue = {
		"stepDefinition" })// specifying the location of the feature file
public class ConferenceRunner {

}
