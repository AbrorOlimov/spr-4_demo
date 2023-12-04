package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.SignInPage;

public class LoanApplicationsStepDefs {
    SignInPage signInPage = new SignInPage();
    @Given("the user has successfully logged in with valid credentials")
    public void the_user_has_successfully_logged_in_with_valid_credentials() {
        signInPage.signInWithValidData();
    }

}
