package lt.justinas.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");// padidina langa per visa ekrana
//        options.addArguments("--window size--4000,3000"); // galima paciam irasyti rezoliucijos dydi
//        options.addArguments("--headless=new"); // uzkrauna tik kompiuterio atminti
//        options.addArguments("--force-device-scale-factor=0.70"); // zoom

        driver = new ChromeDriver(options); // ideti options i skliaustus

        driver.get("chrome://settings/");  // zoom MAC
        ((JavascriptExecutor) driver).executeScript("chrome.settingsPrivate.setDefaultZoom(0.65)");
        //mazinti 0.65 didinti 1.25

    }
}
