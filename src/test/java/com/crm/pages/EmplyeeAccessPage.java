package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class EmplyeeAccessPage {


    public EmplyeeAccessPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css= "a[class='menu-item-link-text']")
    public WebElement EmployeeModule;


@FindBy (xpath = "//div[@class='pagetitle-below']")
public WebElement companyStructure;























}
