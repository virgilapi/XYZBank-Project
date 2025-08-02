package pages;

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
        elementHelper.fillMethod(depositBar,depositValue);
        elementHelper.waitForVisibility(depositButton);
        elementHelper.clickMethod(depositButton);
    }
}
