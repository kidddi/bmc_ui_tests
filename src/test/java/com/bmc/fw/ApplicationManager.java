package com.bmc.fw;

import org.openqa.selenium.WebDriver;

/**
 * Created by Александр on 21.06.2016.
 */
public class ApplicationManager {
    private SeleniumUtils seleniumUtils;
    private WebDriver driver;
    private NavUtils navUtils;


    public SeleniumUtils getSeleniumUtils(){
        if (seleniumUtils == null){
            seleniumUtils = new SeleniumUtils();
            driver = seleniumUtils.getDriver();
        }
        return seleniumUtils;
    }
    public void dismiss(){
        if (seleniumUtils != null){
        seleniumUtils.stop();
        }
    }
    public NavUtils getNavUtils(){
        if (navUtils == null){
            navUtils = new NavUtils(this);
        }
        return navUtils;
    }
    public void createGroups(){
        getNavUtils().openMainPage();
        getNavUtils().gotoGroupsPage();
    }
}
