package helperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {

    private WebDriver driver;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForVisibility(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickMethod(WebElement element){
        waitForVisibility(element);
        element.click();
    }

    public void javaScriptClickMehod(WebElement element){
        waitForVisibility(element);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();",element);
    }

    public void fillMethod(WebElement element,String elementValue){
        element.sendKeys(elementValue);
    }

    public void selectDropDownMethod(WebElement element,String elementValue){
        Select dropDown = new Select(element);
        dropDown.selectByContainsVisibleText(elementValue);
    }


}
