package org.dwas;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Utils extends BasePage{

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public void sendUserInputData(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public void selectListByVisibleText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public String getRelatedText(By by){
        return driver.findElement(by).getText();
    }
}
