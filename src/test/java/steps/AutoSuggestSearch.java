package steps;

import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HomePage;
import org.example.LoginPage;
import org.example.ProductPge;
import org.example.Search;
import org.testng.Assert;

import javax.swing.plaf.PanelUI;

public class AutoSuggestSearch extends TestBase {
HomePage home;
LoginPage login;
Search search;
ProductPge product;

@Given("the user in home page can search for aproduct")
    public void userFirstLogin(){
    home=new HomePage(driver);
    home.openLoginPage();
    login=new LoginPage(driver);
    login.UserLogin("mona@gmail.com","123456");
    login.LoginButton1();
}

    @When("enter {string}")
    public void enter(String product) throws InterruptedException {
    search=new Search(driver);
    search.productSearchWithAutoSuggest(product);
    }

    @And("i click on suggestProduct")
    public void iClickOnSuggestProduct() {
    search.clickonFirstSuggest();

    }

    @Then("display produt")
    public void displayProdut() {
   // product=new ProductPge(driver);
       // Assert.assertTrue(product.productname.getText().equalsIgnoreCase("Apple MacBook Pro 13-inch "));
    }
}
