package com.bmc.fw;

public class ApplicationManager {
    private SeleniumUtils seleniumUtils;
    private GroupsHelper groupHelper;
    private NavHelper navUtils;

    public static ApplicationManager getInstanse() {
        return new ApplicationManager();
    }

    public void init(){
        seleniumUtils = new SeleniumUtils();
        seleniumUtils.start();
    }

    public SeleniumUtils getSeleniumUtils(){
        if (seleniumUtils == null){
            seleniumUtils = new SeleniumUtils();
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
