package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage extends HomePage{

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "main-buttons-item")
    public List<WebElement> currentModules;




}
