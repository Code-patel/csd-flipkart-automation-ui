package com.flipkart.uiUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PageUiUtils {

    WebDriver driver ;
    WebDriverWait wait;

    public PageUiUtils(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,  10);
    }

    public WebDriver getDriver(){
        return driver;
    }

    public WebDriverWait getWebDriverWait(){
        return wait;
    }

    public void clickOnElement(By element){
        driver.findElement(element).click();
    }

    public void sendTextToElement(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    public void sleep(int waitTime){
        try {
            Thread.sleep(waitTime);
        }catch (Exception e){
            System.out.println("Waiting...");
        }
    }
}
