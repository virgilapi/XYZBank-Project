package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".ng-scope .home")
    private WebElement homeButton;
    @FindBy(xpath = "//button[text()='Customer Login']")
    private WebElement customerLoginButton;
    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    private WebElement managerLoginButton;

    public void interactWithHomeMenu(){
        elementHelper.waitForVisibility(homeButton);
        elementHelper.clickMethod(homeButton);
        LoggerUtility.infoLog("The user clicked on Home Button");
    }

    public void interactWithCustomerMenu(){
        elementHelper.waitForVisibility(customerLoginButton);
        elementHelper.clickMethod(customerLoginButton);
        LoggerUtility.infoLog("The user clicked on Customer Button");
    }

    public void interactWithManagerMenu(){
        elementHelper.waitForVisibility(managerLoginButton);
        elementHelper.clickMethod(managerLoginButton);
        LoggerUtility.infoLog("The user clicked on Manager Button");
    }
}
