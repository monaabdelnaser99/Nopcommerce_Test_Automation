package Test;

import org.example.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparePageTest extends TestBase{
    String firstProductName = "Apple MacBook Pro 13-inch";
    String secondProductName = "Asus N551JK-XO076H Laptop";
    HomePage homePage;
    ProductPge productObject;
    HomePage home;
    ComparePage compareObject;
    Search searchObject;
    LoginPage login;

  /*  public AddProductToCompareTest() {
    }*/

    @Test(priority = 1)
    public void login(){

        home = new HomePage(driver);
        home.openLoginPage();
        login = new LoginPage(driver);
        login.UserLogin("mona@gmail.com", "123456");
        login.LoginButton1();
    }

@Test (priority = 2)
    public void UserCanCompareProducts() throws InterruptedException {
        searchObject = new Search(driver);

        productObject = new ProductPge(driver);
        compareObject = new ComparePage(driver);
        searchObject.productSearchWithAutoSuggest("mac");
       Assert.assertTrue(productObject.productname.getText().contains(firstProductName));
        productObject.AddProductToCompare();
        searchObject.productSearchWithAutoSuggest("Asus");
        Assert.assertTrue(productObject.productname.getText().contains(secondProductName));
        productObject.AddProductToCompare();
        Thread.sleep(1000L);
        driver.navigate().to("http://demo.nopcommerce.com/compareproducts");
        compareObject.CompareProducts();
    }

    @Test(priority = 3)
    public void UserCanClearCompareList() {
        compareObject.clearCompareList();
        Assert.assertTrue(compareObject.nodataApear.getText().contains("You have no items to compare."));
    }
}
