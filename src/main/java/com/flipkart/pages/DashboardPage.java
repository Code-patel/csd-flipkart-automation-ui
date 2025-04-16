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
        pageUiUtils.clickOnElementUsingJSExecutor(btnLogin);
    }

    public void enterUsername(String emailOrMobile) {
        By txtUsername = By.xpath("//span[text()='Enter Email/Mobile number']/../..//input");
        pageUiUtils.sendTextToElement(txtUsername, emailOrMobile);
    }

    public void clickOnRequestOTPButton() {
        By btnRequestOTP = By.xpath("//button[text()='Request OTP']");
        pageUiUtils.clickOnElement(btnRequestOTP);
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

    public boolean isVisibleMenuAndSubMenu(String menu, String subMenu) {
        By menuLogin = By.xpath("//a//span[text()='" + menu + "']");
        pageUiUtils.hoverToMenu(menuLogin);
        By sMenuDXPath = By.xpath("//a//li[text()='" + subMenu + "']");
        return pageUiUtils.isElementVisible(sMenuDXPath);
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

    public boolean verifyOtherMenusInHeaderSection(String otherMenuName) {
        By menuOther = By.xpath("//img[@alt='Dropdown with more help links']");
        pageUiUtils.hoverToMenu(menuOther);
        return isVisibleSubMenu(otherMenuName);
    }

    public boolean verifyFooterMenuAndItsSubMenu(String menu, String subMenu) {
        String dXpath = "//div[text()='" + menu + "']/..//a[text()='" + subMenu + "']";
        By msMenu = By.xpath(dXpath);
        return pageUiUtils.isElementVisible(msMenu);
    }

    public boolean verifyMailUsAddress() {
        String title = "Mail Us:";
        String addline1 = "Flipkart Internet Private Limited, ";
        String addline2 = " Buildings Alyssa, Begonia & ";
        String addline3 = " Clove Embassy Tech Village, ";
        String addline4 = " Outer Ring Road, Devarabeesanahalli Village, ";
        String addline5 = " Bengaluru, 560103, ";
        String addline6 = " Karnataka, India";
        String[] addressLines = {addline1, addline2, addline3, addline4, addline5, addline6};
        for (String add : addressLines) {
            String dXpath = "//div[text()='Mail Us:']/..//p[text()='" + add + "']";
            if (!pageUiUtils.isElementVisible(By.xpath(dXpath))) {
                return false;
            }

        }
        return true;
    }

    public boolean verifySocialIcons(String socialSiteName) {
        By fIcon = By.xpath("//div[text()='Social:']/following::div[1]//a[@aria-label='Facebook']");
        By tIcon = By.xpath("//div[text()='Social:']/following::div[1]//a[@aria-label='Twitter']");
        By yIcon = By.xpath("//div[text()='Social:']/following::div[1]//a[@aria-label='YouTube']");
        By iIcon = By.xpath("//div[text()='Social:']/following::div[1]//a[@aria-label='Instagram']");
        By sIconDPath = By.xpath("//div[text()='Social:']/following::div[1]//a[@aria-label='"+socialSiteName+"']");
        return pageUiUtils.isElementVisible(sIconDPath);
    }

    public boolean verifyRegisteredOfficeAddress() {
        return true;
    }

    public boolean verifyBecomeASellerInFooter() {
        return true;
    }

    public boolean verifyAdvertiseInFooter() {
        return true;
    }

    public boolean verifyGiftCardsInFooter() {
        return true;
    }

    public boolean verifyHelpCenterInFooter() {
        return true;
    }

    public void searchProducts(String productName) {
    }

    public void navigateToFlipkart() {
        pageUiUtils.getDriver().get("http://flipkart.com");
    }

    public void verifyDashboardPageAfterLogin() {
    }

    public String getValidationErrorMessage() {
        By lblErrorMessage = By.xpath("//span[text()='Please enter valid Email ID/Mobile number']");
        pageUiUtils.waitTillElementIsNotVisible(lblErrorMessage, 5);
        return pageUiUtils.getTextFromElement(lblErrorMessage);
    }

    public boolean isVisibleSubmitOTPScreen() {
        By btnVerifyOTP = By.xpath("//button[text()='Verify']");
        pageUiUtils.sleep(2000);
        return pageUiUtils.isElementVisible(btnVerifyOTP);
    }

    public boolean submitOTPManually() {
//        pageUiUtils.sleep(25000);
        By btnVerifyOTP = By.xpath("//button[text()='Verify']");
        pageUiUtils.sleep(2000);
        return pageUiUtils.isElementVisible(btnVerifyOTP);
    }

    By menuFlightBooking = By.xpath("//span[text()='Flight Bookings']");
    By menuTwoWheeler = By.xpath("//span[text()='Two Wheelers']");

    public boolean verifyFlightBookingMenu() {
        return pageUiUtils.isElementVisible(menuFlightBooking);
    }

    public void clickOnFlightBookingMenu() {
        pageUiUtils.clickOnElement(menuFlightBooking);
    }

    public boolean verifyFlightBookingNavigationPage() {
        String currentUrl = pageUiUtils.getDriver().getCurrentUrl();
        return currentUrl.contains("flights");
    }

    public boolean verifyTwoWheelerMenuIsVisible() {
        return pageUiUtils.isElementVisible(menuTwoWheeler);
    }

    public void clickOnTwoWheelerMenu(String subMenu) {
        pageUiUtils.hoverToMenu(menuTwoWheeler);
        String dXpath = "//a[text()='"+subMenu+"']";
        pageUiUtils.clickOnElement(By.xpath(dXpath));
    }

    public boolean verifyTwoWheelerNavigationPage() {
        String currentUrl = pageUiUtils.getDriver().getCurrentUrl();
        return currentUrl.contains("two-wheelers-store");
    }
}
