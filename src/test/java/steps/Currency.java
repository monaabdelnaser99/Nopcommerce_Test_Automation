package steps;

import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;
import org.testng.Assert;

public class Currency extends TestBase {
    

    HomePage home;
    LoginPage login;
    CurrencyPage currency;
Search search;
ProductPge product;
    @Given("home_page")
    public void home_page() {
        home =new HomePage(driver);
        home.openLoginPage();

    }

    @When("I click login")
    public void iClickLogin() {
        login=new LoginPage(driver);
        login.LoginButton1();
    }

    @And("I entered {string},{string}")
    public void iEntered(String mail, String password) throws InterruptedException  {

            Thread.sleep(1000);
            login=new LoginPage(driver);
            login.UserLogin(mail,password);
        
    }

    @And("login button")
    public void loginButton() {
        login.LoginButton1();
    }

    @Then("choose the Euro currency")
    public void chooseTheEuroCurrency() {
        currency=new CurrencyPage(driver);
        currency.chooseCurrency();
        
    }

    @And("Try search for product to certain that Currenvy Changed")
    public void trySearchForProductToCertainThatCurrenvyChanged() {
        try {
            search = new Search(driver);
            search.productSearchWithAutoSuggest("mac");
            product = new ProductPge(driver);
            Assert.assertTrue(product.productPriceType.getText().contains("€"));
            System.out.println(product.productPriceType.getText());
        }catch (Exception var2) {
            System.out.println("Error occurred  " + var2.getMessage());
        }

    }
}
