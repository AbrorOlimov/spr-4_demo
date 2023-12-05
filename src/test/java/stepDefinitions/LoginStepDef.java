package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Data;
import lombok.extern.java.Log;
import org.junit.Assert;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();


    @Given("The user is in login page")
    public void theUserIsInLoginPage() {
        Driver.getDriver();
    }

    @When("User fills email and password fields")
    public void userFillsEmailAndPasswordFields() {
        loginPage.getEmailField().sendKeys(ConfigReader.getProperty("email"));
        loginPage.getPasswordField().sendKeys(ConfigReader.getProperty("password"));
    }

    @And("presses sign in button")
    public void pressesSignInButton() {
        loginPage.getLoginButton().click();
    }

    @Then("user should be navigated to the mortgage application page")
    public void userShouldBeNavigatedToTheMortgageApplicationPage() {
        Assert.assertEquals("http://qa-duobank.us-east-2.elasticbeanstalk.com/dashboard.php", Driver.getDriver().getCurrentUrl());
    }
}
