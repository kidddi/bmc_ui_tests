package com.bmc.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
    protected final ApplicationManager app;
    protected final WebDriver driver;


    public BaseHelper(ApplicationManager app) {
        this.app = app;
        driver = app.getSeleniumUtils().getDriver();
    }
    protected void clickAndWait(String locator) throws InterruptedException {
        driver.findElement(By.xpath(locator)).click();
        //System.out.println(locator + "Locator is clicked");
        Thread.sleep(1000);
    }
    protected void type(String locator, String value){
        if (value != null){
            driver.findElement(By.xpath(locator)).sendKeys(value);
        }
    }

}
