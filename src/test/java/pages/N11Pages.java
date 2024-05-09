package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;
import io.appium.java_client.MobileCommand;

import java.time.Duration;

public class N11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public N11Pages(AppiumDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper=new ElementHelper(driver);


    }
}
