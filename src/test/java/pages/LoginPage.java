package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
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
