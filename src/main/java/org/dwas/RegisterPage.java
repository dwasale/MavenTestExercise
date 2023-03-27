package org.dwas;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{

    private By _register = By.className("ico-register");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dobInDay = By.name("DateOfBirthDay");
    private By _dobInMonth = By.name("DateOfBirthMonth");
    private By _dobInYear = By.name("DateOfBirthYear");
    private By _emailAddress = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");

    private By _registerButton = By.id("register-button");

    private By _confirmationPassword = By.xpath("//span[@class='']");


    public void clickOnRegisterLinkButton(){
        clickOnElement(_register);
    }
    public void inputUserDataOnRequiredField(){
        sendUserInputData(_firstName,"Diwas");
        sendUserInputData(_lastName,"Ale");
        selectListByVisibleText(_dobInDay,"1");
        selectListByVisibleText(_dobInMonth,"August");
        selectListByVisibleText(_dobInYear,"1990");
        sendUserInputData(_emailAddress,"abc1@gmail.com");
        String password = "abc123";
        sendUserInputData(_password, password);
        String confirmPassword = "abc123";
        sendUserInputData(_confirmPassword, confirmPassword);
//        String message = getRelatedText(_confirmationPassword);
//        System.out.println(message);
        //Assert.assertEquals(message,message,"Your password didn't match");

    }

    public void clickOnRegisterButton(){
        clickOnElement(_registerButton);
    }
}
