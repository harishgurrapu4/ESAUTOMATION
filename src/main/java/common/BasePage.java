package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static Properties prop;
    public static AppiumDriver<MobileElement> driver;

    public static void initialization(String device) {
        if (device.equals("Android")) {
            Utilities.setDevicePropertyFile(System.getProperty("user.dir") + "/src/main/resources/android.properties");

            try {
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("deviceName", PropertiesReader.getProperty("deviceName"));
                cap.setCapability("udid", PropertiesReader.getProperty("udid"));
                cap.setCapability("platformName", PropertiesReader.getProperty("platformName"));
                cap.setCapability("platformVersion", PropertiesReader.getProperty("platformVersion"));
                cap.setCapability("appPackage", PropertiesReader.getProperty("appPackage"));
                cap.setCapability("appActivity", PropertiesReader.getProperty("appActivity"));
                URL url = new URL("http://0.0.0.0:4723/wd/hub");
                driver = new AndroidDriver<>(url, cap);
                System.out.println("Application started.....");
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Exception occurred.....");
                e.printStackTrace();
            }
        }
        if (device.equals("iOS")) {
            Utilities.setDevicePropertyFile(System.getProperty("user.dir") + "/src/main/resources/iOS.properties");
            // iOS initialization
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    protected <TPage extends BasePage> TPage GetInstance(Class<TPage> pageInstance) {
        try {
            return PageFactory.initElements(driver, pageInstance);
        } catch (Exception e) {
            throw new RuntimeException("Error while creating new page instance", e);
        }
    }

    public static String takeScreenshotAtEndOfTest() throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/screenshots/" + dateName
                + ".png";
        File finalDestination = new File(destination);
        FileHandler.copy(source, finalDestination);
        return destination;
    }

    protected void closeDriver(){
        if(driver!= null){driver.quit();}
    }
}

