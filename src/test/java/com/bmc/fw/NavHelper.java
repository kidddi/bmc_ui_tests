package com.bmc.fw;


public class NavHelper extends BaseHelper{



    public NavHelper(ApplicationManager app) {
        super(app);
    }

    public GroupsHelper gotoGroupsPage() throws InterruptedException {
        if (! "/group.php".equals(driver.getCurrentUrl())) {
            clickAndWait("//div[@id='nav']//a[text()='groups']");
        }
        return app.getGroupsHelper();
    }

    public NavHelper openMainPage() throws InterruptedException {
        clickAndWait("//div[@id='nav']//a[text()='home']");
        //driver.navigate().to(Constans.baseURL);
        return this;
    }
}
