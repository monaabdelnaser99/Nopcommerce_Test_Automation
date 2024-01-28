package Test;

import org.example.HomePage;
import org.example.LoginPage;
import org.example.ProductPge;
import org.example.Search;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAutoSuggested extends TestBase{
    Search searchObject;
    String productName ="mac";
    ProductPge productObject;
    HomePage home;
    LoginPage login;
@Test(priority = 1)
public void userCanLogin(){
    home=new HomePage(driver);
    home.openLoginPage();
    login=new LoginPage(driver);
    login.UserLogin("mona@gmail.com","123456");
    login.LoginButton1();
}
   @Test(priority = 2)
    public void UserCanSearchWithAutoSuggest () throws InterruptedException {
        searchObject =new Search(driver);
        searchObject.productSearchWithAutoSuggest(productName);
        searchObject.clickonFirstSuggest();
        productObject=new ProductPge(driver);
       Assert.assertTrue(productObject.productname.getText().equalsIgnoreCase("Apple MacBook Pro 13-inch "));

    }
}
