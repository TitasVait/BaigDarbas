package pages.tiketa;

import org.openqa.selenium.By;
import pages.Common;

public class Shop {
    public static void clickOnBuy() {
        By locator = By.xpath("//*[@class='btn btn-red a-red btn-default btn-lg btn-red text-uppercase pull-right']");
        Common.clickElement(locator);
    }
    public static void clickOnBuyAgain() {
        By locator = By.xpath("//*[@class='btn btn-red btn-default btn-sm text-uppercase']");
        Common.clickElement(locator);
    }
    public static void clickOnNoLogin() {
        By locator = By.xpath("//*[@id='btnNoLogin']");
        Common.clickElement(locator);
    }
    public static void clickOnAvailableSector(){
        By locator = By.cssSelector();
        Common.clickElement(locator);
    }
}
