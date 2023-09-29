package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/Features", 
	glue= {"stepDefinition"},
	plugin= {"pretty","html:target/ProjectReports/CucumberReport.html"
			,"pretty","json:target/ProjectReports/CucumberReports.json",
			"pretty", "junit:target/ProjectReports/CucumberReports.xml"},
			dryRun=true, 
			tags = "@Regression or @Smoke or @Sanity")

public class TestRunner {

}
