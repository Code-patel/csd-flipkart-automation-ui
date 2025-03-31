package com.flipkart.uiUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManagers {

    public static WebDriver openChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public static WebDriver openChromeBrowser(ChromeOptions options){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    public static WebDriver openFirefoxBrowser(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
