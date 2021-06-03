package onboarding_stepdefinitions;

import common.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class OnboardingHooks extends BasePage {

    @Before("@Test")
    public void beforeTheScenario(Scenario scenario) {
        initialization("Android");
    }

    @After("@Test")
    public void afterTheScenario(Scenario scenario) {
        closeDriver();
    }
}
