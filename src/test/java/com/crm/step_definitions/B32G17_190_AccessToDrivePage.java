package com.crm.step_definitions;

import com.crm.pages.DrivePage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class B32G17_190_AccessToDrivePage extends HomePage {

    DrivePage drivePage = new DrivePage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        BrowserUtils.verifyTitleContains("Portal");
    }



    @When("the user navigates to the Drive page")
    public void the_user_navigates_to_the_drive_page() {
      //  Driver.getDriver().navigate().to("//a[@title='Drive']");
     drivePage.driveButton.click();
    }

    @When("user should click on Drive option")
    public void user_should_click_on_drive_option() {

        drivePage.driveButton.click();
    }
   // @Then("the user should be able to see the following modules:")
   // public void the_user_should_be_able_to_see_the_following_modules( ) {
        //List<String> modulesAsString = BrowserUtils.getElementsText(drivePage.currentModules);
        //Assert.assertEquals(ExpectedModules,modulesAsString);

        //}


    @Then("the user should be able to see the following  modules:")
    public void theUserShouldBeAbleToSeeTheFollowingModules(List<String> ExpectedModules) {
        List<String> modulesAsString = BrowserUtils.getElementsText(drivePage.driveModules);
        Assert.assertEquals(ExpectedModules,modulesAsString);

    }

}
