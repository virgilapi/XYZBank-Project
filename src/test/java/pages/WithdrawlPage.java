package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WithdrawlPage extends BasePage{

    public WithdrawlPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@ng-model='amount']")
    private WebElement withdrawBar;
    @FindBy(xpath = "//button[text()='Withdraw']")
    private WebElement withdrawButton;

    public void withdrawMethod(String withdrawValue){
        elementHelper.waitForVisibility(withdrawBar);
        elementHelper.javaScriptClickMehod(withdrawBar);
        LoggerUtility.infoLog("The user clicks on the Withdraw Bar");
        elementHelper.fillMethod(withdrawBar,withdrawValue);
        LoggerUtility.infoLog("The user enters:"+withdrawValue+" into the WithDrawl Bar");
        elementHelper.waitForVisibility(withdrawButton);
        elementHelper.javaScriptClickMehod(withdrawButton);
        LoggerUtility.infoLog("The user clicks on the withdraw button");
    }
}
