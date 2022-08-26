package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToHomePage() {
        click(By.linkText("home page"));
      wd.get("http://localhost:8080/addressbook/index.php");
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }
}
