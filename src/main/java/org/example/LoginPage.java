package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By email = By.id("Email");
    WebElement emailEle = driver.findElement(email);

    By password = By.id("Password");
    WebElement passwordEle = driver.findElement(password);


    public void UserLogin (String emaill,String passwordd) {
        sendKeysElementTxt(emailEle, emaill);

        sendKeysElementTxt(passwordEle, passwordd);
    }
    public void LoginButton1(){

        WebElement loginBtn1 = driver.findElement(By.linkText("Log in"));

        clickButton(loginBtn1);

    }
}
