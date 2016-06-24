package com.bmc.fw;


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
        type("//input[contains(@name, 'group_name')]", group.name);
        type("//textarea[contains(@name, 'group_header')]", group.header);
        type("//textarea[contains(@name, 'group_footer')]", group.footer);
        return this;
    }

    public GroupsHelper submitGroupForm() throws InterruptedException {
        clickAndWait("//input[contains(@name, 'submit')]");
        return this;
    }

    public void returnToGroupsPage() throws InterruptedException {
        clickAndWait("//div[@id='nav']//a[text()='groups']");
    }
}
