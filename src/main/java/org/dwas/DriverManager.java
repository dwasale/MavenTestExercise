package org.dwas;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager extends BasePage{

    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","src/test/java/Drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void closeBrowser(){
        driver.quit();
    }
}
