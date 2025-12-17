package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {
    private By textLogout= By.xpath("//div[@class='col-sm-9']//p[contains(text(),'You have been logged off your account.')]");

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public boolean logOutTextIsDisplayed() {
        return isDisplayed(textLogout);
    }
}
