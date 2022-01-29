package com.zeroBank.tests;

import com.zeroBank.pages.LoginPage;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void positiveLogin(){
        // When user logs in with valid credentials, Account summary page should be displayed.

        LoginPage loginPage = new LoginPage();

        loginPage.login();

        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"User NOT on the Account Summary page");
    }

    @Test
    public void negativeLogin(){
        /*
        When user tries to login with invalid information,
        error message “Login and/or password are wrong.” should be displayed.
         */

        LoginPage loginPage = new LoginPage();

        loginPage.loginWithInvalidCredentials("user", "password");

        Assert.assertEquals(loginPage.warningMessage.getText(),"Login and/or password are wrong.",
                "Actual warning message is different");

    }

}
