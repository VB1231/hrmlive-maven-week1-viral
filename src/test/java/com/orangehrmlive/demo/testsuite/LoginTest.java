package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnSignIn();
        Assert.assertEquals(loginPage.verifyText(),"Dashboard","not verify");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPage.clickOnForgot();
      Assert.assertEquals(loginPage.verifyResetText(),"Reset Password","not verify");
    }
}
