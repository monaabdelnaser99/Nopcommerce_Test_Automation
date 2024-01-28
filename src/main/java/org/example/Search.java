package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Search extends PageBase{
    public Search(WebDriver driver) {
        super(driver);
    }
    By searchBox = By.id("small-searchterms");
    WebElement searchTxtBox =driver.findElement(searchBox);
    By buttonSearch = By.xpath("//button[@type='submit']");
    WebElement SearchBtn =driver.findElement(buttonSearch);


           By dropdownSearch =By.xpath("//u1[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']");

       List< WebElement> productList = (List<WebElement>) driver.findElements(dropdownSearch);
    //  WebElement drop =driver.findElement((By) productList);

  //  WebElement dropdown = driver.findElement(By.xpath("//ul[@id='ui-id-1']"));
  //  Select mac =new Select(dropdown);
   // mac.selectVisibleText("Apple MacBook Pro 13-inch");

    public void productSearch(String productName){
        sendKeysElementTxt(searchTxtBox,productName);


    }
    public void clickSearch (){
        clickButton(SearchBtn);
    }

   public void productSearchWithAutoSuggest(String searchTxt) throws InterruptedException {
        sendKeysElementTxt(searchTxtBox,searchTxt);
        Thread.sleep(3000);

    }
    public void clickonFirstSuggest(){
       for (int i =0; i<productList.size();i++){
           productList.get(i).getText().contains("Apple MacBook Pro 13-inch");
       }

    }

 //   Select dropdown = new Select(driver.findElement(By.xpath("//u1[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']"));
    // For a regular list:

}