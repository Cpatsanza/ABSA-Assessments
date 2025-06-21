package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.maven.surefire.shared.lang3.ObjectUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetToken extends HelperMethods {

HelperMethods configLoad = new HelperMethods();


    RequestSpecification requestToken;
    Response tokenResponse;
    static String accessToken;


    @Given("User has valid {string} and valid {string}")
    public void user_has_valid_and_valid(String clientId, String secret) {
        GetTokenPojoData tokenPojoData = new GetTokenPojoData();
        configLoad.propertiesReader();
        clientId = configLoad.getProperty("Client-ID");
        secret = configLoad.getProperty("Client-Secret");
        tokenPojoData.setGrant_type("client_credentials");
        tokenPojoData.setClient_id(clientId);
        tokenPojoData.setClient_secret(secret);
        requestToken =
                RestAssured.given()
                        .headers("Accept", " */*", "Content-Type", "application/json")
                        .body(tokenPojoData);
        System.out.println("The clientId: " + clientId);
        System.out.println("The secret: " + secret);
    }

    @When("User submits a Token request")
    public void user_submits_a_token_request() {
        tokenResponse =
                RestAssured.given()
                        .spec(requestToken)
                        .when().post("https://api.petfinder.com/v2/oauth2/token");

    }

    @Then("A token is received by User successfully")
    public void a_token_is_received_by_user_successfully() {
        assertEquals(200, tokenResponse.getStatusCode());
        assertEquals("Bearer", tokenResponse.jsonPath().getString("token_type"));
        assertEquals("3600", tokenResponse.jsonPath().getString("expires_in"));
        accessToken = tokenResponse.jsonPath().getString("access_token");
        System.out.println("The Access token is: " + accessToken);

    }


}
