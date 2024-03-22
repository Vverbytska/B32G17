package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class B32G17_185CompanyStructureStep  {
    B32G17_185CompanyStructureStep b32G17_185CompanyStructureStep = new B32G17_185CompanyStructureStep();


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("all users types"));

    }

    @When("user enters the {string} information")
    public void userEntersTheInformation(String arg0) {
        String expectedTile = "https://qa.azulcrm.com/company/vis_structure.php";
        BrowserUtils.verifyTitle(expectedTile);

    }
    @When("the user navigates to the Employees menu")
    public void theUserNavigatesToTheEmployeesMenu() {
        userClicksThe("Employees button");
    }

    @Then("the Company Structure option should be visible")
    public void theCompanyStructureOptionShouldBeVisible() {
        BrowserUtils.verifyTitle(" Company Structure ");
    }


    @Given("that user is already on the homepage")
    public void thatUserIsAlreadyOnTheHomepage() {

    }

    @When("user clicks the {string}")
    public void userClicksThe(String arg0) {
        userClicksThe("Employees");
    }

    @Then("user should be able to see {string} as default.")
    public void userShouldBeAbleToSeeAsDefault(String arg0) {
    }

    @Given("the user type is {string}")
    public void theUserTypeIs(String arg0) {
    }

    @And("the user is on the Company Structure page")
    public void theUserIsOnTheCompanyStructurePage() {
        BrowserUtils.verifyTitle(" Company Structure ");
    }

    @Then("the {string} button should not be displayed")
    public void theButtonShouldNotBeDisplayed(String arg0) {

    }


}
