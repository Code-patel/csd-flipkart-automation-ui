package com.flipkart.steps;

import com.flipkart.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductSteps {

    ProductPage productPage;

    public ProductSteps(){
        this.productPage = new ProductPage(Hooks.driver);
    }

    @And("Filter by price as min {int} and max {int}")
    public void filter_by_price(int min, int max){
        productPage.filterByPrice(min, max);
    }

    @And("Verify filtered price is between min {int} and max {int}")
    public void filterByPriceAsMinAndMax(int minPrice, int maxPrice) {
        boolean isBetween = productPage.verifyListedProductsPriceBetween(minPrice, maxPrice);
        Assert.assertTrue("List product price is not between min and max price", isBetween);
    }

    @And("Filter by color as {string}")
    public void filterByColorAs(String color) {
        productPage.filterByColor(color);
    }

    @Then("Verify filtered jeans color is {string}")
    public void verifyFilteredJeansColorIs(String color) {
        boolean isValid = productPage.verifyItemColor(color);
        Assert.assertTrue("Item color is different", isValid);

    }

    @And("Open first item from listed view")
    public void openFirstItemFromListedView() {
        productPage.openFirstItemFromListedView();
    }
}
