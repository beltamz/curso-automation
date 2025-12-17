package org.example.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.example.hooks.Hooks;
import org.example.pages.CartPage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddProductToCartDefinitions {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private CartPage cartPage;
    private ProductsPage productsPage;

    public AddProductToCartDefinitions() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a su cuenta")
    public void usuarioIniciaSesion() {
        WebDriver driver = Hooks.getDriver();
        driver.get(Hooks.getProperty("url"));

        // Abro My Account y hago click en Login
        myAccountPage.clickMyAccountDropdown();
        myAccountPage.clickLogin();

        // Hago el login
        String username = Hooks.getProperty("username");
        String password = Hooks.getProperty("password");
        loginPage.login(username, password);

        // Valido que la sesión se inicio correctamente
        Assert.assertTrue(myAccountPage.titleIsDisplayed(), "El usuario no pudo iniciar sesión correctamente");
    }

    @Cuando("el usuario agrega un producto al carrito")
    public void usuarioAgregaProductoAlCarrito() {
        productsPage = new ProductsPage(Hooks.getDriver());

        // 1. Click en el boton "Cameras"
        productsPage.clickCamerasBtn();

        // 2. Selecciono la cámara Canon
        productsPage.clickCanonCameraBtn();

        // 3. Selecciono el color del producto (Red)
        productsPage.selectColour("Red");

        // 4. Indico la cantidad a comprar (3)
        productsPage.setQuantity("3");

        // 5. Agrego al carrito
        productsPage.clickAddToCartBtn();

        // 6. Abrir mini carrito y click en "View Cart"
        CartPage cartPage = productsPage.clickViewCartBtn();

        // 7. Guardar cartPage para usar en el Then (si usás variable de clase)
        this.cartPage = cartPage;
    }

    @Entonces("se verifica que el producto aparezca en el carrito")
    public void seVerificaQueElProductoAparezcaEnElCarrito() {
        // Aquí va el código para validar el carrito
        Assert.assertTrue(cartPage.isProductInCart("Canon EOS 5D", "3", "$80.00"), "El producto no coincide con lo esperado");
    }
}
