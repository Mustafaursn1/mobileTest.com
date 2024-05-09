package pages;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFaktory;

import java.net.MalformedURLException;

public class View {
    public View() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(DriverFaktory.getDriver()),this);
    }
    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;
    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement predepen;
    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBox;
    @AndroidFindBy(xpath = "//*[@text='WiFi settings']")
    public WebElement wifiSetting;
    @AndroidFindBy(id = "android:id/edit")
    public WebElement inputBox;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;
}