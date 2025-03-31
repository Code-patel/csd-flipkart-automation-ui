package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.flipkart.uiUtils.PageUiUtils;

public class DashboardPage {

    PageUiUtils pageUiUtils;

    public DashboardPage(WebDriver driver){
        this.pageUiUtils = new PageUiUtils(driver);
    }

    public void clickOnLoginButton() {
        By btnLogin = By.xpath("//a[text()='Login']");
        pageUiUtils.clickOnElement(btnLogin);
    }

    public void enterUsername(String emailOrMobile) {
        By txtUsername = By.xpath("//span[text()='Enter Email/Mobile number']/../..//input");
        pageUiUtils.sendTextToElement(txtUsername, emailOrMobile);
    }

    public void clickOnRequestOTPButton() {
        By btnRequestOTP = By.xpath("//button[text()='Request OTP']");
        pageUiUtils.clickOnElement(btnRequestOTP);
        pageUiUtils.sleep(25000);
    }

    public void clickOnVerifyOTPButton(){
        By btnVerifyOTP = By.xpath("//button[text()='Verify']");
        pageUiUtils.clickOnElement(btnVerifyOTP);
        pageUiUtils.sleep(2000);
    }
}
