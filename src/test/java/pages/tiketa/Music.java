package pages.tiketa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import utils.Driver;
import java.time.Duration;

public class Music {
    public static void clickOnCityField() {
        By locator = By.xpath("//*[@id='dropdownMenu1']");
        Common.clickElement(locator);
    }

    public static void clickOnVilnius() {
        By locator = By.xpath("//*[@id='cat-source']/ul[1]/li[1]/a[1]");
        Common.clickElement(locator);
    }
    public static void waitForRefresh() {
        WebElement filter = Common.getElement(By.xpath("//*[@class='stack-elem text-uppercase']"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.stalenessOf(filter));
    }
    public static void clickOnAlytus() {
        By locator = By.xpath("//*[@id='cat-source']/ul[1]/li[6]/a[1]");
        Common.clickElement(locator);
    }

    public static String getTextofFilters() {
        By locator = By.xpath("//*[@id='cat-target']");
        return Common.getText(locator);
    }
}