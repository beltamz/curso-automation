package org.example.stepDefinitions;
import org.example.hooks.Hooks;
import org.example.pages.CreateAccountPage;
import org.example.pages.CreatedAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

public class CreateAccountInvalidDefinitions {

    private CreateAccountPage createAccountPage;

    public CreateAccountInvalidDefinitions() {
        this.createAccountPage = new CreateAccountPage(Hooks.getDriver());
    }

    @Cuando("envia el formulario de registro dejando algunos campos vacios")
    public void enviaFormularioConCampoNombreVacio() {

        String emailRandom = String.format("%s@gmail.com", RandomStringUtils.randomAlphabetic(5));

        createAccountPage.register("",
                "Doe",
                emailRandom,
                "123456789",
                "2343");
    }

    @Entonces("se muestra un mensaje de error al crear la cuenta")
    public void seMuestraErrorAlCrearLaCuenta() {
        Assert.assertTrue(createAccountPage.isFirstNameErrorDisplayed(), "No se mostro el error que falta completar First Name");
    }
}
