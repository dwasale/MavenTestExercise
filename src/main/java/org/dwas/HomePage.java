package org.dwas;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    private By _login = By.className("ico-login");


    public void clickOnLoginLinkButton(){
        clickOnElement(_login);
    }
}
