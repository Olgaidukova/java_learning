package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
   private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
      this.wd = wd;
    }

    public void goToHomePage() {
      wd.findElement(By.linkText("home page")).click();
      wd.get("http://localhost:8080/addressbook/index.php");
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
