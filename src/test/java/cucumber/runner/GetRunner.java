package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"cucumber/feature"},
        glue = {"cucumber.stepdefinition"},
        tags = "@SmokeTest",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        monochrome = true

)
public class GetRunner {
}
