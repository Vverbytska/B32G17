package com.crm.step_definitions;

import com.crm.pages.EmplyeeAccessPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class B32G17_184_EmployeePage_StepDefinitions {


    @When("user is at login page")
    public void user_is_at_login_page() {
        Driver.getDriver().get("https://qa.azulcrm.com/");
    }

    LoginPage loginPage  = new LoginPage();

    @Then("user enters username")
    public void user_enters_username() {
loginPage.usernameInputBox.sendKeys("hr1@cydeo.com");
    }
    @Then("user enters password")
    public void user_enters_password() {
loginPage.passwordInputBox.sendKeys("UserUser");
    }
    @Then("user clicks login button")
    public void user_clicks_login_button() {
loginPage.loginButton.click();
    }

    @Then("user sees the dashboard")
    public void user_sees_the_dashboard() {

    }

    EmplyeeAccessPage emplyeeAccessPage  = new EmplyeeAccessPage();
    @When("User clicks on the Employees Modules")
    public void user_clicks_on_the_employees_modules() {


    }

    @Then("User sees the following Modules:")

    public void user_sees_the_following_modules(List<WebElement> modules) {




    }



    @When("User has already clicked on employee module")
    public void user_has_already_clicked_on_employee_module() {
        emplyeeAccessPage.EmployeeModule.click();
    }
    @Then("user is able to see the company structure sign")
    public void user_is_able_to_see_the_company_structure_sign() {

Assert.assertTrue(emplyeeAccessPage.companyStructure.isDisplayed());
    }


















}
