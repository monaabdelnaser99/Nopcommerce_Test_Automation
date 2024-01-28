package Test;

import org.example.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends TestBase{

    CurrencyPage currency ;

    HomePage home ;
    LoginPage login;
    Search search;
    ProductPge product;
    String productName = "Apple MacBook Pro 13-inch";

@Test(priority = 1)
    public void UserCanChangeCurrency(){
    currency=new CurrencyPage(driver);
   home=new HomePage(driver);
   home.openLoginPage();
   login=new LoginPage(driver);
   login.UserLogin("mona@gmail.com","123456");
   login.LoginButton1();
   currency.chooseCurrency();
}
@Test(priority = 2)
    public void Assert() throws InterruptedException {
    try {
        search = new Search(driver);
        search.productSearchWithAutoSuggest("mac");
        product = new ProductPge(driver);
        Assert.assertEquals(product.productname.getText(), productName);
      Assert.assertTrue(product.productPriceType.getText().contains("€"));
        System.out.println(product.productPriceType.getText());
    }catch (Exception var2) {
        System.out.println("Error occurred  " + var2.getMessage());
    }

}
}
