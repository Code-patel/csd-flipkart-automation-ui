package com.flipkart.steps;

import com.flipkart.pages.CheckoutPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {

    CheckoutPage checkoutPage;

    public CheckoutSteps(WebDriver driver){
        this.checkoutPage = new CheckoutPage(driver);
    }
}











