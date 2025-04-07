package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.flipkart.uiUtils.PageUiUtils;

public class DashboardPage {

    PageUiUtils pageUiUtils;

    public DashboardPage(WebDriver driver) {
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

    public void clickOnVerifyOTPButton() {
        By btnVerifyOTP = By.xpath("//button[text()='Verify']");
        pageUiUtils.clickOnElement(btnVerifyOTP);
        pageUiUtils.sleep(2000);
    }

    public boolean isVisibleLogoInHeader() {
        By logoImg = By.xpath("//img[@title='Flipkart']");
        return pageUiUtils.isElementVisible(logoImg);
    }

    public boolean isVisibleSearchTextBoxInHeader() {
        By txtSearchBox = By.xpath("//input[@placeholder='Search for Products, Brands and More']");
        return pageUiUtils.isElementVisible(txtSearchBox);
    }

    public boolean verifyLoginMenuAndSubMenus() {
        By menuLogin = By.xpath("//a//span[text()='Login']");
        pageUiUtils.hoverToMenu(menuLogin);
        if (isVisibleSubMenu("My Profile")) {
            if (isVisibleSubMenu("Flipkart Plus Zone")) {
                if (isVisibleSubMenu("Orders")) {
                    if (isVisibleSubMenu("Wishlist")) {
                        if (isVisibleSubMenu("Rewards")) {
                            return isVisibleSubMenu("Gif Cards");
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean isVisibleSubMenu(String subMenu) {
        By menuDXPath = By.xpath("//a//li[text()='" + subMenu + "']");
        return pageUiUtils.isElementVisible(menuDXPath);
    }

    public boolean verifyCartIconInHeader() {
        By cartIcon = By.xpath("//a[text()='Cart']");
        return pageUiUtils.isElementVisible(cartIcon);
    }

    public boolean verifyBecomeASellerInHeader() {
        By bcsMenu = By.xpath("//a[text()='Become a Seller']");
        return pageUiUtils.isElementVisible(bcsMenu);
    }

    public boolean verifyOtherMenus() {
        By menuOther = By.xpath("//img[@alt='Dropdown with more help links']");
        pageUiUtils.hoverToMenu(menuOther);
        if (isVisibleSubMenu("Notification Preferences")) {
            if (isVisibleSubMenu("24x7 Customer Care")) {
                if (isVisibleSubMenu("Advertise")) {
                    return isVisibleSubMenu("Download App");
                }
            }
        }
        return false;
    }

    public void verifyFooterMenuAndItsSubMenu(String menu, String subMenu) {
    }

    public void verifyMailUsAddress() {
    }

    public void verifySocialIcons() {
    }

    public void verifyRegisteredOfficeAddress() {
    }

    public void verifyBecomeASellerInFooter() {
    }

    public void verifyAdvertiseInFooter() {
    }

    public void verifyGiftCardsInFooter() {
    }

    public void verifyHelpCenterInFooter() {
    }

    public void searchProducts(String productName) {
    }
}
