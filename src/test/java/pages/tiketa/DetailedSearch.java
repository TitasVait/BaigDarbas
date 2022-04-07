package pages.tiketa;

import org.bouncycastle.jcajce.provider.symmetric.ChaCha;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import utils.Driver;

import java.time.Duration;

public class DetailedSearch {

    public static void enterMessageToCaptionField(String message){
        By locator = By.xpath("//*[@class='twitter-typeahead']/*[@name='sf_TextFilter']");
        Common.sendKeys(locator, message);
    }

    public static void clickOnSearchButton() {
        By locator = By.xpath("//*[@class='bn btn-lg btn-red text-uppercase']");
        Common.clickElement(locator);
    }

    public static String getResultText() {
        By locator = By.xpath("//*[@id='eventsContainter']");
        return Common.getText(locator);
    }

    public static void clickOnSpan() {
        By locator = By.xpath("//*[@id='dropdownMenu3']/span[2]");
        Common.clickElement(locator);
    }

    public static void clickOnVilnius(){
        By locator = By.xpath("//*[@id='search-city']/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]");
        Common.clickElement(locator);
    }

    public static void clickOnX() {
        By locator = By.xpath("//*[@id='search-city']/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]");
        Common.clickElement(locator);
    }

    public static String getCityResult() {
        By locator = By.xpath("//*[@id='cityCaption']");
        return Common.getText(locator);
    }

    public static void enterDateFrom(String message){
        By locator = By.xpath("//*[@name='sf_DateFrom']");
        Common.sendKeys(locator, message);
    }

    public static void enterDateTo(String message){
        By locator = By.xpath("//*[@name='sf_DateTo']");
        Common.sendKeys(locator, message);
    }

    public static String getNoEventsHaveBeenFoundMessage(){
        By locator = By.xpath("//*[@id='eventsContainter']/div[3]/h4[1]/center[1]");
        return Common.getText(locator);
    }
}
