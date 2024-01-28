package Test;

import org.example.*;
import org.testng.annotations.Test;

public class ShoppingcartTest extends TestBase {

    HomePage home;
    LoginPage login;
    ShoppingCartPage shopping;
    Search search;

    @Test(priority = 1)
    public void UserCanAddItemToWishList() throws InterruptedException {
        home = new HomePage(driver);
        home.openLoginPage();
        login = new LoginPage(driver);
        login.UserLogin("mona@gmail.com", "123456");
        login.LoginButton1();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void UserCanSearch() throws InterruptedException {
        search=new Search(driver);
        search.productSearchWithAutoSuggest("mac");
            Thread.sleep(3000);
        search.clickonFirstSuggest();
        Thread.sleep(5000);
        shopping=new ShoppingCartPage(driver);
        Thread.sleep(3000);
        shopping.UserCanAddItemToCart();
      //  Assert.assertTrue(shopping.CheckOut.getText().contains("1,800.00"));

    }
   @Test(priority =3)
    public void UserCanRemoveProductFromCart() {
        shopping = new ShoppingCartPage(driver);
        shopping.RemoveProductFromCart();
    }

}