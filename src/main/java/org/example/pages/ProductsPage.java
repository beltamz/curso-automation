package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    private By camerasBtn = By.xpath("//ul[@class='nav navbar-nav']//a[text()='Cameras']");
    private By canonCameraBtn = By.xpath("//div[@class='caption']//a[text()='Canon EOS 5D']");
    private By colourSelect = By.id("input-option226");
    private By quantityInput = By.id("input-quantity");
    private By addToCartBtn = By.id("button-cart");
    private By cartBtn = By.id("cart");
    private By viewCartBtn = By.xpath("//p[@class='text-right']/a[contains(.,'View Cart')]");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickCamerasBtn() {
        click(camerasBtn);
    }

    public void clickCanonCameraBtn() {
        click(canonCameraBtn);
    }

    public void selectColour(String colour) {
        selectByVisibleText(colourSelect, colour);
    }

    public void setQuantity(String qty) {
        clear(quantityInput);
        sendKeys(quantityInput, qty);
    }

    public void  clickAddToCartBtn() {
        click(addToCartBtn);
    }

    public CartPage clickViewCartBtn() {
        click(cartBtn);
        clickOnLyPresence(viewCartBtn); // espera a que el link esté presente y hace click
        return new CartPage(driver);
    }

}
