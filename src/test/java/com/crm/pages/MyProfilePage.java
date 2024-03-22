package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyProfilePage extends HomePage {
    public MyProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='profile-menu-filter']//*")
    public List<WebElement> options;

    @FindBy(xpath = "//td[@class='user-profile-nowrap-second']")
    public WebElement emailInfo;

    @FindBy(id = "pagetitle")
    public WebElement emailHeader;

}
