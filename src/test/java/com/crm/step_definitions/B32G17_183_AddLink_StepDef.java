package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.MessagePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class B32G17_183_AddLink_StepDef extends HomePage {

    MessagePage messagePage = new MessagePage();
    Faker faker = new Faker();


    @Given("User hits the message tab")
    public void user_hits_the_message_tab() {

        messageButton.click();
    }
    @Given("User hits the Link button")
    public void user_hits_the_link_button() {
        messagePage.linkButton.click();
    }


    @Given("User in the link area {string}")
    public void user_in_the_link_area(String URL) {
        messagePage.linkURLBox.sendKeys(URL);
    }
    @Given("User hits the save button")
    public void user_hits_the_save_button() {
        messagePage.saveButton.click();
    }
    @Given("User hits the send button")
    public void user_hits_the_send_button() {
        messagePage.sendButton.click();
    }
    @Given("User displayed sent message on the Activity Stream")
    public void user_displayed_sent_message_on_the_activity_stream() {
        BrowserUtils.sleep(3);

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm a");
        String stringCurrentTime = currentTime.format(df).toLowerCase();
        String postTime = messagePage.newStreamPostTime.getText();
        postTime = postTime.substring(postTime.indexOf(" ") + 1);
        Assert.assertEquals(stringCurrentTime, postTime);
    }
    @Then("User hits the sent message")
    public void user_hits_the_sent_message() {
        messagePage.textLink.click();
    }
    @Then("Verify that the link is opened in a new tab")
    public void verify_that_the_link_is_opened_in_a_new_tab() {
        BrowserUtils.switchWindowAndVerify("https://www.google.com/","Google");
    }


    @And("User types in the text area message")
    public void userTypesInTheTextAreaMessage() {

        messagePage.linkTextBox.sendKeys(faker.name().fullName());
    }

}



