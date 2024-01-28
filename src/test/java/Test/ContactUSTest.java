package Test;

import org.example.ContactUS;
import org.example.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ContactUSTest extends TestBase{
ContactUS contacObject;
HomePage home;
@Test
    public void UserCanContactUs () throws InterruptedException {
    home=new HomePage(driver);
    home.scrollTo();
    home.clickOnContactUs();
    contacObject =new ContactUS(driver);
    contacObject.contactInformation("Mona","mona@gmail.com","jdhsjkcjks");
contacObject.clickOnSubmit();
    contacObject.suceesss();
    Thread.sleep(7000);
 // Assert.assertTrue(contacObject.suceesss().contains("Your enquiry has been successfully sent to the store owner."));


}
}
