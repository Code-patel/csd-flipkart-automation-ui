package com.flipkart.uiUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
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

    public boolean isElementVisible(By locator) {
        boolean isVisible;
        try{
            driver.findElement(locator);
            System.out.println("Element is visible");
            isVisible = true;
        }catch (Exception e){
            isVisible = false;
            System.out.println("Element is not visible");
        }
        return isVisible;
    }

    public void hoverToMenu(By menuLogin) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(menuLogin)).perform();
    }

    public void waitTillElementIsNotVisible(By lblErrorMessage, int wait_time) {
        int count = 1;
        sleep(1000);
        while (count<=wait_time){
            if(!isElementVisible(lblErrorMessage)){
                sleep(1000);
                count++;
            }else {
                break;
            }
        }

    }

    public String getTextFromElement(By lblErrorMessage) {
        return driver.findElement(lblErrorMessage).getText();
    }

    public void clickOnElementUsingJSExecutor(By btnLogin) {
        WebElement element = driver.findElement(btnLogin);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void selectByVisibleText(By locator, String visibleText) {
        WebElement element = driver.findElement(locator);
        Select selectObj = new Select(element);
        selectObj.selectByVisibleText(visibleText);
    }


    public void selectByValue(By locator, String visibleText) {
        WebElement element = driver.findElement(locator);
        Select selectObj = new Select(element);
        selectObj.selectByValue(visibleText);
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locators) {
        return driver.findElements(locators);
    }

    public void moveToNextBrowserTab(){
        Set<String> handles = driver.getWindowHandles();
        int tabCount = 0;
        for(String tab : handles){
            if(tabCount==1){
                driver.switchTo().window(tab);
                break;
            }
            tabCount++;
        }
        sleep(1000);
    }
}
