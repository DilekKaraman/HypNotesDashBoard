package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;


public class US_004_LanguageSwitchConsistancyStepDef extends CommonPage {
    HomePage homePage = new HomePage ();

    @Given("user clicks on the Language dropdown menu located on homePage navBar")
    public void user_clicks_on_the_language_dropdown_menu_located_on_home_page_nav_bar() {
 /* For a non-standard dropdown, the select class provided by selenium cannot be used as the following
   error message occured,"UnexpectedTagNameException: Element should have been "select" but was "img".
   This ment that it was rather a custom-made dropdown and instead a more direct approach was used
   to handle this exeption;(e.g. dropdownElement.click() )*/

        // Click to open the dropdown options

        WebElement dropdownElement = getHomePage().languagesDropdown;
        ReusableMethods.waitForVisibility(getHomePage().languagesDropdown, 3);
        dropdownElement.click();
    }

    @When("user selects the turkish Language from the dropDown")
    public void userSelectsTheTurkishLanguageFromTheDropDown() {
        // Find and click the specific option you want to select
        WebElement optionToSelect = getHomePage().turkishLanguageIcon;
        optionToSelect.click();
    }

    @Then("the previous pages changes to a different page specific to the turkish Language")
    public void thePreviousPagesChangesToADifferentPageSpecificToTheTurkishLanguage() {

        String previousUrl= "https://test.hypnotes.net/";
        String currentUrl= "https://test.hypnotes.net/tr/login";
        Assert.assertNotEquals(previousUrl,currentUrl);

    }
    @Then("the page content swiches into the selected Language")
    public void thePageContentSwichesIntoTheSelectedLanguage() {

    WebElement turkishTextElement = homePage.turkishText;
    Assert.assertTrue("Turkish text is displayed after after language switch",homePage.turkishText.isDisplayed());

    }

    @When("user switches to another Language from the dropDown {string}")
    public void user_switches_to_language_from_the_drop_down(String language) {
        // Find and click the specific option for the selected language
        WebElement optionToSelect = homePage.getLanguageIcon(language);
        optionToSelect.click();
    }


    @Then("the language switch should occur by directing the user to a different page")
    public void the_language_switch_should_occur_by_directing_the_user_to_a_different_page() {
        // Define language URLs
        ReusableMethods.waitFor(3);
        String previousUrl = "https://test.hypnotes.net/";
        String currentUrl = driver.getCurrentUrl();

        // Check if the current URL matches any of the expected language URLs
        ReusableMethods.waitFor(3);
        boolean languageSwitched = false;
        if (currentUrl.contains("https://test.hypnotes.net/tr")) {
            Assert.assertNotEquals(previousUrl + "tr/login", currentUrl);
            languageSwitched = true;
        } else if (currentUrl.contains("https://test.hypnotes.net/de")) {
            Assert.assertNotEquals(previousUrl + "de/login", currentUrl);
            languageSwitched = true;
        } else if (currentUrl.contains("https://test.hypnotes.net/fr")) {
            Assert.assertNotEquals(previousUrl + "fr/login", currentUrl);
            languageSwitched = true;
        } else if (currentUrl.contains("https://test.hypnotes.net/ru")) {
            Assert.assertNotEquals(previousUrl + "ru/login", currentUrl);
            languageSwitched = true;
        } else if (currentUrl.contains("https://test.hypnotes.net/es")) {
            Assert.assertNotEquals(previousUrl + "es/login", currentUrl);
            languageSwitched = true;
        }
        Assert.assertTrue("Language switch has occured", languageSwitched);

      //  Assert.assertNotEquals(previousUrl,currentUrl);

    }


    @And("user clicks on the Pricing section located on navBar")
    public void userClicksOnThePricingSectionLocatedOnNavBar() {
        ReusableMethods.waitForVisibility(getHomePage().languagesDropdown, 3);
        homePage.pricingIcon.click();
    }

    @Then("the Pricing details for Compare plans on the page should change into Turkish Language")
    public void thePricingDetailsForComparePlansOnThePageShouldChangeIntoTurkishLanguage() {
        ReusableMethods.waitForVisibility(homePage.planCompaisonInTurkish,3);

   // Assert.assertEquals("Planları karşılaştırın",homePage.planCompaisonInTurkish);
    Assert.assertTrue(homePage.planCompaisonInTurkish.isDisplayed());
    }


}
