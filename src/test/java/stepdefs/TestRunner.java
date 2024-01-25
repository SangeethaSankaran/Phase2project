package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions
	(
			monochrome = true,
			plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
			features = "src/test/java/features",
			glue = "stepdefs",
		//	tags = {"@WIP"}	
		//	tags = {"@Regression"}
		//	tags = {"@Calculator"}
			tags = {"@Login1Feature or @AddToCart"} // run all the browser scenarios except WIP
			
				
						)
	public class TestRunner {

	}


