package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class Common {

    public static void openLink(String url) {
        Driver.driver.get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.driver.findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.driver.findElements(locator);
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

    public static void selectOptionByValue(By locator, String value) {
        WebElement element = getElement(locator);
        Select selectElement = new Select(element);
        selectElement.selectByValue(value);
    }

    public static void cookiesAndReload(){
        //Cookies
        WebElement popup = Common.getElement(By.xpath("//*[@id='cookiescript_accept']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        By locator = By.xpath("//*[@id='cookiescript_accept']");
        Common.clickElement(locator);
        //Brief reload
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}