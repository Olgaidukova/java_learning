package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTest extends TestBase{
    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoContactPage();
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Test", null, null, null, null));
        }
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectContact(before-1);
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().gotoContactPage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }
}
