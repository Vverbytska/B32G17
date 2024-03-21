package com.crm.runners;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/crm/step_definitions"
)
public class FailedTestRunner {
    public static class MyStepdefs {
        @Given("the user is logged into the system")
        public void theUserIsLoggedIntoTheSystem() {
        }

        @When("the user navigates to the Employee menu")
        public void theUserNavigatesToTheEmployeeMenu() {
        }

        @Then("the Company Structure option should be visible")
        public void theCompanyStructureOptionShouldBeVisible() {
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
    }
}


