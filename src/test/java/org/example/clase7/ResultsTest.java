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

        // 1. Abrir la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2. Realizar la busqueda
        homePage.search("iphone");

        // 3. Verificar el esperado (assertion)
        Assert.assertEquals(resultsPage.getTitle(), "Search - iphone", "Los titulos no coinciden");
    }
}
