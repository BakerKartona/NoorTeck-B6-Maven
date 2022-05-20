package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/prangehrm/", glue = { "step" }, plugin = { "pretty",
				"html:target/cucumber-reprt.html" }, monochrome = true)

public class XYZSomkeTest {

}
