package Test;

import org.example.HomePage;
import org.example.LoginPage;
import org.example.WishListPge;
import org.testng.annotations.Test;

public class WishListTest extends TestBase{
    HomePage home;
    LoginPage login;
    WishListPge wish;
    @Test(priority = 1)
    public void UserCanAddItemToWishList () throws InterruptedException {
        home =new HomePage(driver);
        home.openLoginPage();
        login =new LoginPage(driver);
        login.UserLogin("mona@gmail.com","123456");
        login.LoginButton1();
        Thread.sleep(3000);
        home.clickOnComputer();
        Thread.sleep(3000);
        wish=new WishListPge(driver);
        wish.disktops();
        Thread.sleep(3000);}
    @Test (priority = 2)
    public void checkAddWish() throws InterruptedException {
        wish=new WishListPge(driver);
        wish.scrollTo();
        wish.AddFirstProduct();
        Thread.sleep(3000);
    }




}
