package com.flipkart.pages;

import com.flipkart.uiUtils.PageUiUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {

    PageUiUtils pageUiUtils;

    public ProductPage(WebDriver driver) {
        this.pageUiUtils = new PageUiUtils(driver);
    }

    public void filterByPrice(int minPrice, int maxPrice) {
        By minSelect = By.xpath("(//select[@class='Gn+jFg'])[1]");
        By maxSelect = By.xpath("(//select[@class='Gn+jFg'])[2]");
        pageUiUtils.clickOnElement(minSelect);
        pageUiUtils.selectByValue(minSelect, String.valueOf(minPrice));
        pageUiUtils.sleep(3000);
        pageUiUtils.clickOnElement(maxSelect);
        pageUiUtils.selectByValue(maxSelect, String.valueOf(maxPrice));
        pageUiUtils.sleep(5000);
    }

    public boolean verifyListedProductsPriceBetween(int minPrice, int maxPrice) {
        By lstItemPrice = By.xpath("//div[contains(@data-tkid,'SEARCH')]//div[contains(@class,'Nx9bqj _4b5DiR')]");
        List<WebElement> items = pageUiUtils.findElements(lstItemPrice);

        for(WebElement item : items ){
            String price1 = item.getText().split("₹")[1].split(",")[0];
            String price2 = item.getText().split("₹")[1].split(",")[1];
            int price = Integer.parseInt(price1+price2);
            if(!(price>=minPrice && price<=maxPrice)){
                return false;
            }
        }
        return true;
    }

    public void filterByColor(String colorName) {
        By lblColor = By.xpath("//section//div[text()='Color']");
        By lblColorName = By.xpath("//section//div[text()='"+colorName+"']");
        pageUiUtils.clickOnElement(lblColor);
        pageUiUtils.clickOnElement(lblColorName);
        pageUiUtils.sleep(2000);
    }

    public void openFirstItemFromListedView() {
        By lstJeans = By.xpath("//div[@class='_75nlfW']//div[@data-id]");
        List<WebElement> listItems = pageUiUtils.findElements(lstJeans);
        listItems.get(0).click();
        pageUiUtils.sleep(1000);
        pageUiUtils.moveToNextBrowserTab();
    }

    public boolean verifyItemColor(String color) {
        By itemDesc = By.xpath("//span[@class='VU-ZEz']");
        String desc = pageUiUtils.getTextFromElement(itemDesc);
        return desc.contains(color) || desc.contains(color.toLowerCase());
    }
}
