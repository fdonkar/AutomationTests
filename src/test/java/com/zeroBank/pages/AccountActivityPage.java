package com.zeroBank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(css ="#aa_accountId")
    public WebElement accountDropdown;

    @FindBy(xpath = "//table/thead/tr/th")
    public List<WebElement> transactionsTable;

    public List<String> getWebElementsText(List<WebElement> list){

        List<String> newList = new ArrayList<>();

        for (WebElement option : list) {
            newList.add(option.getText());
        }

        return newList;
    }

}
