package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage extends BasePage{


    public DepositPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//input[@type='number']")
    private WebElement depositBar;
    @FindBy (xpath = "//button[text()='Deposit']")
    private WebElement depositButton;

    public void depositMethod(String depositValue){
        elementHelper.waitForVisibility(depositBar);
        elementHelper.clickMethod(depositBar);
        LoggerUtility.infoLog("The user clicks on the deposit bar");
        elementHelper.fillMethod(depositBar,depositValue);
        LoggerUtility.infoLog("The user types and deposits "+depositValue+" in the account");
        elementHelper.waitForVisibility(depositButton);
        elementHelper.clickMethod(depositButton);
        LoggerUtility.infoLog("The user clicks on the deposite button");
    }
}
