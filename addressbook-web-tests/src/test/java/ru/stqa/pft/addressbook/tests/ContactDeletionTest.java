package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{
    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().initContactDeletion();
        app.getNavigationHelper().gotoContactPage();
    }
}
