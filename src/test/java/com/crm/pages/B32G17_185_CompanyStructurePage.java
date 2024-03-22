package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B32G17_185_CompanyStructurePage extends HomePage {
    public B32G17_185_CompanyStructurePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath= "(//span[@class='menu-item-link-text'])[10]")
    public WebElement EmployeesButton;
    @FindBy(xpath= "//*[@id=\"pagetitle-menu\"]/a/span[2]" )
    public WebElement AddDepartmentButton ;
    //. just need 2 locators
    @FindBy(name="USER_LOGIN")
    public WebElement usernameInputBox;

    @FindBy(name="USER_PASSWORD")
    public WebElement passwordInputBox;

    @FindBy(className = "main-buttons-item")
    public List<WebElement> currentModules;




}
//////