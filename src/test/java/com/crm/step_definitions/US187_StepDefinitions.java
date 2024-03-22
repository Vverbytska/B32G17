package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.MessagePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US187_StepDefinitions extends HomePage{

    //Scenario 1
    LoginPage loginPage =new LoginPage();
    MessagePage messagePage= new MessagePage();
    Faker faker;
    String messageText;



    @Given("User is on Home page")
    public void user_is_on_home_page() {
        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("password"));
    }
    @When("User clicks POLL tab")
    public void user_clicks_poll_tab() {
        BrowserUtils.sleep(1);
        pollButton.click();
    }
    @Then("User sees {string} by default")
    public void user_sees_by_default(String expectedText) {
        BrowserUtils.sleep(1);
        expectedText= "All employees";
        String actualHeaderText = mainHeader.getText();

        Assert.assertEquals(expectedText,actualHeaderText);
    }


    //Scenario 2
    @When("User clicks Question box")
    public void user_clicks_question_box() {
        questionBox.click();
    }
    @When("User types a question {string} into question box")
    public void user_types_a_question_into_question_box(String question) {
        BrowserUtils.sleep(1);
       questionBox.sendKeys(question);
    }
    @When("User clicks Answer1 box")
    public void user_clicks_answer1_box() {
        BrowserUtils.sleep(1);
        answer1Box.click();
    }
    @When("User types the Answer1 {string} into Answer1 box")
    public void user_types_the_answer1_into_answer_box(String answer1) {
        BrowserUtils.sleep(1);
        answer1Box.sendKeys(answer1);
    }
    @When("User clicks Answer2 box")
    public void user_clicks_answer2_box() {
        BrowserUtils.sleep(1);
        answer2Box.click();
    }
    @When("User types the Answer2 {string} into Answer2 box")
    public void user_types_the_answer2_into_answer_box(String answer2) {
        BrowserUtils.sleep(1);
        answer2Box.sendKeys(answer2);
    }
    @When("User clicks the SEND button to send the message")
    public void user_clicks_the_send_button_to_send_the_message() {
        BrowserUtils.sleep(1);
        sendButton.click();
    }
    @Then("User sees {string} is in the table header")
    public void user_sees_is_in_the_table_header(String string) {
        BrowserUtils.sleep(1);
        Assert.assertTrue(pollHeader.isDisplayed());
    }


    //Scenario 3
    @When("User clicks Allow multiple choice checkbox")
    public void user_clicks_allow_multiple_choice_checkbox() {
        checkBox.click();
    }
    @Then("User sees Allow multiple choice checkbox clicked")
    public void user_sees_allow_multiple_choice_checkbox_clicked() {
        Assert.assertTrue(checkBox.isSelected());
    }


    //Scenario 4
    @When("User clicks SEND button to send empty message")
    public void user_clicks_send_button_to_send_empty_message() {
        sendButton.click();
    }
    @Then("User sees error message 'The message title is not specified'")
    public void user_sees_error_message() {
        String expectedSendingErrorMessage ="The message title is not specified";
        String actualSendingErrorMessage = sendingErrorMessage.getText();
        Assert.assertEquals(expectedSendingErrorMessage,actualSendingErrorMessage);
    }


    //Scenario 5
    @When("User deselects All employees option")
    public void user_deselects_all_employees_option() {
        BrowserUtils.sleep(2);
        deselectAllEmployeesButton.click();

    }

    @Then("User sees error message 'Please specify at least one person.'")
    public void user_sees_error_message_please_specify_at_least_one_person() {
        String error2="Please specify at least one person.";
        String actualSpecifyOnePersonErrorMessage = specifyOnePersonErrorMessage.getText();
        BrowserUtils.sleep(1);
        Assert.assertEquals(error2,actualSpecifyOnePersonErrorMessage);
    }




    //Scenario 6
    @When("User clicks message box to type a message")
    public void user_clicks_message_box_to_type_a_message() {messagePage.messageButton.click();
    }
    @When("User types a message {string}")
    public void user_types_a_message(String messageText) {

        messageText = "How are you today?";
        Driver.getDriver().switchTo().frame(messagePage.messageIframe);
        messagePage.textInputBox.sendKeys(messageText);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("User clicks SEND button to send the message")
    public void user_clicks_send_button_to_send_the_message(){sendButton.click();
    }
    @Then("User sees error message 'The question text is not specified.'")
    public void user_sees_error_message_the_question_text_is_not_specified() {
        BrowserUtils.sleep(1);
        String expectedMissingQuestionErrorMessage= "The question text is not specified.";
        String actualMissingQuestionErrorMessage = missingQuestionErrorMessage.getText();
        Assert.assertEquals(expectedMissingQuestionErrorMessage,actualMissingQuestionErrorMessage);
    }

    //Scenario 7

    @Then("User sees error message The question 'What is your favorite language' has no answers.")
    public void userSeesErrorMessageStringHasNoAnswers() {
        BrowserUtils.sleep(1);
        String expectedMissingAnswerErrorMessage= "The question \"What is your favorite language\" has no answers.";
        String actualMissingAnswerErrorMessage = missingAnswerErrorMessage.getText();
        Assert.assertEquals(expectedMissingAnswerErrorMessage,actualMissingAnswerErrorMessage);
    }
}



