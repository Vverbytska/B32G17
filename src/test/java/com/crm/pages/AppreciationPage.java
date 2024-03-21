package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage extends HomePage{

    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
