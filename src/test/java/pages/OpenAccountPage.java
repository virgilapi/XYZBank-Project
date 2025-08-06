package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends BasePage{

    public OpenAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "userSelect")
    private WebElement selectUserElement;
    @FindBy (id = "currency")
    private WebElement currencyElement;
    @FindBy (css = "button[type='submit']")
    private WebElement submitElement;

    public void creatNewCustomerMethod(String userValue,String currencyValue){
        elementHelper.waitForVisibility(selectUserElement);
        elementHelper.selectDropDownMethod(selectUserElement,userValue);
        LoggerUtility.infoLog("The user selects" +userValue+ "from the dropdown");
        elementHelper.waitForVisibility(currencyElement);
        elementHelper.selectDropDownMethod(currencyElement,currencyValue);
        LoggerUtility.infoLog("The user selects the following currency: "+currencyValue);
        elementHelper.clickMethod(submitElement);
        LoggerUtility.infoLog("The user clicks on the submit element");
        alertHelper.dealWithAlertOk();
        LoggerUtility.infoLog("The user deals with the alert by clicking ok");
    }
}
