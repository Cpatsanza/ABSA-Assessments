package stepDefinitions;

import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class UniqueUserName {


    @Then("User loads the UserLists to compare and verifies if they have unique UserName")
    public void user_loads_the_user_lists_to_compare_and_verifies_if_they_have_unique_user_name(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> columnDetails = dataTable.asLists(String.class);
        System.out.println(columnDetails);
        String userNameRow1 = columnDetails.get(0).get(2);
        String userNameRow2 = columnDetails.get(1).get(2);
        System.out.println("The UserNames to compare are "+ userNameRow1 + " and " + userNameRow2 );
        assertTrue("The UserNames provided are NOT unique " , !(userNameRow1 ==userNameRow2));

    }
}
