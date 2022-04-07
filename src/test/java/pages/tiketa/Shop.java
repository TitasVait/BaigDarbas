package pages.tiketa;

import org.openqa.selenium.By;
import pages.Common;

public class Shop {
    public static void click() {
        By locator = By.xpath("//*[@id='OnlyLogin']");
        Common.clickElement(locator);
    }
}
