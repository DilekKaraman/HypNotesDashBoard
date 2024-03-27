package stepDefinitions.uiStepDefs;

import enums.USER_INFO;
import io.cucumber.java.en.Given;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;


public class UiDeneme extends CommonPage {
    @Given("user goes to home page")
    public void user_goes_to_home_page() {
        driver.get(ConfigurationReader.getProperty("url"));


    }
}

