package helperMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver;

    public AlertHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForAlert(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.alertIsPresent());
    }

    public void dealWithAlertOk(){
        waitForAlert();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}
