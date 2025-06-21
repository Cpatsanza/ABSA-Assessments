package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetDogBreeds extends HelperMethods {

    static Response responseBreeds;
    static List<String> animalBreeds;

    @When("User sends a request to get all {string} breeds")
    public void user_sends_a_request_to_get_all_breeds(String types) {
        String newToken = GetToken.accessToken;
        System.out.println("new token is " + newToken);

        responseBreeds =
                RestAssured.given()
                        .header("Accept", " */*")
                        .auth().oauth2(newToken)
                        .when().get("https://api.petfinder.com/v2/types/" + types + "/breeds");

    }

    @Then("A list of all {string} breeds is received successfully")
    public void a_list_of_all_breeds_is_received_successfully(String types) {
        assertEquals(200, responseBreeds.getStatusCode());
        animalBreeds = responseBreeds.jsonPath().getList("breeds.name");
        System.out.println("This is the List of " + types + " breeds at Petfinder" + animalBreeds);

    }


}
