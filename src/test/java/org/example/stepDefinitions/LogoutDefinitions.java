package org.example.stepDefinitions;
import io.cucumber.java.es.Dado;
import org.example.hooks.Hooks;
import org.example.pages.LoginPage;
import org.example.pages.LogoutPage;
import org.example.pages.MyAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutDefinitions {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private LogoutPage logoutPage;

    public LogoutDefinitions() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Dado("que el usuario ya tiene una sesion iniciada")
    public void usuarioConSesionIniciada() {
        WebDriver driver = Hooks.getDriver();
        driver.get(Hooks.getProperty("url")); // Home

        // Abrir el dropdown My Account y hacer click en Login
        myAccountPage.clickMyAccountDropdown();
        myAccountPage.clickLogin();

        // Hacer login
        String username = Hooks.getProperty("username");
        String password = Hooks.getProperty("password");
        loginPage.login(username, password);

        // Validar que la sesión se inició correctamente
        Assert.assertTrue(myAccountPage.titleIsDisplayed(), "El usuario no pudo iniciar sesión correctamente");
    }

    @Cuando("el usuario se intenta desloguear")
    public void elUsuarioSeDesloguea() {
       logoutPage = myAccountPage.clickLogoutButton();
    }

    @Entonces("se verifica que el usuario se desloguee correctamente")
    public void seVerificaQueElUsuarioSeDeslogueeCorrectamente() {
        LogoutPage logoutPage = new LogoutPage(Hooks.getDriver());
        Assert.assertTrue(logoutPage.logOutTextIsDisplayed(), "El texto de deslogueo no es visible");
    }
}
