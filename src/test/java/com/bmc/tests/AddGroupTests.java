package com.bmc.tests;

import com.bmc.fw.GroupData;
import org.testng.annotations.Test;


public class AddGroupTests extends MyTestBase{

    @Test
    public void testAddNewGroup() throws InterruptedException {
        GroupData group = new GroupData("rferf", "erfer", "ferf");
        app.getGroupsHelper().createGroup(group);
    }

    @Test
    public void testAddNewEmptyGroup() throws InterruptedException {
        GroupData group = new GroupData("", "", "");
        app.getNavHelper()
            .gotoGroupsPage()
            .initGroupCreation()
            .fillGroupForm(group)
            .submitGroupForm()
            .returnToGroupsPage();
        //verification
    }
}
