package com.flipkart;

import com.flipkart.uiUtils.DriverManagers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import com.flipkart.pages.*;

public class BaseUI {

    WebDriver driver;
    DashboardPage dashboardPage;
    ProductDetailsPage productDetailsPage;
    CheckoutPage checkoutPage;

    String url = "http://flipkart.com";

    @BeforeSuite
    public void beforeClass() {
        driver = DriverManagers.openChromeBrowser();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        dashboardPage = new DashboardPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @AfterSuite
    public void afterClass() {
        driver.quit();
    }
}
