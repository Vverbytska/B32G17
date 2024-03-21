package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppreciationPage extends HomePage{

    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFileIcon;

    @FindBy(className = "wd-fa-add-file-light-text")
    public WebElement uploadFileField;

    @FindBy(className = "files-text")
    public List<WebElement> fileNames; // for multiple file upload

    @FindBy(className = "files-text")
    public WebElement fileName; // for single file upload

    @FindBy(className = "insert-btn")
    public WebElement insertInTextButton;

    @FindBy(className = "insert-btn-text")
    public WebElement insertInTextBtnTEXT;

    @FindBy(className = "del-but")
    public WebElement removeFileButton;

    @FindBy(className = "del-but")
    public List<WebElement> allRemoveFileButtons; // for multiple file upload

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textInputBox;







}
