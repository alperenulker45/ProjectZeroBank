package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Locale;

public class ParentClass {

    public void clickFunction(WebElement element) {

        waitUntilClickable(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {

        waitUntilVisible(element);
        element.sendKeys(value);
    }

    public void clickFunctionWithJs(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void waitUntilClickable (WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible (WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void verifyContainsTxt (WebElement element, String value) {
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase(Locale.ROOT)));
    }





}
