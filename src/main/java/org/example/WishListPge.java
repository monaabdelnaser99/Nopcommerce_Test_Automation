package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPge extends PageBase{
    public WishListPge(WebDriver driver) {
        super(driver);
    }
public void disktops (){
    WebElement disktop =driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a"));
    clickButton(disktop);
}

public void AddFirstProduct(){

        WebElement AddTowishList =driver.findElement(By.xpath("//div[@data-productid='1']//following-sibling::div[@class='buttons']//button[@class='button-2 add-to-wishlist-button']"));
        clickButton(AddTowishList);

}
}
