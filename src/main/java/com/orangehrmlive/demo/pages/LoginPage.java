package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName = By.name("username");
    By passwordField = By.name("password");
    By singIn = By.xpath("//button[@type ='submit']");
    By welcomeText = By.xpath("//h6[normalize-space()='Dashboard']");
    By clickOnForgot = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    By resetText = By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']");
    public void enterUserName(String email){
        sendTextToElement(userName,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnSignIn(){
        clickOnElement(singIn);
    }
    public String verifyText(){
        return getTextFromElement(welcomeText);
    }
    public void clickOnForgot(){
        clickOnElement(clickOnForgot);
    }
    public String verifyResetText(){
        return getTextFromElement(resetText);
    }
}
