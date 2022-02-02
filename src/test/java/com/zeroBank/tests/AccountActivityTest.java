package com.zeroBank.tests;

import com.zeroBank.pages.AccountActivityPage;
import com.zeroBank.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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

    @Test
    public void accountDropdownAllOptionsTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.accountActivity.click();
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select accountSelect = new Select(accountActivityPage.accountDropdown);

        List<WebElement> options = accountSelect.getOptions();
        List<String> actualResult = accountActivityPage.getWebElementsText(options);
        List<String> expectedResult = Arrays.asList("Savings", "Checking","Savings", "Loan", "Credit Card", "Brokerage");
        Assert.assertEquals(actualResult,expectedResult,"All select options NOT matched");
    }

    @Test
    public void transactionsTableTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.accountActivity.click();
        AccountActivityPage accountActivityPage = new AccountActivityPage();

        List<String> expectedResult = Arrays.asList("Date", "Description", "Deposit", "Withdrawal");
        List<String> actualResult = accountActivityPage.getWebElementsText(accountActivityPage.transactionsTable);

        Assert.assertEquals(actualResult,expectedResult,"Transactions Table's column names NOT matched");
    }
}
