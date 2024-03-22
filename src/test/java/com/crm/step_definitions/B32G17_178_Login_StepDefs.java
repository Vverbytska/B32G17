package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.LoginTestPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class B32G17_178_Login_StepDefs {

    LoginTestPage loginTestPage = new LoginTestPage();
    Scenario scenario;

    @When("the user login with HR user {string},{string}")
    public void the_user_login_with_hr_user(String user, String psd) {
        loginTestPage.login(user, psd);
    }
    @Then("the user should be able to log in and see home page")
    public void the_user_should_be_able_to_log_in_and_see_home_page() {
        Assert.assertTrue( Driver.getDriver().getTitle().contains("Portal"));
    }

    @When("the user login with Help Desk user {string},{string}")
    public void the_user_login_with_help_desk_user(String user, String psd) {
        loginTestPage.login(user, psd);
    }

    @When("the user login with Marketing user {string},{string}")
    public void the_user_login_with_marketing_user(String user, String psd) {
        loginTestPage.login(user, psd);
    }

    @When("the user login with invalid {string},{string}")
    public void the_user_login_with_invalid(String user, String psd) {
        loginTestPage.login(user, psd);
    }
    @Then("user should not be able to log in and error message is displayed")
    public void user_should_not_be_able_to_log_in_and_error_message_is_displayed() {
        Assert.assertEquals("Incorrect login or password", loginTestPage.invalidErrorMsg.getText());
    }

    @When("the user login with {string},{string}")
    public void the_user_login_with(String user, String psd) {
        loginTestPage.login(user, psd);
    }
    @Then("user should not be able to log in and sees an error message")
    public void user_should_not_be_able_to_log_in_and_sees_an_error_message() {
        Assert.assertEquals("Please fill out this field", loginTestPage.invalidErrorMsg.getText());
    }

    @Given("user sees Remember me on this computer checkbox")
    public void user_sees_remember_me_on_this_computer_checkbox() {
       Assert.assertTrue( loginTestPage.rememberMeBox.isDisplayed() );
    }
    @Then("user is able to click the checkbox")
    public void user_is_able_to_click_the_checkbox() {
        loginTestPage.rememberMeBox.click();
        Assert.assertTrue(loginTestPage.rememberMeBox.isSelected());
    }

    @Given("user enters {string}")
    public void user_enters(String string) {
        loginTestPage.passwordInputBox.sendKeys(string);


    }
    @Then("user should see the password hidden as bullet signs")
    public void user_should_see_the_password_hidden_as_bullet_signs() {
        Assert.assertEquals("password", loginTestPage.passwordInputBox.getAttribute("type"));
    }

}
