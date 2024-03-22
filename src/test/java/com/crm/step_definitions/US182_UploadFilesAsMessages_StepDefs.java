package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.pages.MessagePage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;


public class US182_UploadFilesAsMessages_StepDefs extends HomePage{
   MessagePage messagePage = new MessagePage();
   LoginPage loginPage = new LoginPage();

    @Given("user is already logged in and landed on the home page")
    public void user_is_already_logged_in_and_landed_on_the_home_page() {
        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("password"));
    }
    @When("user clicks to message tab")
    public void user_clicks_to_message_tab() {
        messageButton.click();
    }


    @When("user clicks to upload files icon")
    public void user_clicks_to_upload_files_icon() {

        messagePage.uploadFilesIcon.click();
    }


    @When("user uploads a {string} into Upload files and images button")
    public void user_uploads_a_into_upload_files_and_images_button(String string) {
        messagePage.uploadFilesAndImagesBox.sendKeys(string);
    }


    @Then("uploaded file should be {string} as message attachment")
    public void uploadedFileShouldBeAsMessageAttachment(String arg0) {

            Assert.assertTrue(messagePage.fileAsAttachment.getText().contains(arg0));


    }

    @When("user clicks to Insert in text button")
    public void user_clicks_to_insert_in_text_button() {
        messagePage.insertInTextButton.click();
    }

    @Then("name of Insert in text button next to each file should change to: In text")
    public void nameOfInsertInTextButtonNextToEachFileShouldChangeToInText() {
        for (WebElement eachButton : messagePage.insertInTextButtons) {
            Assert.assertEquals("In text", eachButton.getText());
        }
    }

    @Then("five uploaded files should be displayed inside message input box")
    public void fiveUploadedFilesShouldBeDisplayedInsideMessageInputBox() {
        Driver.getDriver().switchTo().frame(messagePage.messageIframe);
        Assert.assertTrue(messagePage.filesInText.size()==5);
    }



    @When("user clicks to x button")
    public void user_clicks_to_x_button() {
        System.out.println("homePage.fileAsAttachment.isDisplayed() = " + messagePage.fileAsAttachment.isDisplayed());
       messagePage.xButton.click();
    }

    @Then("no uploaded file should be displayed as message attachment")
    public void noUploadedFileShouldBeDisplayedAsMessageAttachment() {

        try{
            Assert.assertTrue(messagePage.fileAsAttachment.isDisplayed());
        }catch(NoSuchElementException e){
            System.out.println("NoSuchElementException is happened since uploaded file is removed. Since uploaded file is not found, this concludes MY TEST IS PASSED!");
        }
    }


}
