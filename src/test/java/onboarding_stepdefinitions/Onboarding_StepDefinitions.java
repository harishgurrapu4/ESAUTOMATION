package onboarding_stepdefinitions;

import page_objects.OnBoarding;
import common.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Onboarding_StepDefinitions extends BasePage {


    @Given("^The Onboarding slides$")
    public void the_Onboarding_slides() {
        GetInstance(OnBoarding.class).clickSliderNextBTN();
    }

    @And("^Swipe till we reach to the get started page$")
    public void swipe_till_we_reach_to_the_get_started_page() {
        GetInstance(OnBoarding.class).clickGetStarted();
    }

    @Then("^Click on Get Started$")
    public void click_on_get_started() { }

    @Then("^Click on Continue with Email$")
    public void click_on_Continue_with_Email() {

    }

}
