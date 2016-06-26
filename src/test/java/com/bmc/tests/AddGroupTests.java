package com.bmc.tests;

import com.bmc.fw.GroupData;
import com.bmc.fw.Groups;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class AddGroupTests extends MyTestBase{

    @Test (dataProvider = "randomGroup", dataProviderClass = GroupGenerator.class)
    public void testAddNewGroup(GroupData group) throws InterruptedException {
        Groups oldGroups = app.getGroupsHelper().getGroups();

        app.getGroupsHelper().createGroup(group);
        Groups newGroups = app.getGroupsHelper().getGroups();

        //oldGroups.withAdded(group).groupPrinter();
        //System.out.println(newGroups.toString());
        assertThat(newGroups, equalTo(oldGroups.withAdded(group)));
        //assertTrue();



    }

    @Test
    public void testAddNewEmptyGroup() throws InterruptedException {
        GroupData group = new GroupData(null, "", "", "");
        app.getNavHelper()
            .gotoGroupsPage()
            .initGroupCreation()
            .fillGroupForm(group)
            .submitGroupForm()
            .returnToGroupsPage();
        //verification
    }
}
