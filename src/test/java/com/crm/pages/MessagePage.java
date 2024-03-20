package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MessagePage  extends HomePage{

    public MessagePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".bx-editor-iframe")
    public WebElement messageIframe;

    @FindBy(xpath = "//body[@contenteditable ='true']")
    public WebElement textInputBox;

    @FindBy(css = ".feed-add-post-destination-text")
    public WebElement toRecipient;

    @FindBy(xpath = "//a[@id ='bx-destination-tag']")
    public WebElement addMoreRecipients;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(className = "feed-add-post-del-but")
    public WebElement deleteRecipient;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement recipientsInputBox;

    @FindBy(className = "feed-add-info-text")
    public WebElement noTitleErrorMessage;




    @FindBy(css = "span#bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    public WebElement uploadFilesAndImagesBox;

    @FindBy(css = ".files-name")
    public WebElement fileAsAttachment;

    @FindBy(xpath = "//span[contains(@id, 'check-in-text')]")
    public WebElement insertInTextButton;

    @FindBy(css = ".files-del-btn")
    public WebElement xButton;

    @FindBy(xpath = "//*[contains(@id, 'bxid')]")
    public WebElement fileInText;

    @FindBy(xpath = "//span[contains(@id, 'check-in-text')]")
    public List<WebElement> insertInTextButtons;


    @FindBy(xpath = "//*[contains(@id, 'bxid')]")
    public List<WebElement> filesInText;



}
