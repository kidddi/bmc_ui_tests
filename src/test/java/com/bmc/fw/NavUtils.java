package com.bmc.fw;

import org.openqa.selenium.WebDriver;

/**
 * Created by Александр on 21.06.2016.
 */
public class NavUtils {
    private final WebDriver driver;
    private final ApplicationManager app;


    public NavUtils(ApplicationManager app) {
        this.app = app;
        driver = app.getSeleniumUtils().getDriver();
    }

    public void gotoGroupsPage() {
        clickandwait("link=groups");
    }

    public void openMainPage() {
        driver.get(Constans.baseURL);
        //driver.navigate().to(Constans.baseURL);
    }
}
