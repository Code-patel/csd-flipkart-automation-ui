package com.flipkart.pages;

import com.flipkart.uiUtils.PageUiUtils;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {

    PageUiUtils pageUiUtils;

    public ProductDetailsPage(WebDriver driver) {
        this.pageUiUtils = new PageUiUtils(driver);
    }

    public void filterByPrice(int minPrice, int maxPrice) {

    }

    public void verifyListedProductsPriceBetween(int minPrice, int maxPrice) {
    }

    public void filterByColor(String colorName) {
    }

    public void verifyListedProductsColor(String colorName) {
    }

    public void filterByBrand(String brandName) {
    }

    public void verifyListedProductsBrand(String brandName) {
    }
}
