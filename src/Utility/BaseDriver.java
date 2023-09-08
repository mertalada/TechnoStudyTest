package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriverWait wait;
    public static WebDriver driver;
    static {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public void loginTesti() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        MyFunction.Wait(1);

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("celik5561@hotmail.com");
        MyFunction.Wait(1);

        WebElement inputpassword = driver.findElement(By.id("input-password"));
        inputpassword.sendKeys("Musab.Test");
        MyFunction.Wait(1);
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();
        MyFunction.Wait(1);
    }
    public static void TakeScreenshot(WebDriver driver) throws IOException {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        TakesScreenshot ss = (TakesScreenshot) driver;
        String currentDate = myDateFormat.format(date);
        File screenShot = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File("src/TechnoStudyProje/MyScreenshots/screenshot_" + currentDate + ".png"));

    }
    @BeforeClass
    public void startingActions() {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //loginTesti();
    }

    @AfterClass
    public void BekleVeKapat() {
        MyFunction.Wait(2);
        driver.quit();
    }
}
