package com.crm.pages;


import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;

    @FindBy(css = ".feed-time")
    public WebElement newStreamPostTime;

    @FindBy(css = ".feed-post-text-block-inner-inner")
    public WebElement newStreamPostText;

    //US182
    @FindBy(id ="feed-add-post-form-tab-vote" )
    public WebElement pollButton;

    @FindBy(xpath = "//*[text()='All employees']")
    public WebElement mainHeader;

    @FindBy(xpath = "//input[@id='blog-submit-button-save']")
    public WebElement questionBox;

    @FindBy(xpath = "//input[@id='answer_0__0_']")
    public WebElement answer1Box;

    @FindBy(xpath = "//input[@id='answer_0__1_']")
    public WebElement answer2Box;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@class='bx-vote-question-title']")
    public WebElement pollHeader;

    @FindBy(xpath = "//input[@value='Y']")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@class='feed-add-info-text']")
    public WebElement sendingErrorMessage;

    @FindBy(xpath = "//*[@class='feed-add-post-del-but']")
    public WebElement deselectAllEmployeesButton;

    @FindBy(xpath = "//*[@class='feed-add-info-text']")
    public WebElement specifyOnePersonErrorMessage;

    @FindBy(xpath = "//*[@class='feed-add-info-text']")
    public WebElement missingQuestionErrorMessage;

    @FindBy(xpath = "//*[@class='feed-add-info-text']")
    public WebElement missingAnswerErrorMessage;






}
