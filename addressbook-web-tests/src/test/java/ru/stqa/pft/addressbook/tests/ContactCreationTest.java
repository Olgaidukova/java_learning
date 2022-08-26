package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Test", "Testov", "SPB", "test@test.com", "123456"));
    app.getContactHelper().submitContactForm();
    app.getNavigationHelper().goToHomePage();
  }

}
