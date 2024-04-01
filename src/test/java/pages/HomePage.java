package pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;
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


    @FindBy(css = ".ant-select-selector")
    public WebElement languagesDropdown;

    @FindBy(css ="[src='/icons/turkey.png']")
    public WebElement turkishLanguageIcon;

    @FindBy(css="[src='/icons/usa.png']")
    public WebElement usaEnglishLaguageIcon;

    @FindBy(css="[src='/icons/germany.png']")
    public WebElement germanLanguageIcon;

    @FindBy(css="[src='/icons/france.png']")
    public WebElement frenchLanguageIcon;

    @FindBy(css="[src='/icons/russia.png']")
    public WebElement russianLanguageIcon;

    @FindBy(css="[src='/icons/spain.png']")
    public WebElement spanishLanguageIcon;

    @FindBy(xpath = "//span[contains(.,'kapsamlı bir çözüm')] ")
    public WebElement turkishText;

    // Define a map to store language names and their respective WebElements
    private Map<String, WebElement> languageIcons = new HashMap<>();

    // Constructor to initialize the language icons map
    public HomePage() {
        // Populate the map with language names as keys and their corresponding WebElements as values
        languageIcons.put("Turkish", turkishLanguageIcon);
        languageIcons.put("English", usaEnglishLaguageIcon);
        languageIcons.put("Germany", germanLanguageIcon);
        languageIcons.put("France", frenchLanguageIcon);
        languageIcons.put("Russia", russianLanguageIcon);
        languageIcons.put("Spanish", spanishLanguageIcon);
    }

    // Method to get the WebElement for a specific language
    public WebElement getLanguageIcon(String language) {
        return languageIcons.get(language);
    }

    @FindBy (css = "[data-test-id='loginScreen_pricing']")
    public WebElement pricingIcon;

    @FindBy (xpath = "//h2[@class='display-6 text-center mb-4']")
    public WebElement planCompaisonInTurkish;



}


