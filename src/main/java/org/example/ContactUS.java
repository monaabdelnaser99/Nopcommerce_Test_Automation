package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUS extends PageBase{
    public ContactUS(WebDriver driver) {
        super(driver);
    }


    public void contactInformation (String name ,String email,String Enquiry){
        WebElement nameTxtBox=driver.findElement(By.id("FullName"));
        sendKeysElementTxt(nameTxtBox,name);
        WebElement emailTxtBox=driver.findElement(By.id("Email"));
        sendKeysElementTxt(emailTxtBox,email);
        WebElement EnquiryTxtBox =driver.findElement(By.id("Enquiry"));
        sendKeysElementTxt(EnquiryTxtBox,Enquiry);}

    public void clickOnSubmit() {
        WebElement submitTxtBox = driver.findElement(By.name("send-email"));
        clickButton(submitTxtBox);
    }
   By success = By.cssSelector("div.result");
    public void suceesss(){
        WebElement successMessage =driver.findElement(success);

    }

    }

