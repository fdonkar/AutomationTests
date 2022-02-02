package com.zeroBank.tests;

import com.zeroBank.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountActivityTest extends TestBase{

    @Test
    public void verifyTitle(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.accountActivity.click();
        Assert.assertEquals(driver.getTitle(),"Zero - Account Activity", "Title NOT matched");
    }
}
