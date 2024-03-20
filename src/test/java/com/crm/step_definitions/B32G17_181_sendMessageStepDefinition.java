package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.MessagePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class B32G17_181_sendMessageStepDefinition {

    MessagePage messagePage = new MessagePage();


    @Given("user is on Home page")
    public void user_is_on_home_page() {
        BrowserUtils.verifyTitleContains("Portal");
    }

    @When("user clicks on MESSAGE button")
    public void user_clicks_on_message_button() {
        messagePage.messageButton.click();
    }

    @When("user types message content {string}")
    public void user_types_message_content(String text) {

        Driver.getDriver().switchTo().frame(messagePage.messageIframe);
        messagePage.textInputBox.sendKeys(text);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("All employees are selected")
    public void all_employees_are_selected() {

        String expectedRecipient = "All employees";
        Assert.assertEquals(expectedRecipient, messagePage.toRecipient.getText());

    }

    @Then("user clicks on SEND button")
    public void user_clicks_on_send_button() {

        messagePage.sendButton.click();

    }

    @Then("sent message is displayed on Activity Stream")
    public void sent_message_is_displayed_on_activity_stream() {

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm a");
        String currentTimeString = currentTime.format(df).toLowerCase();
        System.out.println("currentTimeString = " + currentTimeString);

        String postTime = messagePage.newStreamPostTime.getText();
        postTime = postTime.substring(postTime.indexOf(" "));
        System.out.println("postTime = " + postTime);

        Assert.assertEquals(currentTimeString,postTime);




    }

    @Then("user delete All employees option")
    public void user_delete_all_employees_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user add recipient {string}")
    public void user_add_recipient(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("{string} error message is displayed")
    public void error_message_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user deselects All employees")
    public void user_deselects_all_employees() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to click on CANCEL button")
    public void user_should_be_able_to_click_on_cancel_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
