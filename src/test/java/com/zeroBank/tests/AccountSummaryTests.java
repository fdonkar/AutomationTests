package com.zeroBank.tests;

import com.zeroBank.pages.AccountSummaryPage;
import com.zeroBank.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AccountSummaryTests extends TestBase{

    @Test
    public void headersTest(){

        /*
        Account summary page should have to following account types: Cash Accounts, Investment
        Accounts, Credit Accounts, Loan Accounts.
         */

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        List<String> expectedResult = Arrays.asList("Cash Accounts","Investment Accounts","Credit Accounts","Loan Accounts");

        Assert.assertEquals(accountSummaryPage.getHeaders(),expectedResult, "Headers NOT matched");

    }

    @Test
    public void creditAccountTableTest(){
        // Credit Accounts table must have columnsAccount, Credit Card and Balance.

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        List<String> expectedResult = Arrays.asList("Account", "Credit Card", "Balance");

        Assert.assertEquals(accountSummaryPage.getColumnsOfCreditAccountTable(),expectedResult,"Columns NOT matched");
    }
}
