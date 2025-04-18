package com.flipkart.steps;

import com.flipkart.pages.CheckoutPage;
import com.flipkart.pages.DashboardPage;
import com.flipkart.pages.ProductDetailsPage;
import com.flipkart.uiUtils.DriverManagers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup(){
        driver = DriverManagers.openChromeBrowser();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
