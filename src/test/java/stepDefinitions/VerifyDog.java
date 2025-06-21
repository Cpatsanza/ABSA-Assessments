package stepDefinitions;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VerifyDog extends HelperMethods {

    GetListOFAnimals animals = new GetListOFAnimals();

    @Then("verify that {string} is part of the List retrieved")
    public void verify_that_is_part_of_the_list_retrieved(String string) {

        assertEquals(true, animals.animalList.contains(string));
        System.out.println("List contains " + string);

    }
}
