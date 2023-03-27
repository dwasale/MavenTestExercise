package org.dwas;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterPageConfirmation registerPageConfirmation = new RegisterPageConfirmation();

    @Test
    public void toClickOnLoginLinkButtonOnTheWebsite(){
        homePage.clickOnLoginLinkButton();
    }

    @Test
    public void toRegisterANewMember(){
        //Goto register page
        registerPage.clickOnRegisterLinkButton();
        //Fill the required form
        registerPage.inputUserDataOnRequiredField();
        //Click on register button
        registerPage.clickOnRegisterButton();
        registerPageConfirmation.toCheckTheConfirmationForRegisteringNewUser();
    }
}
