package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ResultsPage {
    private By titleSearch = By.xpath("//h1[text()=\"Search - iphone\"]");
    private WebDriver driver;
    private WebDriverWait wait;

    public ResultsPage(WebDriver driver) {
        this.driver= driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Esperamos que el elemento indicado aparezca en pantalla
    private WebElement waitForVisible(By locator) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    public String getTitle(){
        return waitForVisible(titleSearch).getText();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
