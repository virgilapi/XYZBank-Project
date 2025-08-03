package pages;

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
        elementHelper.waitForVisibility(currencyElement);
        elementHelper.selectDropDownMethod(currencyElement,currencyValue);
        elementHelper.clickMethod(submitElement);
        alertHelper.dealWithAlertOk();
    }
}
