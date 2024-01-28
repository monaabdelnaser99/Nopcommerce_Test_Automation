package Test;

import org.example.HomePage;
import org.example.ProductPge;
import org.example.Search;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchPage extends TestBase{
    String productName ="Apple MacBook Pro 13-inch";
    Search searchObject;
    ProductPge productObject;


    @Test
    public void UserCanSearchForProducts () throws InterruptedException {
        searchObject =new Search(driver);
        searchObject.productSearch(productName);
        searchObject.clickSearch();
       productObject=new ProductPge(driver);

        Thread.sleep(3000);
       Assert.assertTrue(productObject.productname.getText().equalsIgnoreCase(productName));
        Assert.assertEquals(productObject.productname.getText(),productName);
    }
}
