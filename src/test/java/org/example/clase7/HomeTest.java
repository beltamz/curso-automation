package org.example.clase7;
import org.example.BaseTest;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {
    @Test
    public void homeElementsTest(){

        HomePage homePage = new HomePage(getDriver());
        getDriver().get("https://opencart.abstracta.us");


        //Validamos los elementos de la Home
        Assert.assertTrue(homePage.searchIsDisplayed());
        Assert.assertTrue(homePage.carrouselIsDisplayed());
        Assert.assertTrue(homePage.navbarIsDisplayed());
        Assert.assertTrue(homePage.myAccountDropdownIsDisplayed());
    }

}
