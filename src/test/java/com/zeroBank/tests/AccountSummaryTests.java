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
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
        List<String> expectedResult = Arrays.asList("Cash Accounts","Investment Accounts","Credit Accounts","Loan Accounts");

        System.out.println(accountSummaryPage.getHeaders());
        Assert.assertEquals(accountSummaryPage.getHeaders(),expectedResult, "Headers NOT matched");

    }
}
