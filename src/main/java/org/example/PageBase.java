package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
    protected static void clickButton(WebElement element){

        element.click();
    }
    protected static void sendKeysElementTxt (WebElement element1 , String value){
        element1.sendKeys(value);
    }
    public void scrollTo()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }
}
