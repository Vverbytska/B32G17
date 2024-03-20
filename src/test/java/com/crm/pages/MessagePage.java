package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

}
