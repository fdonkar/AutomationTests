package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> headers;

    @FindBy(xpath = "(//table)[3]/thead/tr/th")
    public List<WebElement> columnsOfCreditAccountTable;

    public List<String> getHeaders(){
        List<String> headersList = new ArrayList<>();
        for (WebElement each : headers) {
            headersList.add(each.getText());
        }
        return headersList;
    }

    public List<String> getColumnsOfCreditAccountTable(){
        List<String> colunmsList = new ArrayList<>();
        for (WebElement each : columnsOfCreditAccountTable) {
            colunmsList.add(each.getText());
        }
        return colunmsList;
    }
}
