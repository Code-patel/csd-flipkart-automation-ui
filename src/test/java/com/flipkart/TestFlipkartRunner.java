package com.flipkart;


import org.testng.annotations.Test;

public class TestFlipkartRunner extends BaseUI{

    @Test
    public void login(){
        dashboardPage.clickOnLoginButton();
        dashboardPage.enterUsername("7698717268");
        dashboardPage.clickOnRequestOTPButton();
        System.out.println("Open your mobile and copy OTP and submit.....");
    }

    @Test
    public void verifyProfileDetails(){
        dashboardPage.clickOnLoginButton();
        dashboardPage.enterUsername("7698717268");
        dashboardPage.clickOnRequestOTPButton();
        System.out.println("Open your mobile and copy OTP and submit.....");
    }
}
