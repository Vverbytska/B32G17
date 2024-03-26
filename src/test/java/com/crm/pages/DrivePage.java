package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DrivePage extends HomePage{

    public DrivePage() { PageFactory.initElements(Driver.getDriver(),this);}

   @FindBy(xpath = "//a[@title='Drive']")
    public WebElement DrivePage;

    @FindBy(xpath = "//a[@title='Drive']")
 public WebElement driveButton;


    //@FindBy(className = "main-buttons-item-drag-button")
    //public List<WebElement> currentModules;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public List<WebElement> driveModules;






}
