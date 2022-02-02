package com.zeroBank.pages;

import com.zeroBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signInButton;

    @FindBy(css = "#account_summary_tab")
    public WebElement accountSummary;

    @FindBy(css = "#account_activity_tab")
    public WebElement accountActivity;


}
