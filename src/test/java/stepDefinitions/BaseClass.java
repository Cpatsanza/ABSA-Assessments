package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
    static WebDriver driver;
    public void BaseClass(){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }






    // Utility Methods


}
