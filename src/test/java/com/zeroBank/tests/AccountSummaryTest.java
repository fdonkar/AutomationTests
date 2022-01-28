package com.zeroBank.tests;

import com.zeroBank.pages.LoginPage;
import org.testng.annotations.Test;

public class AccountSummaryTest extends TestBase{

    @Test
    public void accountSummary(){
        LoginPage loginPage = new LoginPage();
        loginPage.signInButton.click();
        loginPage.login();
    }
}
