package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

import static io.restassured.RestAssured.*;
import static stepDefinitions.Hooks.response;


public class LanguagesControlApi_StepDefs {
    @Given("user verifies English language {string}")
    public void user_verifies_english_language(String string) {
        response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(string);

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200);

    }

    @Then("user verifies Turkish language {string}")
    public void user_verifies_turkish_language(String string) {
        response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(string);

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200);
    }

    @Then("user verifies German language {string}")
    public void user_verifies_german_language(String string) {
        response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(string);

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200);
    }

    @Then("user verifies French language {string}")
    public void user_verifies_french_language(String string) {
        response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(string);

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200);
    }

    @Then("user verifies Russian language {string}")
    public void user_verifies_russian_language(String string) {
        response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(string);

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200);
    }

    @Then("user verifies Spanish language {string}")
    public void user_verifies_spanish_language(String string) {
        response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(string);

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        Assert.assertEquals(statusCode, 200);
    }
}
