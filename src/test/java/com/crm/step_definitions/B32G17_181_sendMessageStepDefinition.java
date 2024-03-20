package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.MessagePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class B32G17_181_sendMessageStepDefinition {

    MessagePage messagePage = new MessagePage();
    Faker faker;
    String messageText;

    @Given("user is on Home page")
    public void user_is_on_home_page() {
        BrowserUtils.verifyTitleContains("Portal");
    }

    @When("user clicks on MESSAGE button")
    public void user_clicks_on_message_button() {
        messagePage.messageButton.click();
    }

    @When("user types message content")
    public void user_types_message_content() {
        faker = new Faker();
        messageText = faker.harryPotter().spell();
        Driver.getDriver().switchTo().frame(messagePage.messageIframe);
        messagePage.textInputBox.sendKeys(messageText);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("All employees are selected")
    public void all_employees_are_selected() {

        String expectedRecipient = "All employees";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(messagePage.toRecipient));
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

        String postTime = messagePage.newStreamPostTime.getText();
        postTime = postTime.substring(postTime.indexOf(" ") + 1);


        Assert.assertEquals(currentTimeString, postTime);
        Assert.assertEquals(messageText, messagePage.newStreamPostText.getText());


    }

    @Then("user deselects All employees option")
    public void user_deselects_all_employees_option() {
        messagePage.deleteRecipient.click();
    }

    @Then("user add recipient {string}")
    public void user_add_recipient(String recipient) {
        messagePage.addMoreRecipients.click();
        messagePage.recipientsInputBox.sendKeys(recipient + Keys.ENTER);

    }

    @Then("{string} error message is displayed")
    public void error_message_is_displayed(String expectedErrorMessage) {
        Assert.assertEquals
                (expectedErrorMessage,messagePage.noTitleErrorMessage.getText());
    }

    @Then("user should be able to click on CANCEL button")
    public void user_should_be_able_to_click_on_cancel_button() {
        Assert.assertTrue(messagePage.cancelButton.isEnabled());
    }


}
