package eCommerceWithCucumber.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(features=".//Features//Customers.feature",
glue="eCommerceWithCucumber.stepDefinitions",
dryRun=true,
monochrome=true,
plugin= {
		"pretty",
		
		"html:test-output"
}
)
public class Runner {

}
