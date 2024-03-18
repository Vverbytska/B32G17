package com.crm.pages;


import com.crm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;


public abstract class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
