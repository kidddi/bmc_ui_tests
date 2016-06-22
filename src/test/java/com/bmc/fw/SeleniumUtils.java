package com.bmc.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Александр on 21.06.2016.
 */
public class SeleniumUtils {
    private WebDriver driver;

    public SeleniumUtils(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }
    public void start(){
        driver.get(Constans.baseURL);
    }

    public void stop(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
