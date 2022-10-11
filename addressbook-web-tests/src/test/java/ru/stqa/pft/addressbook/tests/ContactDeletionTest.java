package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactDeletionTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws IOException {
        app.goTo().contactPage();
        if (app.db().contacts().size() == 0) {
            app.contact().create(new ContactData().withFirstname("Test"));
        }
    }
    @Test
    public void testContactDeletion(){
        Contacts before = app.db().contacts();
        int index = before.size() - 1;
        app.goTo().contactPage();
        ContactData deletedContact = before.iterator().next();
        app.contact().delete(deletedContact);
        app.goTo().contactPage();
        assertThat(app.contact().count(), equalTo(before.size() -1));
        Contacts after = app.db().contacts();
        assertThat(after, equalTo(before.without(deletedContact)));
    }

}
