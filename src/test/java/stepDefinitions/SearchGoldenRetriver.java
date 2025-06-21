package stepDefinitions;

import io.cucumber.java.en.Then;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchGoldenRetriver extends HelperMethods {
    GetDogBreeds breed = new GetDogBreeds();
    List<String> breedNumber;

    @Then("User searchs for {string} from the  List and verify if there is at least {int} from search results")
    public void user_searchs_for_from_the_list_and_verify_if_there_is_at_least_from_search_results(String breedname, Integer int1) {
        assertEquals(true, breed.animalBreeds.contains(breedname));
        System.out.println("The Breed List contains " + breedname);

        breedNumber = breed.animalBreeds;
        int count = Collections.frequency(breedNumber, breedname);
        System.out.println("The number of matched breeds is " + count);
        assertTrue("Number returned from the searched breed is less than " + int1, count >= int1);
    }
}