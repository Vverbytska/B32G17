package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class B32G17_185CompanyStructureStep {
    B32G17_185CompanyStructureStep b32G17_185CompanyStructureStep = new B32G17_185CompanyStructureStep();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().getPageSource();
    }

    @When("user enters the {string} information")
    public void userEntersTheInformation(String arg0) {
        theCompanyStructureOptionShouldBeVisible();
    }


    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {
        System.out.println(userIsOnTheLoginPage();
    }

    @When("the user navigates to the Employee menu")
    public void theUserNavigatesToTheEmployeeMenu() {
    }

    @Then("the Company Structure option should be visible")
    public void theCompanyStructureOptionShouldBeVisible() {
        theCompanyStructureOptionShouldBeVisible();
    }

    @Given("that user is already on the homepage")
    public void thatUserIsAlreadyOnTheHomepage() {
    }

    @When("user clicks the {string}")
    public void userClicksThe(String arg0) {
    }

    @Then("user should be able to see {string} as default.")
    public void userShouldBeAbleToSeeAsDefault(String arg0) {
    }

    @Given("the user type is {string}")
    public void theUserTypeIs(String arg0) {
    }

    @And("the user is on the Company Structure page")
    public void theUserIsOnTheCompanyStructurePage() {
    }

    @Then("the {string} button should not be displayed")
    public void theButtonShouldNotBeDisplayed(String arg0) {
    }
}//new.......
