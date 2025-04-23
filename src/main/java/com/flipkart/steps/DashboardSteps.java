package com.flipkart.steps;

import com.flipkart.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardSteps {

    DashboardPage dashboardPage;

    public DashboardSteps() {
        this.dashboardPage = new DashboardPage(Hooks.driver);
    }

    @Given("Navigate to flipkart")
    public void navigateToFlipkart() {
        dashboardPage.navigateToFlipkart();
    }

    @And("Click on Login button")
    public void clickOnLoginButton() {
        dashboardPage.clickOnLoginButton();
    }

    @When("Fill username as {string}")
    public void fillUsername(String username) {
        dashboardPage.enterUsername(username);
    }

    @And("Copy OTP and Submit manually")
    public void submitOTPManually() {
        boolean isProceed = dashboardPage.submitOTPManually();
        Assert.assertFalse("OTP is not submitted manually by user", isProceed);
    }

    @And("Verify Dashboard page after login")
    public void verifyDashboardPageAfterLogin() {
        dashboardPage.verifyDashboardPageAfterLogin();
    }

    @Then("Verify validation error message")
    public void verifyValidationErrorMessage() {
        String message = dashboardPage.getValidationErrorMessage();
        Assert.assertFalse("Not found validation error message", message.isEmpty());
    }

    @And("Click on Request OTP button")
    public void clickOnRequestOTPButton() {
        dashboardPage.clickOnRequestOTPButton();
    }

    @Then("Verify is visible submit OTP screen")
    public void verifyIsVisibleSubmitOTPScreen() {
        boolean isVisible = dashboardPage.isVisibleSubmitOTPScreen();
        Assert.assertTrue("Submit OTP screen is not visible", isVisible);

    }

    @Then("Verify logo in header section")
    public void verifyLogoInHeaderSection() {
        boolean isVisible = dashboardPage.isVisibleLogoInHeader();
        Assert.assertTrue("Logo icon in header is not visible", isVisible);
    }

    @And("Verify product search box in header section")
    public void verifyProductSearchBoxInHeaderSection() {
        boolean isVisible = dashboardPage.isVisibleSearchTextBoxInHeader();
        Assert.assertTrue("Search Text Box in header is not visible", isVisible);
    }

    @And("Verify Login menu in header section")
    public void verifyLoginMenuInHeaderSection() {
        boolean isVisible = dashboardPage.isVisibleMenuAndSubMenu("Login", "My Profile");
        Assert.assertTrue("Login menu and My Profile sub menu is not visible", isVisible);

        isVisible = dashboardPage.isVisibleMenuAndSubMenu("Login", "Flipkart Plus Zone");
        Assert.assertTrue("Login menu and Flipkart Plus Zone sub menu is not visible", isVisible);

        isVisible = dashboardPage.isVisibleMenuAndSubMenu("Login", "Orders");
        Assert.assertTrue("Login menu and Orders sub menu is not visible", isVisible);

        isVisible = dashboardPage.isVisibleMenuAndSubMenu("Login", "Wishlist");
        Assert.assertTrue("Login menu and Wishlist sub menu is not visible", isVisible);

        isVisible = dashboardPage.isVisibleMenuAndSubMenu("Login", "Rewards");
        Assert.assertTrue("Login menu and Rewards sub menu is not visible", isVisible);

        isVisible = dashboardPage.isVisibleMenuAndSubMenu("Login", "Gift Cards");
        Assert.assertTrue("Login menu and Gif Cards sub menu is not visible", isVisible);
    }

    @And("Verify Cart icon in header section")
    public void verifyCartIconInHeaderSection() {
        boolean isVisible = dashboardPage.verifyCartIconInHeader();
        Assert.assertTrue("Cart icon is not visible in header section", isVisible);
    }

    @And("Verify Become A Seller menu in header section")
    public void verifyBecomeASellerMenuInHeaderSection() {
        boolean isVisible = dashboardPage.verifyBecomeASellerInHeader();
        Assert.assertTrue("Become A Seller is not visible in header section", isVisible);
    }

    @And("Verify Others menu in header section")
    public void verifyOthersMenuInHeaderSection() {
        boolean isVisible = dashboardPage.verifyOtherMenus();
        Assert.assertTrue("Others menu is not visible in header section", isVisible);
    }

    @Then("Verify menu {string} and sub menu {string} in footer section")
    public void verifyMenuAndSubMenuInFooterSection(String menu, String subMenu) {
        boolean isVisible = dashboardPage.verifyFooterMenuAndItsSubMenu(menu, subMenu);
        Assert.assertTrue(menu+" menu and its submenu"+subMenu+" is not visible in footer section", isVisible);
    }

    @And("Verify Mail Us Address in footer section")
    public void verifyMailUsAddressInFooterSection() {
        boolean isVisible = dashboardPage.verifyMailUsAddress();
        Assert.assertTrue("Mail Us Address is not visible in footer section", isVisible);
    }

    @And("Verify Social Icons {string} in footer section")
    public void verifySocialIconsInFooterSection(String socialIconName) {
        boolean isVisible = dashboardPage.verifySocialIcons(socialIconName);
        Assert.assertTrue("Social icon {} is not visible in footer section", isVisible);
    }

    @And("Verify Registered Office Address in footer section")
    public void verifyRegisteredOfficeAddressInFooterSection() {
        boolean isVisible = dashboardPage.verifyRegisteredOfficeAddress();
        Assert.assertTrue("Mail Us Address is not visible in footer section", isVisible);
    }

    @And("Verify Become A Seller menu in footer section")
    public void verifyBecomeASellerMenuInFooterSection() {
        boolean isVisible = dashboardPage.verifyBecomeASellerInFooter();
        Assert.assertTrue("Mail Us Address is not visible in footer section", isVisible);
    }

    @And("Verify Advertise in footer section")
    public void verifyAdvertiseInFooterSection() {
        boolean isVisible = dashboardPage.verifyAdvertiseInFooter();
        Assert.assertTrue("Mail Us Address is not visible in footer section", isVisible);
    }

    @And("Verify Gift Cards in footer section")
    public void verifyGiftCardsInFooterSection() {
        boolean isVisible = dashboardPage.verifyGiftCardsInFooter();
        Assert.assertTrue("Mail Us Address is not visible in footer section", isVisible);
    }

    @And("Verify Help Center in footer section")
    public void verifyHelpCenterInFooterSection() {
        boolean isVisible = dashboardPage.verifyHelpCenterInFooter();
        Assert.assertTrue("Mail Us Address is not visible in footer section", isVisible);
    }

    @Then("Verify Flight Booking menu is visible")
    public void verifyFlightBookingMenuIsVisible() {
        boolean isVisible = dashboardPage.verifyFlightBookingMenu();
        Assert.assertTrue("Flight Booking menu is not visible", isVisible);
    }

    @And("Click on Flight Booking menu")
    public void clickOnFlightBookingMenu() {
        dashboardPage.clickOnFlightBookingMenu();
    }

    @And("Verify Flight Booking navigation page")
    public void verifyFlightBookingNavigationPage() {
        boolean isVisible = dashboardPage.verifyFlightBookingNavigationPage();
        Assert.assertTrue("Flight Booking navigation page is not proper", isVisible);
    }

    @Then("Verify Two Wheeler menu is visible")
    public void verifyTwoWheelerMenuIsVisible() {
        boolean isVisible = dashboardPage.verifyTwoWheelerMenuIsVisible();
        Assert.assertTrue("Two Wheeler menu is not visible", isVisible);
    }

    @And("Click on Two Wheeler sub menu {string}")
    public void clickOnTwoWheelerMenu(String subMenu) {
        dashboardPage.clickOnTwoWheelerMenu(subMenu);
    }

    @And("Verify Two Wheeler navigation page")
    public void verifyTwoWheelerNavigationPage() {
        boolean isVisible = dashboardPage.verifyTwoWheelerNavigationPage();
        Assert.assertTrue("Two Wheeler navigation page is not proper", isVisible);
    }

    @And("Search item {string}")
    public void searchItem(String itemName) {
        dashboardPage.searchItem(itemName);
    }
}
