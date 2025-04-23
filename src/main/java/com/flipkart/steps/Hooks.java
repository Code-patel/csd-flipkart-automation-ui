package com.flipkart.steps;

import com.flipkart.uiUtils.DriverManagers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup() {
        driver = DriverManagers.openChromeBrowser();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        takeScreenShotAndAttachToAllureReport();
        driver.quit();
    }

    public void takeScreenShotAndAttachToAllureReport() {
        var scrShot = ((TakesScreenshot) driver);
        var img = scrShot.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Steps screenshot", new ByteArrayInputStream(img));
    }
}
