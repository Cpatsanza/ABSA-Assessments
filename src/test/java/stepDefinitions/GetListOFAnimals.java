package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetListOFAnimals extends HelperMethods {

    Response responseTypes;
    static List<String> animalList;

    @When("User sends a get request to Petfinder site")
    public void user_sends_a_get_request_to_petfinder_site() {

        String newToken = GetToken.accessToken;
        System.out.println("new token is " + newToken);

        responseTypes =
                RestAssured.given()
                        .header("Accept", " */*")
                        .auth().oauth2(newToken)
                        .when().get("https://api.petfinder.com/v2/types");
    }

    @Then("a List of animal types is returned successfully")
    public void a_list_of_animal_types_is_returned_successfully() {

        assertEquals(200, responseTypes.getStatusCode());
        animalList = responseTypes.jsonPath().getList("types.name");
        System.out.println("This is the List of Animals at Petfinder " + animalList);

    }

}
