package com.zeroBank.tests;

import com.zeroBank.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShadowRootExample extends TestBase{

    @Test
    public void shadowRoot() throws InterruptedException {

        Driver.get().get("https://www.mercedes-benz.co.uk/passengercars.html?group=all&subgroup=all.BODYTYPE.hatchback&view=BODYTYPE");

        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

        // click on copy JS path and add .click() at the end of it
        String str = "document.querySelector(\"body > cmm-cookie-banner\").shadowRoot.querySelector(\"div > div > div.cmm-cookie-banner__content > div.toggle-buttons-wrapper > div > button.wb-button.wb-button--primary.wb-button--small.wb-button--accept-all\").click()";

        // execute with java script
        jse.executeScript(str);

        Thread.sleep(3000);


        // SECOND WAY

        // add this dependency your pom.xml
                /*
                <dependency>
                <groupId>io.github.sukgu</groupId>
                <artifactId>automation</artifactId>
                <version>0.1.3</version>
                </dependency>
                 */

        // create an object and use regular selenium methods to locate and sendKeys()

        /*
        Shadow shadow=new Shadow(driver);
        WebElement element=shadow.findElement("#fname");
        element.sendKeys("Good job");
         */
    }
}
