package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AUserRegisterationPage extends PageBase {

    public AUserRegisterationPage(WebDriver driver) {
        super(driver);
    }

    WebElement GenderType = driver.findElement(By.id("gender-female"));
    WebElement FnameTxt = driver.findElement(By.id("FirstName"));
    WebElement LnameTxt = driver.findElement(By.id("LastName"));
    WebElement emailTxt = driver.findElement(By.id("Email"));
    /*WebElement checkNewsletter = driver.findElement(By.id("Newsletter"));
    if(checkNewsletter.isSelected()){
        checkNewsletter.click();*/
    WebElement passwordTxt = driver.findElement(By.id("Password"));

    WebElement confirmPasswordTxt = driver.findElement(By.id("ConfirmPassword"));
    WebElement registerButton =driver.findElement(By.id("register-button"));
   public WebElement registerDone = driver.findElement(By.cssSelector("div.result"));
    public void userRegister(String firstName,String lastName,String email,String password ){
       clickButton(GenderType);
      sendKeysElementTxt(FnameTxt,firstName);
      sendKeysElementTxt(LnameTxt,lastName);
      sendKeysElementTxt(emailTxt,email);
      sendKeysElementTxt(passwordTxt,password);
      sendKeysElementTxt(confirmPasswordTxt,password);
       clickButton(registerButton);
    }

    public void birthDate() {
        Select Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        Select Year = new Select(driver.findElement(By.name("DateOfBirthYear")));
    }



}