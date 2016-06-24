package com.bmc.fw;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumUtils {
    private WebDriver driver;

    public SeleniumUtils(){
        OperaDriverManager.getInstance().setup();

        driver = new OperaDriver();
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
