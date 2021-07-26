package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/datatbl.feature"},
		glue = {"Stepdefinition","myhooks"},
				//glue = {"myhooks"},
//		tags = "@smoke or @reg",
		plugin = {"pretty",
				"json:target/Myreport/report.json",
				"junit:target/Myreport/report.xml",
				"rerun:target/rerun.txt"
				},
		publish = true,
		monochrome = true 
		
		)

public class runnerclass {
	

}
