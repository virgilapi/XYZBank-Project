package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isLoaded()  {

        try {
            elementHelper.waitForVisibility(userDropDown);
            ExpectedConditions.stalenessOf(userDropDown);
            Assert.assertTrue(userDropDown.isDisplayed(),"The dropdown is not displayed");

            if (userDropDown.isSelected()){
                elementHelper.waitForVisibility(loginButton);
                ExpectedConditions.stalenessOf(loginButton);
                Assert.assertTrue(loginButton.isDisplayed(),"The login button is not displayed");
            }

        } catch (TimeoutException e) {
            throw new AssertionError("The login page is not loaded");
        }


    }

    @FindBy(id = "userSelect")
    private WebElement userDropDown;
    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    public void loginMethod(String elementValue){
        elementHelper.waitForVisibility(userDropDown);
        elementHelper.selectDropDownMethod(userDropDown,elementValue);
        LoggerUtility.infoLog("The user clicks on user: "+elementValue);
        elementHelper.clickMethod(loginButton);
        LoggerUtility.infoLog("The user clicks on the Login Button");
    }
}
