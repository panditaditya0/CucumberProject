package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/src/test/java/resources/Features",
        glue = {"StepDefinations", "TestHooks"}
)
public class TestRunner {

}
