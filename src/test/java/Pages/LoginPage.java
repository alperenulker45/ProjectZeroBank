package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ParentClass {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_login")
    private WebElement loginBox;

    @FindBy(id = "user_password")
    private WebElement passwordBox;

    @FindBy(css = "input[class='btn btn-primary']")
    private WebElement signInButton;

    @FindBy(id = "details-button")
    private WebElement advancedButton;

    @FindBy(id = "proceed-link")
    private WebElement proceedLink;

    @FindBy(xpath = "//h2[text()='Cash Accounts']")
    private WebElement successText;

    @FindBy(css = "div[class='alert alert-error']")
    private WebElement errorText;

    public void typeLoginBox(String username) {
        sendKeysFunction(loginBox, username);
    }

    public void typePassword(String password) {
        sendKeysFunction(passwordBox, password);
    }

    public void clickSignInButton() {
        clickFunction(signInButton);

    }

    public WebElement getSuccessText() {
        return successText;
    }

    public WebElement getErrorText() { return errorText; }

    public void proceedToWebsite() {
        clickFunction(advancedButton);
        clickFunction(proceedLink);
    }
}
