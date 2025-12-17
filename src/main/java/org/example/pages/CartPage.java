package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/*
public class CartPage extends BasePage{
    private By productRow = By.xpath("//table[@class='table table-bordered']//tr[td/a[text()='Canon EOS 5D']]");
    private By quantityInput = By.xpath(".//td[@class='text-center']/input[@type='text']");
    private By priceTd = By.xpath(".//td[@class='text-right']");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInCart(String nombre, String cantidad, String precio){
        By productRow = By.xpath("//table[@class='table table-bordered']//tr[td/a[text()='" + nombre + "']]");
        WebElement row = driver.findElement(productRow);

        String actualCantidad = row.findElement(By.xpath(".//td[@class='text-center']/input")).getAttribute("value");
        String actualPrecio = row.findElement(By.xpath(".//td[@class='text-right']")).getText();

        return actualCantidad.equals(cantidad) && actualPrecio.equals(precio);
    }
}*/
public class CartPage extends BasePage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // XPath dinámico: busca la fila según el nombre del producto
    private By productRow(String nombre) {
        return By.xpath("//table[@class='table table-bordered']//tr[td/a[text()='" + nombre + "']]");
    }

    // Dentro de una fila, la cantidad y el precio
    private By quantityInput = By.xpath(".//input[contains(@name,'quantity')]");
    private By priceTd = By.xpath(".//td[@class='text-right']");


    public boolean isProductInCart(String nombre, String cantidad, String precio) {
        WebElement row = driver.findElement(productRow(nombre));

        String actualCantidad = row.findElement(quantityInput).getAttribute("value");
        String actualPrecio = row.findElement(priceTd).getText();

        return actualCantidad.equals(cantidad) && actualPrecio.equals(precio);
    }
}

