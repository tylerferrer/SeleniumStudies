package runners;

@CucumberOptions(features = "src/test/resources/functionalTests", glue = {
		"com.accenture.stepsdefinitions" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }, 
				monochrome = true, 
				tags= {"@Vehicle_01_OK"})

public class testRunner {

}