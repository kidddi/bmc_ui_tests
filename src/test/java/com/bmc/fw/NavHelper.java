package com.bmc.fw;


public class NavHelper extends BaseHelper{



    public NavHelper(ApplicationManager app) {
        super(app);
    }

    public GroupsHelper gotoGroupsPage() throws InterruptedException {
        if (! "/group.php".equals(driver.getCurrentUrl())) {
            clickAndWait("link=groups");
        }
        return app.getGroupsHelper();
    }

    public NavHelper openMainPage() throws InterruptedException {
        clickAndWait("link=home");
        //driver.navigate().to(Constans.baseURL);
        return this;
    }
}
