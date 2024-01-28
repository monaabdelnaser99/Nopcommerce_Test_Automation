package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CurrencyPage extends PageBase{
    public CurrencyPage(WebDriver driver) {
        super(driver);
    }



public void chooseCurrency( ) {
    WebElement currencyEl = driver.findElement(By.name("customerCurrency"));
    currencyEl.click();
    Select select = new Select(currencyEl);
    select.selectByIndex(1);
}
}


















