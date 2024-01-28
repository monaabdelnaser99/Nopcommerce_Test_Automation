package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends PageBase{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    public void disktops (){
        WebElement disktop =driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a"));
        clickButton(disktop);
    }
// By AddproductToCart =By.id("add-to-cart-button-4");

  public void UserCanAddItemToCart (){
      WebElement AddToCart = driver.findElement(By.xpath(
              "//button[contains(@id,'add-to-cart-button')]"));
      clickButton(AddToCart);

  }
 // By checkAdd=By.id("checkout");
 // public WebElement CheckOut =driver.findElement(checkAdd);

    public void RemoveProductFromCart() {
        WebElement remevoFromCart =driver.findElement(By.cssSelector("button.remove-btn"));
       clickButton(remevoFromCart);
        WebElement UpdatCart = (WebElement) driver.findElements(By.id("updatecart"));
        clickButton(UpdatCart);
    }

}



