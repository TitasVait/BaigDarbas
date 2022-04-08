package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Common {

    public static void openLink(String url) {
        Driver.driver.get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.driver.findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeys(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static String getText(By locator) {
        return getElement(locator).getText();
    }

    public static void acceptAllCookies() {
        By locator = By.xpath("//*[@id='cookiescript_accept']");
        Common.clickElement(locator);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}