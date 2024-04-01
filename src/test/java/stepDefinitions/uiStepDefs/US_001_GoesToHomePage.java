package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.Given;
import pages.CommonPage;
import utilities.ConfigurationReader;

import static stepDefinitions.Hooks.driver;


public class US_001_GoesToHomePage extends CommonPage {
    @Given("user goes to home page")
    public void user_goes_to_home_page() {
        driver.get(ConfigurationReader.getProperty("url"));


    }
}

