package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFaktory {

    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver intiliazeDriver(String browser) {
        properties = ConfigurationReader.getProperties();
        capabilities = new DesiredCapabilities();
        if (browser.equals("Android")) {
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("appPackage", "com.dmall.mfandroid");
            capabilities.setCapability("appActivity", "com.dmall.activity.base.NewSplash");

        } else if (browser.equals("IOS")) {
            capabilities.setCapability("platformName", "IOS");
            capabilities.setCapability("udid", "");
            capabilities.setCapability("appPackage", "");
            capabilities.setCapability("appActivity", "");

        }
        try {
            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return getDriver();

    }

    public static  AppiumDriver getDriver(){
        return driver;
    }

    public static  void quitDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }


    }


}
