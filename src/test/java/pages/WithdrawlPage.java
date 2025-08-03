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
    private WebElement withdrawlBar;
    @FindBy(xpath = "//button[text()='Withdraw']")
    private WebElement withdrawButton;

    public void withdrawMethod(String withdrawValue){
        elementHelper.waitForVisibility(withdrawlBar);
        elementHelper.clickMethod(withdrawlBar);
        LoggerUtility.infoLog("The user clicks on the Withdrawl Bar");
        elementHelper.fillMethod(withdrawlBar,withdrawValue);
        LoggerUtility.infoLog("The user enters:"+withdrawValue+" into the WithDrawl Bar");
        elementHelper.waitForVisibility(withdrawButton);
        elementHelper.clickMethod(withdrawButton);
    }
}
