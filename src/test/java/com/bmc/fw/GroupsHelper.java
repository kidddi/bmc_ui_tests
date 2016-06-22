package com.bmc.fw;


public class GroupsHelper extends BaseHelper{

    public GroupsHelper (ApplicationManager app){
        super(app);
    }

    public void createGroup(GroupData group) throws InterruptedException {
        app.getNavHelper().openMainPage();
        app.getNavHelper().gotoGroupsPage();
        initGroupCreation();
        fillGroupForm(group);
        submitGroupForm();
        returnToGroupsPage();
    }

    public GroupsHelper initGroupCreation() throws InterruptedException {
        clickAndWait("new");
        return this;
    }

    public GroupsHelper fillGroupForm(GroupData group) {
        type("group_name", group.name);
        type("group_header", group.header);
        type("group_footer", group.footer);
        return this;
    }

    public GroupsHelper submitGroupForm() throws InterruptedException {
        clickAndWait("submit");
        return this;
    }

    public void returnToGroupsPage() throws InterruptedException {
        clickAndWait("link=group page");
    }
}
