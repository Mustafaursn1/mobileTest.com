package stepDefs;

import io.cucumber.java.en.Given;
import pages.View;

import java.net.MalformedURLException;

public class Apidemo {

    @Given("click preference button")
    public void click_preference_button() throws InterruptedException, MalformedURLException {
        View view = new View();
        Thread.sleep(3000);
        view.preference.click();
    }


}
