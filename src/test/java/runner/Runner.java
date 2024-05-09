package runner;


import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.DriverFaktory;

//@RunWith(Cucumber.class) jUnit ile geliyor.Bu projede Junit kullanmadik
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"src/test/java/stepDefs"},
        tags = "@list",
        plugin = {"summary", "pretty", "html:Reports/CucumberReport/Reports.html"}

)


public class Runner extends AbstractTestNGCucumberTests {
        static AppiumDriver driver= DriverFaktory.getDriver();


}
