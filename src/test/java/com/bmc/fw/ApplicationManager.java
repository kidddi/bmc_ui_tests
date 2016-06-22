package com.bmc.fw;

import org.openqa.selenium.WebDriver;

/**
 * Created by Александр on 21.06.2016.
 */
public class ApplicationManager {
    private SeleniumUtils seleniumUtils;
    private WebDriver driver;
    private GroupsHelper groupHelper;
    private NavHelper navUtils;
    private static ApplicationManager app;

    public static ApplicationManager getInstanse() {
        app = new ApplicationManager();
        return app;
    }
    public void init(){
        seleniumUtils = new SeleniumUtils();
        seleniumUtils.start();
    }

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
    public NavHelper getNavHelper(){
        if (navUtils == null){
            navUtils = new NavHelper(this);
        }
        return navUtils;
    }
    public GroupsHelper getGroupsHelper(){
        if (groupHelper == null){
            groupHelper = new GroupsHelper(this);
        }
        return groupHelper;
    }
}
