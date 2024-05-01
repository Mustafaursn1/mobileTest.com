package stepDefs;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.Reporter;
import utils.ConfigurationReader;
import utils.DriverFaktory;

import java.util.Properties;

public class Hooks {
    AppiumDriver driver;
    Properties properties;


    @Before
    public void setUp(){
        String browser= Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties= ConfigurationReader.initializeProperties();
        driver= DriverFaktory.intiliazeDriver(browser);


    }

    @After
    public void tearDown(){
       DriverFaktory.quitDriver();

    }
}
