package com.crm.pages;


import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement usernameInputBox;

    @FindBy(name="USER_PASSWORD")
    public WebElement passwordInputBox;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeBox;


    public void login(String userNameStr, String passwordStr) {
        usernameInputBox.sendKeys(userNameStr);
        passwordInputBox.sendKeys(passwordStr);
        loginButton.click();
        // verification that we logged
    }

    public void login(String userType){

        userType = userType.toLowerCase().replace(" ", "");

        String username = ConfigurationReader.getProperty(userType+ "_username");
        String password = ConfigurationReader.getProperty("password");

        login(username, password);
    }

}

