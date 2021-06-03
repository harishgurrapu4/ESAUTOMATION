package page_objects;

import common.BasePage;
import common.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OnBoarding extends BasePage {


    @FindBy(id = "com.englishscore:id/btn_next")
    public WebElement sliderNext_BTN;

    @FindBy(id = "com.englishscore:id/btn_sign_up")
    public WebElement getStarted_BTN;

    @FindBy(id = "com.englishscore:id/btn_connect")
    public WebElement connectCode_BTN;

    @FindBy(id = "com.englishscore:id/btn_ok")
    public WebElement connectOK_BTN;


    public void clickSliderNextBTN() {
        sliderNext_BTN.click();
        Utilities.sleep(1000);
        sliderNext_BTN.click();
        Utilities.sleep(1000);
        sliderNext_BTN.click();
        Utilities.sleep(1000);
        sliderNext_BTN.click();
        Utilities.sleep(1000);
    }

    public void clickGetStarted() {
        Utilities.sleep(1000);
        getStarted_BTN.click();
    }

}
