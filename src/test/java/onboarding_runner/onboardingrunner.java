package onboarding_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:report/cucumber-pretty","json:target/cucumber.json"},
        tags = "@Test",
        monochrome = true,
        glue = {"onboarding_stepdefinitions"},
        features = {"src/test/java/onboarding_feature"}
)

public class onboardingrunner {
}
