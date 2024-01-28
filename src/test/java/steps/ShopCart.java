package steps;

import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;

public class ShopCart extends TestBase {
    HomePage home;
    LoginPage login;
    Search search;
    ProductPge product;
    ShoppingCartPage shopping;

    @Given("the_user in home page")
    public void the_userInHomePage() {
        home=new HomePage(driver);
    }


    @When("I click login button")
    public void iClickLoginButton() {
        home.openLoginPage();
    }

    @And("enter {string},{string}")
    public void enter(String email, String password) {
        login=new LoginPage(driver);
        login.UserLogin(email,password);
        login.LoginButton1();
    }
    @And("search for a product")
    public void searchForAProduct() throws InterruptedException {
        search=new Search(driver);
        search.productSearchWithAutoSuggest("mac");
        Thread.sleep(3000);
        search.clickonFirstSuggest();
    }


    @Then("we can add product to shopping cart")
    public void weCanAddProductToShoppingCart() throws InterruptedException {
        Thread.sleep(3000);
        shopping=new ShoppingCartPage(driver);
        Thread.sleep(3000);
        shopping.UserCanAddItemToCart();
    }


}
