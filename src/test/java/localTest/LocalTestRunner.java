package localTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        glue = {"oneTool.steps"},
        plugin = {"json:target/cucumber-json-report.json"},
        features = {"src/test/resources"},
        tags = {"@marketingTest"},
        stepNotifications = true

)

public class LocalTestRunner {
}
