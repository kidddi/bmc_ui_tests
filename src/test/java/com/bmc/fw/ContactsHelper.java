package com.bmc.fw;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ContactsHelper extends BaseHelper {
    private final Wait<WebDriver> wait = new WebDriverWait(driver, 20);

    public ContactsHelper(ApplicationManager app) {
        super(app);
    }

    public ContactsHelper initAddingContact() throws InterruptedException {
        clickAndWait("//div[@id='nav']//a[text()='add new']");
        return this;
    }

    public ContactsHelper fillContactForm(ContactData cont) {
        wait.until(ExpectedConditions
                .visibilityOfAllElementsLocatedBy(By.xpath("//input[contains(@name, 'firstname')]")));
        type("//input[contains(@name, 'firstname')]", cont.getFirstname());
        type("//input[contains(@name, 'lastname')]", cont.getLastname());
        type("//textarea[contains(@name, 'address')]", cont.getAdress());
        type("//input[contains(@name, 'home')]", cont.getHome());
        type("//input[contains(@name, 'mobile')]", cont.getMobile());
        type("//input[contains(@name, 'work')]", cont.getWork());
        type("//input[contains(@name, 'email')]", cont.getEmail1());
        type("//input[contains(@name, 'email2')]", cont.getEmail2());
        return this;
    }

    public ContactsHelper submitForm() throws InterruptedException {
        clickAndWait("//input[contains(@name, 'submit')]");
        return this;
    }
    public void returnToMainPage() throws InterruptedException {
        clickAndWait("//div[@id='nav']//a[text()='home']");
    }

    public List<WebElement> getListContacts() {
        return driver.findElements(By.xpath("//table[@id='maintable']//tr[contains(@name,'entry')]"));
        }

    }

