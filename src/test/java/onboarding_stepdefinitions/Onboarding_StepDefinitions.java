package onboarding_stepdefinitions;

import page_objects.OnBoarding;
import common.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Onboarding_StepDefinitions extends BasePage {


    @Given("^The Onboarding slides$")
    public void the_Onboarding_slides() {

    }

    @And("^Swipe till we reach to the 'Get started' page$")
    public void swipe_till_we_reach_to_the_get_started_page() {
        GetInstance(OnBoarding.class).clickSliderNextBTN();
    }

    @Then("^Click on Get Started$")
    public void click_on_get_started() {GetInstance(OnBoarding.class).clickGetStarted(); }

    @Then("^Click on Continue with Email$")
    public void click_on_Continue_with_Email() {

    }

    @Then("Enter an email address in the Email field")
    public void enter_an_email_address_in_the_email_field() {

    }

    @Then("Enter a password in the password field")
    public void enter_a_password_in_the_password_field() {

    }

    @Then("Click on SignUp button")
    public void click_on_sign_up_button() {

    }

    @Then("Verify the texts on Tell us your level page")
    public void verify_the_texts_on_tell_us_your_level_page() {

    }

    @Then("Click on Beginner")
    public void click_on_beginner() {

    }

    @Then("Verify the texts on why do you need to speak English")
    public void verify_the_texts_on_why_do_you_need_to_speak_english() {

    }

    @Then("Click on For my Job button")
    public void click_on_for_my_job_button() {

    }

    @Then("On the offers page select the offer with First session for ${int}")
    public void on_the_offers_page_select_the_offer_with_first_session_for_$(Integer int1) {

    }

    @Then("Click on Get this offer")
    public void click_on_get_this_offer() {

    }

    @Then("Verify the texts on Start the test page")
    public void verify_the_texts_on_start_the_test_page() {

    }

    @Then("Click on Start the Test")
    public void click_on_start_the_test() {

    }

    @Then("Click on the ‘OK’ button on the test intro page")
    public void click_on_the_ok_button_on_the_test_intro_page() {

    }

    @Then("Click on the ‘Yes’ button on the “Your sound is low” intro page")
    public void click_on_the_yes_button_on_the_your_sound_is_low_intro_page() {

    }

    @Then("Click on the ‘OK, allow the camera’ button on the “Our test is secure” page")
    public void click_on_the_ok_allow_the_camera_button_on_the_our_test_is_secure_page() {

    }

    @Then("Click on the ‘OK, let’s go’ button on the “Keep your face in the frame” page")
    public void click_on_the_ok_let_s_go_button_on_the_keep_your_face_in_the_frame_page() {

    }

    @Then("Click on the ‘Start the test’ button on the “You’re ready to go!” page")
    public void click_on_the_start_the_test_button_on_the_you_re_ready_to_go_page() {

    }

    @Then("Click on the ‘START’ button on Part 1 ‘Grammar and Vocabulary’ transition screen")
    public void click_on_the_start_button_on_part_grammar_and_vocabulary_transition_screen() {

    }


}
