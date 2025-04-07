package com.flipkart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFlipkartCasesWithoutLogin extends BaseUI {

    @Test
    public void verifyHeader() {
        boolean isVisible = dashboardPage.isVisibleLogoInHeader();
        Assert.assertTrue(isVisible, "Logo is not visible");

        isVisible = dashboardPage.isVisibleSearchTextBoxInHeader();
        Assert.assertTrue(isVisible, "Search Textbox is not visible");

        isVisible = dashboardPage.verifyLoginMenuAndSubMenus();
        Assert.assertTrue(isVisible, "Login menu is not visible");

        isVisible = dashboardPage.verifyCartIconInHeader();
        Assert.assertTrue(isVisible, "Cart Menu is not visible");

        isVisible = dashboardPage.verifyBecomeASellerInHeader();
        Assert.assertTrue(isVisible, "Become A Seller menu is not visible");

        isVisible = dashboardPage.verifyOtherMenus();
        Assert.assertTrue(isVisible, "Other menus are not visible");
    }

    @Test
    public void verifyFooter() {
        dashboardPage.verifyFooterMenuAndItsSubMenu("ABOUT", "Contact Us");
        dashboardPage.verifyFooterMenuAndItsSubMenu("ABOUT", "Contact Us");
        dashboardPage.verifyFooterMenuAndItsSubMenu("ABOUT", "Contact Us");
        dashboardPage.verifyFooterMenuAndItsSubMenu("ABOUT", "Contact Us");
        dashboardPage.verifyFooterMenuAndItsSubMenu("ABOUT", "Contact Us");

        dashboardPage.verifyMailUsAddress();
        dashboardPage.verifySocialIcons();
        dashboardPage.verifyRegisteredOfficeAddress();

        dashboardPage.verifyBecomeASellerInFooter();
        dashboardPage.verifyAdvertiseInFooter();
        dashboardPage.verifyGiftCardsInFooter();
        dashboardPage.verifyHelpCenterInFooter();
    }

    @Test
    public void searchMobileAndFilterByPrice() {
        dashboardPage.searchProducts("Mobile");
        productDetailsPage.filterByPrice(10000, 20000);
        productDetailsPage.verifyListedProductsPriceBetween(10000, 20000);
    }

    @Test
    public void searchJeansAndFilterByColor() {
        dashboardPage.searchProducts("Jeans");
        productDetailsPage.filterByColor("Blue");
        productDetailsPage.verifyListedProductsColor("Blue");
    }

    @Test
    public void searchShoesAndFilterByBrand() {
        dashboardPage.searchProducts("Shoes");
        productDetailsPage.filterByBrand("Nike");
        productDetailsPage.verifyListedProductsBrand("Nike");
    }
}
