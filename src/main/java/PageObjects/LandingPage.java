package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {

    WebDriver driver;




    // Constructor
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Locators
    @FindBy(xpath = "//input[@id='username']")
    WebElement usernameField;

    // Methods
    public void LaunchWebsite() {
        init();
    }


}
