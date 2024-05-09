package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFaktory;

public class N11P {
    public N11P() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverFaktory.getDriver()),this);

    }


}
