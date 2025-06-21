package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUser extends BasePage {
    WebDriver driver;

    // Constructor
    public AddUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Locators
    @FindBy(css = "button[class='btn btn-link pull-right']")
    WebElement btnAddUser;

    @FindBy(css = "h3[class='ng-binding']")
    WebElement lblAddUserForm;

    @FindBy(css = "input[name='FirstName']")
    WebElement txtFirstName;

    @FindBy(css = "input[name='LastName']")
    WebElement txtLastName;

    @FindBy(css = "input[name='UserName']")
    WebElement txtUserName;

    @FindBy(css = "input[name='Password']")
    WebElement txtPassword;

    @FindBy(css = "label[class='radio ng-scope ng-binding']:nth-of-type(1) > input[name='optionsRadios']")
    WebElement rBtnCompanyAAA;

    @FindBy(css = "label[class='radio ng-scope ng-binding']:nth-of-type(2) > input[name='optionsRadios']")
    WebElement rBtnCompanyBBB;

    @FindBy(css = "select[name='RoleId']")
    WebElement selectRole;

    @FindBy(css = "input[name='Email']")
    WebElement txtEmail;

    @FindBy(css = "input[name='Mobilephone']")
    WebElement txtCellPhone;

    @FindBy(css = "button[class='btn btn-success']")
    WebElement btnSave;

    @FindBy(css = "button[ng-click='close()']")
    WebElement btnClose;


    // Methods

    public void clickAddUserBtn() {
        btnAddUser.click();
    }

    public void addUserForm() {
        lblAddUserForm.isDisplayed();
    }

    public void addUserDetails(String firstName, String lastName, String UserName, String Password, String Customer, String Role, String Email, String CellPhone) {
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtUserName.sendKeys(UserName);
        txtPassword.sendKeys(Password);
        if (Customer.equalsIgnoreCase("Company AAA")) {
            rBtnCompanyAAA.click();
        } else rBtnCompanyBBB.click();

        Select objSelect = new Select(selectRole);
        objSelect.selectByVisibleText(Role);

        txtEmail.sendKeys(Email);
        txtCellPhone.sendKeys(CellPhone);
        btnSave.click();
        System.out.println(UserName+" has been saved successfully");
        if (true==driver.findElement(By.xpath("//td[contains(text(), '"+UserName+"')]")).isDisplayed()){
            System.out.println(UserName+" has been added successfully and is showing on Table");
        }
    }
}