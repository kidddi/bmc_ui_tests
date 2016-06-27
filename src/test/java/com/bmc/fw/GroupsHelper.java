package com.bmc.fw;


import org.openqa.selenium.By;

import java.util.HashSet;
import java.util.Set;

public class GroupsHelper extends BaseHelper{

    public GroupsHelper (ApplicationManager app){
        super(app);
    }

    public void createGroup(GroupData group) throws InterruptedException {

        app.getNavHelper().gotoGroupsPage();
        initGroupCreation();
        fillGroupForm(group);
        submitGroupForm();
        returnToGroupsPage();
    }

    public GroupsHelper initGroupCreation() throws InterruptedException {
        clickAndWait("//input[contains(@name, 'new')]");
        return this;
    }

    public GroupsHelper fillGroupForm(GroupData group) {
        type("//input[contains(@name, 'group_name')]", group.getName());
        type("//textarea[contains(@name, 'group_header')]", group.getHeader());
        type("//textarea[contains(@name, 'group_footer')]", group.getFooter());
        return this;
    }

    public GroupsHelper submitGroupForm() throws InterruptedException {
        clickAndWait("//input[contains(@name, 'submit')]");
        return this;
    }

    public void returnToGroupsPage() throws InterruptedException {
        clickAndWait("//div[@id='nav']//a[text()='groups']");
    }
    public Set<GroupData> getGroupsSet() throws InterruptedException {
        app.getNavHelper().gotoGroupsPage();
        Set<GroupData> groups = new HashSet<GroupData>();
        Thread.sleep(1000);
        int count = driver.findElements(By.xpath("//input[@name='selected[]']")).size();
        for (int i = 0; i < count; i++){
            String id = driver.findElement(By.xpath("//input[@name='selected[]']["+(i+1)+"]")).getAttribute("value");
            String title = driver.findElement(By.xpath("//input[@name='selected[]']["+(i+1)+"]")).getAttribute("title");
            int start = title.indexOf("(");
            int end = title.indexOf(")");
            String name = title.substring(start+1, end);

            GroupData group = new GroupData(id, name, null, null);
            groups.add(group);
        }
        return groups;
    }
    public Groups getGroups() throws InterruptedException {
        return new Groups(getGroupsSet());
    }
}
