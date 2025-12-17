package org.example.clase7;

import org.example.BaseTest;
import org.example.pages.HomePage;
import org.example.pages.ResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultsTest extends BaseTest {

    @Test
    public void ResultsPageTest(){
        HomePage homePage = new HomePage(getDriver());
        ResultsPage resultsPage= new ResultsPage(getDriver());

        // 1. Abrimos la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2. Realizamos la busqueda
        homePage.search("iphone");

        // 3. Verificamos el esperado
        Assert.assertEquals(resultsPage.getTitle(), "Search - iphone", "Los titulos no coinciden");
    }
}
