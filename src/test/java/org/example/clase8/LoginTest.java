package org.example.clase8;

import org.example.BaseTest;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrectoTest() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        // 1. Abrimos la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2. Ingresamos al login
        homePage.goToLogin();

        // 3. Nos logueamos
        loginPage.login("prueba123@prueba.com", "prueba");

        // 4. Validamos
        Assert.assertTrue(myAccountPage.titleIsDisplayed(), "El titulo no es visible");
    }

    @Test
    public void loginIncorrectoTest() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        // 1. Abrimos la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2. Ingresamos al login
        homePage.goToLogin();

        // 4. Nos logueamos
        loginPage.login("prueba123@prueba.com", "56465");

        // 5. Validamos
        Assert.assertTrue(loginPage.errorMessageIsDisplayed(), "Mensaje de error no visible");
    }
}
