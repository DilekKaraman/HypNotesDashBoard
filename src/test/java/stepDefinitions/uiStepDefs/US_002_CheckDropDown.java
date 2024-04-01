package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_002_CheckDropDown extends CommonPage{
    @When("user should be able to select a language from the dropdown")
    public void user_should_be_able_to_select_a_language_from_the_dropdown() {

    }

    @Then("user verifies the dropdown menu visible and enable")
    public void userVerifiesTheDropdownMenuVisibleClickableAndEnable() {
        for (int i = 0; i <6 ; i++) {
        Assert.assertTrue(getHomePage().languagesList.get(i).isDisplayed());
        Assert.assertTrue(getHomePage().languagesList.get(i).isEnabled());
        }

    }
}
