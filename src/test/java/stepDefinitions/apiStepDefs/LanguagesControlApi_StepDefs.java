package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static stepDefinitions.Hooks.response;


public class LanguagesControlApi_StepDefs {
    @Given("user verifies English language {string}")
    public void user_verifies_english_language(String string) {
        response = given()
                .contentType("application/json")
                .header("Authorization", "Bearer your_access_token")
                .when()
                .get(string);

        // Yanıtı al
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        // Yanıtı işleme
        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
    @Then("user verifies Turkish language {string}")
    public void user_verifies_turkish_language(String string) {

    }
    @Then("user verifies German language {string}")
    public void user_verifies_german_language(String string) {

    }
    @Then("user verifies French language {string}")
    public void user_verifies_french_language(String string) {

    }
    @Then("user verifies Russian language {string}")
    public void user_verifies_russian_language(String string) {

    }
    @Then("user verifies Spanish language {string}")
    public void user_verifies_spanish_language(String string) {

    }
}
