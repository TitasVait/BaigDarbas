package pages.tiketa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import utils.Driver;

import java.time.Duration;

public class Login {
    public static void waitForAdPopupToBeVisible() {
        WebElement popup = Common.getElement(By.xpath("//*[@class='main-bg']"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(popup));
    }


    public static void acceptAll() {
        By locator = By.xpath("//*[@id='cookiescript_accept']");
        Common.clickElement(locator);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnLoginTab() {
        By locator = By.xpath("//*[@id='OnlyLogin']");
        Common.clickElement(locator);
    }
    public static void enterUsername(String message){
        By locator = By.xpath("//*[@id='txtLoginName']");
        Common.sendKeys(locator, message);
    }
    public static void enterPassword(String message){
        By locator = By.xpath("//*[@id='txtLoginPsw']");
        Common.sendKeys(locator, message);
    }
    public static void clickOnLoginButtonAndSleepFor1Sec() {
        By locator = By.xpath("//*[@id='btnLogin']");
        Common.clickElement(locator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String loginInfo() {
        By locator = By.xpath("//*[@class='mano-tiketa text-uppercase']");
        return Common.getText(locator);
    }
}
