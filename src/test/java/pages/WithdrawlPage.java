package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class WithdrawlPage extends BasePage{

    public WithdrawlPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isLoaded(){

        try {
            elementHelper.waitForVisibility(withdrawBar);
            ExpectedConditions.stalenessOf(withdrawBar);
            Assert.assertTrue(withdrawBar.isDisplayed(),"The withdrawBar is not displayed");

            elementHelper.waitForVisibility(withdrawButton);
            ExpectedConditions.stalenessOf(withdrawButton);
            Assert.assertTrue(withdrawButton.isDisplayed(),"The withdraw button is not displayed");
        }catch (TimeoutException e){
            throw new AssertionError("The withdraw page is not displayed correctly");
        }
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
