package stepDefinitions.uiStepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.driver;

public class LanguagesControl_StepDefs extends CommonPage {
    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @Then("user click to languages menu")
    public void user_click_to_languages_menu() {
        ReusableMethods.waitForVisibility(getHomePage().languages, 2);
    }

    @And("user verifies selected the English language")
    public void user_verifies_selected_the_english_language() {
        ReusableMethods.waitForVisibility(getHomePage().languages, 2).click();
        ReusableMethods.waitForVisibility(getHomePage().languagesList.get(0), 2).click();
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://test.hypnotes.net/";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @Then("user verifies selected the Turkish language")
    public void user_verifies_selected_the_turkish_language() {
        ReusableMethods.waitForVisibility(getHomePage().languages, 2).click();
        ReusableMethods.waitForVisibility(getHomePage().languagesList.get(1), 2).click();
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://test.hypnotes.net/tr";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @And("user verifies selected the German language")
    public void user_verifies_selected_the_german_language() {
        ReusableMethods.waitForVisibility(getHomePage().languages, 2).click();
        ReusableMethods.waitForVisibility(getHomePage().languagesList.get(2), 2).click();
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://test.hypnotes.net/de";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @Then("user verifies selected the French language")
    public void user_verifies_selected_the_french_language() {
        ReusableMethods.waitForVisibility(getHomePage().languages, 2).click();
        ReusableMethods.waitForVisibility(getHomePage().languagesList.get(3), 2).click();
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://test.hypnotes.net/fr";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @And("user verifies selected the Russian language")
    public void user_verifies_selected_the_russian_language() {
        ReusableMethods.waitForVisibility(getHomePage().languages, 2).click();
        ReusableMethods.waitForVisibility(getHomePage().languagesList.get(4), 2).click();
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://test.hypnotes.net/ru";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @Then("user verifies selected the Spanish language")
    public void user_verifies_selected_the_spanish_language() {
        ReusableMethods.waitForVisibility(getHomePage().languages, 2).click();
        ReusableMethods.waitForVisibility(getHomePage().languagesList.get(5), 2).click();
        ReusableMethods.waitFor(2);
        String expectedUrl = "https://test.hypnotes.net/es";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @And("user verifies selected following language")
    public void user_verifies_selected_following_language(DataTable dataTable) {
        List<String> elements = dataTable.column(0);
        for (int i = 0; i < elements.size(); i++) {
            ReusableMethods.waitForVisibility(getHomePage().languages, 2).click();
            ReusableMethods.waitForVisibility(getHomePage().languagesList.get(i), 2).click();
            ReusableMethods.waitFor(2);
            String expectedUrl = elements.get(i);
            String currentUrl = driver.getCurrentUrl();
//            System.out.println(expectedUrl);
//            System.out.println(currentUrl);
            Assert.assertEquals(expectedUrl, currentUrl);
        }
    }
}

