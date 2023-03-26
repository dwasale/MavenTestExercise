package org.dwas;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();

    @Test
    public void toClickOnLoginLinkButtonOnTheWebsite(){
        homePage.clickOnLoginLinkButton();
    }
}
