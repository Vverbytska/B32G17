package com.crm.step_definitions;

import com.crm.pages.AppreciationPage;
import com.crm.pages.MessagePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class B32G17_189_FileUploadInAppreciation_StepDefs {

    AppreciationPage appreciationPage = new AppreciationPage();
    MessagePage messagePage = new MessagePage();

    @Given("user is on Appreciation page")
    public void user_is_on_appreciation_page() {

        appreciationPage.moreDropdownButton.click();
        appreciationPage.appreciationButton.click();
    }
    @Given("user clicks on Upload files button")
    public void user_clicks_on_upload_files_button() {

        appreciationPage.uploadFileIcon.click();
    }
    
    @Then("user should see file {string} under Attached files")
    public void user_should_see_file_under_attached_files(String string) {

        Assert.assertTrue(appreciationPage.fileName.getText().contains(string));
    }


    @Then("user chooses {string} to upload to Upload files and images button")
    public void userChoosesToUploadToUploadFilesAndImagesButton(String file) {
        messagePage.uploadFilesAndImagesBox.sendKeys(file);
    }


    @Then("user chooses all files to upload")
    public void userChoosesAllFilesToUpload(List< String> files) {

        for (String each : files) {
            messagePage.uploadFilesAndImagesBox.sendKeys(each);
            BrowserUtils.sleep(2);
        }

    }

    @Then("user should see files names under Attached files")
    public void userShouldSeeFilesNamesUnderAttachedFiles(List< String> expectedNames) {

        List<String> actualNames = new ArrayList<>();
        for (WebElement each : appreciationPage.fileNames) {
           actualNames.add(each.getText());
        }

        boolean doesContain = true;

        for (int i = 0; i < actualNames.size(); i++) {
            if(!actualNames.get(i).contains(expectedNames.get(i))){
                doesContain = false;
                break;
            }
        }

        Assert.assertTrue(doesContain);
    }


    @And("user clicks on Insert in text button")
    public void userClicksOnInsertInTextButton() {
        appreciationPage.insertInTextButton.click();
    }

    @Then("user should see text inside the button changed to In text")
    public void userShouldSeeTextInsideTheButtonChangedToInText() {
        Assert.assertEquals("In text", appreciationPage.insertInTextBtnTEXT.getText());
    }

    @Then("user should see files inside the text box")
    public void userShouldSeeFilesInsideTheTextBox() {

        Driver.getDriver().switchTo().frame(messagePage.messageIframe);
        Assert.assertEquals(1, messagePage.filesInText.size());
       // Driver.getDriver().switchTo().defaultContent();

    }

    @And("user clicks on all remove buttons")
    public void userClicksOnAllRemoveButtons() {
        for (WebElement each : appreciationPage.allRemoveFileButtons) {
            each.click();
        }
    }

    @Then("user verifies all files are removed")
    public void userVerifiesAllFilesAreRemoved() {
        Assert.assertTrue(appreciationPage.fileNames.isEmpty());
    }


}
