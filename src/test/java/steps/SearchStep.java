package steps;

import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HomePage;
import org.example.Search;
import org.testng.Assert;

public class SearchStep extends TestBase {

    Search search  ;

    HomePage home ;

    @Given("user2 in home page")
    public void certainUsrInHomePage(){
        home=new HomePage(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    }

    @When("search  by {string}")
    public void searchBy(String product) {
        search=new Search(driver);
        search.productSearch(product);
    }

    @And("i click search")
    public void iClickSearch() {
        search.clickSearch();
    }
}
