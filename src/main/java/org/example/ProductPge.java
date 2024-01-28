package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPge extends PageBase {
    public ProductPge(WebDriver driver) {
        super(driver);
    }
    By productDetails = By.cssSelector("h2.product-title");
   public WebElement productname =driver.findElement(productDetails);
   By productPrice =By.cssSelector("span.price-value-4");
   public WebElement productPriceType =driver.findElement(productPrice);

By AddtoCompare =By.cssSelector("button.button-2 add-to-compare-list-button");
WebElement AddItemToCompareList =driver.findElement(AddtoCompare);
public void AddProductToCompare(){
    clickButton(AddItemToCompareList);
}



}
