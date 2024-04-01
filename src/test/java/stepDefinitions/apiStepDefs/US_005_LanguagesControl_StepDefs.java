package stepDefinitions.apiStepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

import java.util.List;


public class US_005_LanguagesControl_StepDefs {
    @Given("user verifies English language {string}")
    public void user_verifies_english_language(String url) {
        ReusableMethods.responseLanguage(url);
    }

    @Then("user verifies Turkish language {string}")
    public void user_verifies_turkish_language(String url) {
        ReusableMethods.responseLanguage(url);
    }

    @Then("user verifies German language {string}")
    public void user_verifies_german_language(String url) {
        ReusableMethods.responseLanguage(url);
    }

    @Then("user verifies French language {string}")
    public void user_verifies_french_language(String url) {
        ReusableMethods.responseLanguage(url);
    }

    @Then("user verifies Russian language {string}")
    public void user_verifies_russian_language(String url) {
        ReusableMethods.responseLanguage(url);
    }

    @Then("user verifies Spanish language {string}")
    public void user_verifies_spanish_language(String url) {
        ReusableMethods.responseLanguage(url);
    }
    @Then("user verifies languages")
    public void user_verifies_spanish_language(DataTable dataTable) {
        List<String> languages=dataTable.column(0);
        for (int i = 0; i < languages.size(); i++) {
            ReusableMethods.responseLanguage(languages.get(i));
        }

    }
}
