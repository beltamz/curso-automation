package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // XPath que busca la fila segun el nombre del producto
    private By productRow(String nombre) {
        return By.xpath("//table[@class='table table-bordered']//tr[td/a[text()='" + nombre + "']]");
    }

    // Busca dentro de una fila, la cantidad y el precio
    private By quantityInput = By.xpath(".//input[contains(@name,'quantity')]");
    private By priceTd = By.xpath(".//td[@class='text-right']");

    public boolean isProductInCart(String nombre, String cantidad, String precio) {
        WebElement row = driver.findElement(productRow(nombre));

        //Dentro de la fila, que busque la cantidad y el precio actual
        String actualCantidad = row.findElement(quantityInput).getAttribute("value");
        String actualPrecio = row.findElement(priceTd).getText();

        //Comparo la cantidad y precio con los valores esperados
        return actualCantidad.equals(cantidad) && actualPrecio.equals(precio);
    }
}

