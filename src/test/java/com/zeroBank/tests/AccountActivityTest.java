package com.zeroBank.tests;

import com.zeroBank.pages.AccountActivityPage;
import com.zeroBank.pages.LoginPage;
import org.openqa.selenium.support.ui.Select;
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

    @Test
    public void accountDropdownTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.accountActivity.click();
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select accountSelect = new Select(accountActivityPage.accountDropdown);
        Assert.assertEquals(accountSelect.getFirstSelectedOption().getText(),"Savings",
                "Default option NOT Savings");
    }
}
