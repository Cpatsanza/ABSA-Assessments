package stepDefinitions;

import PageObjects.AddUser;
import PageObjects.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUsers extends BasePage {

    AddUser addUser = new AddUser(driver);


    @When("User clicks add User button")
    public void user_clicks_add_user_button() {
        addUser.clickAddUserBtn();
    }

    @Then("Add User form appears")
    public void add_user_form_appears() {
        addUser.addUserForm();
    }

    @Then("User Adds unique Users from list provided:{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_adds_unique_users_from_list_provided(String firstName, String lastName, String UserName, String Password, String Customer, String Role, String Email, String CellPhone) {
        addUser.addUserDetails(firstName, lastName, UserName, Password, Customer, Role, Email, CellPhone);
    }
}
