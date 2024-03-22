package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage extends HomePage{

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
