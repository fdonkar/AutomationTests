package com.zeroBank.pages;

import com.zeroBank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement signIn;

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement advancedButton;

    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement proceedButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement warningMessage;

    public void login(String username, String password){
        signInButton.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signIn.click();
        advancedButton.click();
        proceedButton.click();
    }

    public void login(){
        signInButton.click();
        usernameInput.sendKeys(ConfigurationReader.get("username"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        signIn.click();
        advancedButton.click();
        proceedButton.click();
    }

    public void loginWithInvalidCredentials(String username, String password){
        signInButton.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signIn.click();

    }
}
