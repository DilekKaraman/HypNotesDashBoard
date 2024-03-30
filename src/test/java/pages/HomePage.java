package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;


public class HomePage extends CommonPage {


    //@FindBy(xpath = "(//li/a[@href='/account/weekly-order'])[3]")
    // public WebElement footer_ScheduledDelivery;
//    @FindBy(css = "div>.ant-select-selection-search")
    @FindBy(css = "span>.ant-avatar.ant-avatar-sm.ant-avatar-circle.ant-avatar-image.css-15rg2km")

    public WebElement languages;
    @FindBy(css = "div>.ant-avatar.ant-avatar-sm.ant-avatar-circle.ant-avatar-image.css-15rg2km>img")
    public List<WebElement> languagesList;

    public void verifyFooterLinks(String expectedCurrentUrl) {
        try {
            Assert.assertEquals(expectedCurrentUrl, driver.getCurrentUrl());
        } catch (AssertionError e) {
            System.out.println("Irrelevant page opened for " + expectedCurrentUrl + "!!");

        }

    }
}


