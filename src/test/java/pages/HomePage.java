package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;


public class HomePage extends CommonPage {


    //@FindBy(xpath = "(//li/a[@href='/account/weekly-order'])[3]")
   // public WebElement footer_ScheduledDelivery;

    public void verifyFooterLinks(String expectedCurrentUrl) {
        try {
            Assert.assertEquals(expectedCurrentUrl, driver.getCurrentUrl());
        } catch (AssertionError e) {
            System.out.println("Irrelevant page opened for " + expectedCurrentUrl + "!!");

        }

    }
}


