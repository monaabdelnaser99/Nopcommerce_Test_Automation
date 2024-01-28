package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComparePage extends PageBase{
    public ComparePage(WebDriver driver) {
        super(driver);
    }
By ClearBTN = By.cssSelector("a.clear-list");
    WebElement CheckClearBtn =driver.findElement(ClearBTN);
By table =By.className("compare-products-table");
WebElement CompareTable=driver.findElement(table);
    By tr =By.tagName("tr");

    List< WebElement> allRows = (List<WebElement>) driver.findElements(tr);

    By td =By.tagName("td");

    List< WebElement> allCol = (List<WebElement>) driver.findElements(td);
    By nodatam =By.cssSelector("div.no-data");
   public WebElement nodataApear =driver.findElement(nodatam);
    public void clearCompareList(){
        clickButton(CheckClearBtn);
    }
    public void CompareProducts() {
    //get all rows
        System.out.println(this.allRows.size());
        //get data from each row
        for (WebElement row : allRows){
            System.out.println(row.getText() + "\t");
            for (WebElement col : allCol){
                System.out.println(col.getText()+ "\t");
            }
        }
      /*  Iterator var2 = this.allRows.iterator();

        while(var2.hasNext()) {
            WebElement row = (WebElement)var2.next();
            System.out.println(row.getText() + "\t");
            Iterator var4 = this.allCol.iterator();

            while(var4.hasNext()) {
                WebElement col = (WebElement)var4.next();
                System.out.println(col.getText() + "\t");*/
            }


}
