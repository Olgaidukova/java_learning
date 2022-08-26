package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper  extends HelperBase{
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactForm() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.firstname());
        type(By.name("lastname"),contactData.lastname());
        type(By.name("address"),contactData.address());
        type(By.name("email"),contactData.email());
        type(By.name("home"),contactData.phone());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
      wd.get("http://localhost:8080/addressbook/edit.php");
    }
}
