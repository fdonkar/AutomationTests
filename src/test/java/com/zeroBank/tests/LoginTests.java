package com.zeroBank.tests;

import com.zeroBank.pages.LoginPage;
import com.zeroBank.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void positiveLogin(){
        // When user logs in with valid credentials, Account summary page should be displayed.

        LoginPage loginPage = new LoginPage();
        loginPage.signInButton.click();
        loginPage.login();

        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"User NOT on the Account Summary page");
    }

}
