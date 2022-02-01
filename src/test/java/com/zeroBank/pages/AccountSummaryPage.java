package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> headers;


    public List<String> getHeaders(){
        List<String> headersList = new ArrayList<>();
        for (WebElement each : headers) {
            headersList.add(each.getText());
        }
        return headersList;
    }
}
