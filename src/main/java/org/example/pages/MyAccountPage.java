package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends BasePage {

    private By title = By.xpath("//h2[text()='My Account']");
    private By myAccountDropdown = By.xpath("//a[@title='My Account']"); // dropdown
    private By loginLink = By.xpath("//a[text()='Login']"); // link Login en dropdown
    private By logoutBtn = By.xpath("//a[text()='Logout']"); // link Logout en dropdown

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    // Validar título de My Account
    public boolean titleIsDisplayed() {
        return isDisplayed(title);
    }

    // Click en My Account > Login
    public void clickMyAccountDropdown() {
        click(myAccountDropdown);
    }

    public void clickLogin() {
        click(loginLink);
    }

    // Click en My Account > Logout
    public LogoutPage clickLogoutButton() {
        click(myAccountDropdown);
        click(logoutBtn);
        return new LogoutPage(driver);
    }
}
