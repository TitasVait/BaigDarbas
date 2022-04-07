package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.UUID;

public class Driver {
    public static WebDriver driver;

    public static void initialize() {
        WebDriverManager.chromedriver().driverVersion("100.0.4896.60").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        driver = new ChromeDriver(options);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void takeScreenshot() {
        try {
            TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
            File dataFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File finalFile = new File("./screenshots/screenshot-" + UUID.randomUUID() + ".png");
            FileUtils.copyFile(dataFile, finalFile);
        } catch (Exception ex) {
            System.out.println("Exception while taking a screenshot: " + ex.getMessage());
        }
    }

    public static void quit() {
        driver.quit();
    }
}

