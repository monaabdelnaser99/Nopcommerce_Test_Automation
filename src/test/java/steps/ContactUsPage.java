package steps;

import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ContactUS;
import org.example.HomePage;
import org.testng.Assert;

public class ContactUsPage extends TestBase {
    ContactUS contacObject;
    HomePage home;

    @Given("User in home")
    public void userInHome() {
        home=new HomePage(driver);
        home.scrollTo();

        
    }

    @When("I click in ContactUs in homePage")
    public void iClickInContactUsInHomePage() {
        home.clickOnContactUs();

    }

    @And("entered {string},{string},{string}")
    public void entered(String name, String email, String password) {
        contacObject =new ContactUS(driver);
        contacObject.contactInformation(name,email,password);
        
    }

    @And("click submit")
    public void clickSubmit() {
        contacObject.clickOnSubmit();
        
    }

    @Then("display success message")
    public void displaySuccessMessage() throws InterruptedException {


    }
}
