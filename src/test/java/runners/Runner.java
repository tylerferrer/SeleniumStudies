package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        monochrome = true,
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags= "@home"
)
public class Runner {
}