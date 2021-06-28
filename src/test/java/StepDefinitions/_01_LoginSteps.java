package StepDefinitions;

import Pages.LoginPage;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class _01_LoginSteps {

    private WebDriver driver = Driver.getDriver();
    LoginPage loginpage = new LoginPage();

    @Given("^Navigate to zerobank$")
    public void navigateToZerobank() {
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
    }

    @And("^Enter login name \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterLoginNameAnd(String username, String password)  {
        loginpage.typeLoginBox(username);
        loginpage.typePassword(password);
    }

    @When("^Click sign in button$")
    public void clickSignInButton() {
        loginpage.clickSignInButton();
    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
        loginpage.verifyContainsTxt(loginpage.getSuccessText(), "Cash Accounts");
    }

    @Then("^User should see error message$")
    public void userShouldSeeErrorMessage() {
        loginpage.verifyContainsTxt(loginpage.getErrorText(), "wrong");
    }

    @And("^Proceed to website$")
    public void proceedToWebsite() {
        loginpage.proceedToWebsite();
    }
}
