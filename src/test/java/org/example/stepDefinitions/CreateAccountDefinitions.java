package org.example.stepDefinitions;
import org.example.hooks.Hooks;
import org.example.pages.CreateAccountPage;
import org.example.pages.CreatedAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

public class CreateAccountDefinitions {

    private CreateAccountPage createAccountPage;
    private CreatedAccountPage createdAccountPage;

    public CreateAccountDefinitions() {
        this.createAccountPage = new CreateAccountPage(Hooks.getDriver());
        this.createdAccountPage = new CreatedAccountPage(Hooks.getDriver());
    }

    @Cuando("el usuario crea la cuenta")
    public void elUsuarioCreaLaCuenta() {
        String emailRandom = String.format("%s@gmail.com", RandomStringUtils.randomAlphabetic(5));

        createAccountPage.register("Jhone",
                "Doe",
                emailRandom,
                "123456789",
                "abc123");
    }

    @Entonces("se verifica que la cuenta se creo correctamente")
    public void seVerificaQueLaCuentaSeCreoCorrectamente() {
        Assert.assertTrue(createdAccountPage.isSuccessfullyTextVisible(),
                "El texto de 'Cuenta creada' no esta visible");
    }
}
