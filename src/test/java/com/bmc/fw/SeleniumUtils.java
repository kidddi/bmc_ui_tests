package com.bmc.fw;

import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumUtils {
    private WebDriver driver;

    public SeleniumUtils(){
        InternetExplorerDriverManager.getInstance().setup();
        driver = new InternetExplorerDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }
    public void start() throws InterruptedException {
        driver.get(Constans.baseURL);
        Thread.sleep(2000);
    }

    public void stop(){
        if (driver != null) {
            //driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
