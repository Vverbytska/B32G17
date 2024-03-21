package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters the {string} information")
    public void user_enters_the_information(String userType) {
        loginPage.login(userType);
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        BrowserUtils.verifyTitleContains("Portal");
    }
}
