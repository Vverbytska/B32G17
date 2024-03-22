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

    @FindBy(id = "feed-add-post-form-link-more")
    public WebElement moreDropdownButton;

    @FindBy(xpath = "//span[.='Appreciation']")
    public WebElement appreciationButton;


}
