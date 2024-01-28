package steps;

import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HomePage;
import org.example.LoginPage;
import org.testng.Assert;

public class Login extends TestBase {
    HomePage home;
        LoginPage login;

    @Given("user1 in home page")

    public void open_login()  {
        home =new HomePage(driver);
        home.openLoginPage();
    }


    @And ("click login button")
    public void click_login() throws InterruptedException {
        login.LoginButton1();
        Thread.sleep(1000);
    }

    @When("entered {string},{string}")
    public void entered(String mail, String password) throws InterruptedException {
        Thread.sleep(1000);
        login=new LoginPage(driver);
        login.UserLogin(mail,password);
    }

    @Then("the login page display successful")
    public void home_page() throws InterruptedException {
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
      //  String url = getCurrentUrl();
      //  Assert.assertEquals( "https://demo.nopcommerce.com/",url);
      //  System.out.println(url);
        Thread.sleep(1000);

    }



}
