package com.crm.step_definitions;

import com.crm.pages.MyProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class B32G17_180_ProfilePage_StepDefs {

    MyProfilePage myProfilePage = new MyProfilePage();

    @Given("user clicks on the profile icon")
    public void user_clicks_on_the_profile_icon() {

        myProfilePage.userIcon.click();
    }
    @Given("user clicks on My Profile link")
    public void user_clicks_on_my_profile_link() {

        myProfilePage.myProfileLink.click();
    }
    @Then("user should see five options as below")
    public void user_should_see_five_options_as_below(List<String> options) {

        List<String> actualOptions = new ArrayList<>();
        for (WebElement each : myProfilePage.options) {
            actualOptions.add(each.getText());
        }
        Assert.assertEquals(options, actualOptions);
    }

    @Then("user should see the email address under contact info is the same as in header")
    public void user_should_see_the_email_address_under_contact_info_is_the_same_as_in_header() {

        Assert.assertEquals(myProfilePage.emailInfo.getText(), myProfilePage.emailHeader.getText());
    }
}
