package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactModificationTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws IOException {
        app.goTo().contactPage();
        if (app.db().contacts().size() == 0) {
            app.contact().create(new ContactData().withFirstname("Test"));
        }
    }
    @Test
    public void testContactModification() throws IOException {
        Contacts before = app.db().contacts();
        ContactData modifiedContact = before.iterator().next();
        ContactData contact = new ContactData()
                .withId(modifiedContact.getId()).withFirstname("Test1").withLastname("Testov1")
                .withAddress("SPB1").withEmail("test1@test.com").withPhone("1234561");
        app.goTo().contactPage();
        app.contact().modify(contact);
        app.goTo().homePage();
        assertThat(app.contact().count(), equalTo(before.size()));
        Contacts after = app.db().contacts();
        assertThat(after, CoreMatchers.equalTo(before.without(modifiedContact).withAdded(contact)));
    }
}
