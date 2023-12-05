package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.*;
import utils.Driver;
import utils.SeleniumUtils;

public class MortgageAppStepDef {

    LoginPage loginPage = new LoginPage();
    PreapprovalDetailsPage preapprovalDetailsPage = new PreapprovalDetailsPage();
    PersonalInfoPage personalInfoPage = new PersonalInfoPage();
    ExpensesPage expensesPage = new ExpensesPage();
    EmploymentPage employmentPage = new EmploymentPage();
    CreditReportPage creditReportPage = new CreditReportPage();
    EconsentPage econsentPage = new EconsentPage();
    SummaryPage summaryPage = new SummaryPage();

    @Given("The user is in preapproval details page")
    public void theUserIsInPreapprovalDetailsPage() {
        loginPage.login();
        loginPage.getMortgageApp().click();
        Assert.assertTrue(preapprovalDetailsPage.getH5().isDisplayed());
    }

    @When("user enter valid details to all fields and presses next button")
    public void userEnterValidDetailsToAllFields() {
        preapprovalDetailsPage.fillAllSections();
    }

    @Then("the page should switch to personal information section")
    public void thePageShouldSwitchToPersonalInformationSection() {
        preapprovalDetailsPage.getNextButton().click();
        SeleniumUtils.waitFor(1);
    }

    @Given("The user is in personal information page")
    public void theUserIsInPersonalInformationPage() {
        loginPage.login();
        loginPage.getMortgageApp().click();
        preapprovalDetailsPage.fillAllSections();
        preapprovalDetailsPage.getNextButton().click();
        SeleniumUtils.waitFor(1);
        Assert.assertTrue(personalInfoPage.getH6().isDisplayed());
    }

    @When("user enter valid details to all personal information fields and presses next button")
    public void userEnterValidDetailsToAllPersonalInformationFields() {
        personalInfoPage.fillAllSections();
    }

    @Then("the page should switch to expenses section")
    public void thePageShouldSwitchToExpensesSection() {
        personalInfoPage.getNextBtn().click();
    }

    @Given("The user is in expenses page")
    public void theUserIsInExpensesPage() {
        loginPage.login();
        loginPage.getMortgageApp().click();
        preapprovalDetailsPage.fillAllSections();
        preapprovalDetailsPage.getNextButton().click();
        SeleniumUtils.waitFor(1);
        personalInfoPage.fillAllSections();
        personalInfoPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        Assert.assertTrue(expensesPage.getH6().isDisplayed());
    }

    @When("user enter valid expenses details to all fields and presses next button")
    public void userEnterValidExpensesDetailsToAllFields() {
        expensesPage.getMonthlyRental().sendKeys("5000");
    }

    @Then("the page should switch to employment and income section")
    public void thePageShouldSwitchToEmploymentAndIncomeSection() {
        expensesPage.getNextBtn().click();
    }

    @Given("The user is in employment and income page")
    public void theUserIsInEmploymentAndIncomePage() {
        loginPage.login();
        loginPage.getMortgageApp().click();
        preapprovalDetailsPage.fillAllSections();
        preapprovalDetailsPage.getNextButton().click();
        SeleniumUtils.waitFor(1);
        personalInfoPage.fillAllSections();
        personalInfoPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        expensesPage.getMonthlyRental().sendKeys("5000");
        expensesPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        Assert.assertTrue(employmentPage.getH6().isDisplayed());
    }

    @When("user enter valid employment and income details to all fields and presses next button")
    public void userEnterValidEmploymentAndIncomeDetailsToAllFields() {
        employmentPage.fillAllSections();
    }

    @Then("the page should switch to credit report section")
    public void thePageShouldSwitchToCreditReportSection() {
        employmentPage.getNextBtn().click();
    }

    @Given("The user is in credit report page")
    public void theUserIsInCreditReportPage() {
        loginPage.login();
        loginPage.getMortgageApp().click();
        preapprovalDetailsPage.fillAllSections();
        preapprovalDetailsPage.getNextButton().click();
        SeleniumUtils.waitFor(1);
        personalInfoPage.fillAllSections();
        personalInfoPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        expensesPage.getMonthlyRental().sendKeys("5000");
        expensesPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        employmentPage.fillAllSections();
        employmentPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        Assert.assertTrue(creditReportPage.getH6().isDisplayed());
    }

    @When("user enter valid credit report details to all fields and presses next button")
    public void userEnterValidCreditReportDetailsToAllFields() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", creditReportPage.getCreditReportNo());
        SeleniumUtils.waitFor(1);
    }

    @Then("the page should switch to e-consent section")
    public void thePageShouldSwitchToEConsentSection() {
        creditReportPage.getNextBtn().click();
    }

    @Given("The user is in e-consent page")
    public void theUserIsInEConsentPage() {
        loginPage.login();
        loginPage.getMortgageApp().click();
        preapprovalDetailsPage.fillAllSections();
        preapprovalDetailsPage.getNextButton().click();
        SeleniumUtils.waitFor(1);
        personalInfoPage.fillAllSections();
        personalInfoPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        expensesPage.getMonthlyRental().sendKeys("5000");
        expensesPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        employmentPage.fillAllSections();
        employmentPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", creditReportPage.getCreditReportNo());
        creditReportPage.getNextBtn().click();
        SeleniumUtils.waitFor(1);
        Assert.assertTrue(econsentPage.getH4().isDisplayed());
    }

    @When("user enter valid details to all e-consent fields and presses next button")
    public void userEnterValidDetailsToAllEConsentFieldsAndPressesNextButton() {
        econsentPage.fillAllSections();
    }

    @Then("the page should switch to summary section")
    public void thePageShouldSwitchToSummarySection() {
        econsentPage.getNextButton().click();
    }

    @Given("The user is in summary page")
    public void theUserIsInSummaryPage() {
    }

    @When("user enter valid details to all fields and presses save button")
    public void userEnterValidDetailsToAllFieldsAndPressesSaveButton() {
    }

    @Then("the page should switch to mortgage application main page")
    public void thePageShouldSwitchToMortgageApplicationMainPage() {
    }

}
