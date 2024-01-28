package steps;

import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HomePage;
import org.example.LoginPage;
import org.example.WishListPge;

public class WishList extends TestBase {

    HomePage home;
    LoginPage login;
    WishListPge wish;
    @Given("the_user{int} in home page")
    public void the_userInHomePage(int arg0) {
        home =new HomePage(driver);

    }

    @When("I click login BTN")
    public void iClickLoginBTN() {
        home=new HomePage(driver);
        home.openLoginPage();
    }
    @And("enterr {string},{string}")
    public void enter( String email, String password) throws InterruptedException {
        login=new LoginPage(driver);
        login.UserLogin(email,password);
        login.LoginButton1();
        Thread.sleep(3000);
    }

    @And("click on computer category")
    public void clickOnComputerCategory() throws InterruptedException {
        home.clickOnComputer();
        Thread.sleep(3000);
    }

    @And("choose a disktop")
    public void chooseOnDisktop() throws InterruptedException {
        wish=new WishListPge(driver);
        Thread.sleep(3000);
        wish.disktops();
        Thread.sleep(3000);
    }

    @And("use scrollTo method")
    public void useScrollToMethod() throws InterruptedException {
        wish=new WishListPge(driver);
        wish.scrollTo();
        Thread.sleep(3000);
    }

    @Then("we can add product to wishList")
    public void weCanAddProductToWishList() throws InterruptedException {
        Thread.sleep(3000);
        wish.AddFirstProduct();
    }
}
