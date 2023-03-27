package org.dwas;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPageConfirmation extends Utils{

    private By _registerSuccessMessage = By.className("result");

    public void toCheckTheConfirmationForRegisteringNewUser(){
        String message = getRelatedText(_registerSuccessMessage);
        Assert.assertEquals(message,"Your registration completed" , "Actual and expected message didn't match");
        System.out.println(message);
    }
}
