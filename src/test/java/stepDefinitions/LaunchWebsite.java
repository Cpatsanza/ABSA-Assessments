package stepDefinitions;

import PageObjects.BasePage;
import PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LaunchWebsite extends BasePage {

    // Create object of LandingPage
    LandingPage launch = new LandingPage(driver);



    @Given("User enters Protractor website to launch website")
    public void user_enters_protractor_website_to_launch_website()  {
    launch.LaunchWebsite();


    }

    @Then("Website is launched successfully and verified")
    public void website_is_launched_successfully_and_verified() {

     assertEquals(true,driver.getTitle().equals("Protractor practice website - WebTables"));
     assertTrue("This is not the correct Page",driver.getCurrentUrl().contains("https://www.way2automation.com/angularjs-protractor/webtables/"));


    }

}
