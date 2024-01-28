package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.ui.Select.*;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openRegistrationPage(){
        WebElement RegisterBtn = driver.findElement(By.className("ico-register"));
       clickButton(RegisterBtn);
    }
   public void openLoginPage (){
        WebElement loginLink = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));

        clickButton(loginLink);
   }
   public void clickOnComputer (){
        WebElement ComputerLinkBtn =driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        clickButton(ComputerLinkBtn);
   }
   public  void clickOnContactUs(){
        WebElement ContactUsBTN =driver.findElement(By.linkText("Contact us"));
     clickButton(ContactUsBTN);
   }
   public void changeCurrency() {

       Select currency = new Select(driver.findElement(By.id("customerCurrency")));
         currency.deselectByVisibleText("Euro");

   }

}
