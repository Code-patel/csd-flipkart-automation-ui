package com.flipkart.pages;

import com.flipkart.uiUtils.PageUiUtils;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    PageUiUtils pageUiUtils;

    public CheckoutPage(WebDriver driver) {
        this.pageUiUtils = new PageUiUtils(driver);
    }
}
