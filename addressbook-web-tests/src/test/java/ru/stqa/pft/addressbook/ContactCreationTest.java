package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("Test", "Testov", "SPB", "test@test.com", "123456"));
    submitContactForm();
    goToHomePage();
  }

}
