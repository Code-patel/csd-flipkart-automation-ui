package com.flipkart;

import org.testng.annotations.Test;

public class TestFlipkartCasesWithLogin extends BaseUI {

    @Test
    public void loginToFlipkart() {
        dashboardPage.clickOnLoginButton();
        dashboardPage.enterUsername("7698717268");
        dashboardPage.clickOnRequestOTPButton();
        System.out.println("Open your mobile and copy OTP and submit.....");
    }

    @Test
    public void verifyUserProfileDetails() {
        dashboardPage.clickOnLoginButton();
        dashboardPage.enterUsername("7698717268");
        dashboardPage.clickOnRequestOTPButton();
        System.out.println("Open your mobile and copy OTP and submit.....");
    }


    @Test
    public void verifyCartItemFromDashboard() {

    }

    @Test
    public void verifyOrderDetails() {

    }

    @Test
    public void verifyWishlistItems() {

    }

    @Test
    public void verifyCoupons() {

    }

    @Test
    public void verifyGiftCards() {

    }

    @Test
    public void verifyNotifications() {

    }

    @Test
    public void verifyCartAfterAddItemToCartFromItemDetailsPage() {

    }

    @Test
    public void verifyCartAfterBuyItemFromItemDetailsPage() {

    }
}
