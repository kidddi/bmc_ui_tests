package com.bmc.tests;

import com.bmc.fw.ContactData;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class AddContactTests extends MyTestBase{

    @Test (dataProvider = "randomContact", dataProviderClass = ContactGenerator.class)
    public void testAddNewContact(ContactData cont) throws Exception {

        app.getNavHelper()
                .openMainPage();
        List<WebElement> oldList = app.getContactsHelper().getListContacts();

        app.getContactsHelper()
                .initAddingContact()
                .fillContactForm(cont)
                .submitForm()
                .returnToMainPage();
        List<WebElement> newList = app.getContactsHelper().getListContacts();

        assertThat(oldList.size(), equalTo(newList.size() - 1));

    }
}
