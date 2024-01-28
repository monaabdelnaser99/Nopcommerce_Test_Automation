package Test;

import org.example.HomePage;
import org.example.LoginPage;
import org.testng.annotations.Test;

public class TestLoginPage extends TestBase {
    HomePage home;
    LoginPage Login;

   /* @Test
    public void TestLogin(){
        home = new HomePage(driver);
        home .openLoginPage();
        login =new LoginPage(driver);
        login.UserLogin("mona99@gmail.com","123456");
    }*/
   @Test(priority = 0)//(dependsOnMethods ={" UserRegistrationPage"})
   public void UserCanLogin () throws InterruptedException {
       home = new HomePage(driver);
       home.openLoginPage();
       Login = new LoginPage(driver);
       Login.UserLogin("mona@gmail.com", "123456");
       home.scrollTo();
       Login.LoginButton1();
   }
   @Test (priority = 1)
           public void checkLoginBtn () throws InterruptedException {
       Login.LoginButton1();
       Thread.sleep(3000);
   }




   }
