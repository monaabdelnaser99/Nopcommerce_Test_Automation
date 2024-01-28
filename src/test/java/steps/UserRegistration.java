package steps;

import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AUserRegisterationPage;
import org.example.HomePage;
import org.testng.Assert;

public class UserRegistration extends TestBase
{
    AUserRegisterationPage register ;
    HomePage home ;

    @Given("the user in the home page")
    public void the_user_in_the_home_page() {
        home=new HomePage(driver);
        home.openRegistrationPage();
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I click on register link")
    public void theUserInHomePage(){

    }


    @Then("the registration page displayed successfuly")
    public void the_registration_page_displayed_successfuly() {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));

    }


    @And("I entered {string} , {string} , {string} , {string}")
    public void iEntered(String firstname, String lastname, String email, String password) {
        register=new AUserRegisterationPage(driver);
        register.userRegister( firstname,lastname,email,password);
    }
}




