package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TranzactionsPage extends BasePage {

    public TranzactionsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Reset']")
    private WebElement resetButton;

    public void resetAccountMethod(){
        elementHelper.waitForVisibility(resetButton);
        elementHelper.clickMethod(resetButton);
        LoggerUtility.infoLog("The user clicks on the reset button");
    }
}
