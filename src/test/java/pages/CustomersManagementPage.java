package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersManagementPage extends BasePage{

    public CustomersManagementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//button[text()='Delete']")
    private WebElement deleteButton;
    @FindBy (xpath = "//input[@ng-model='searchCustomer']")
    private WebElement searchBarElement;

    public void searchDeleteCustomerMethod(String searchValue){
        elementHelper.waitForVisibility(searchBarElement);
        elementHelper.clickMethod(searchBarElement);
        LoggerUtility.infoLog("The user clicks on the search bar");
        elementHelper.fillMethod(searchBarElement,searchValue);
        LoggerUtility.infoLog("The user types on the search bar to search for a customer");
        elementHelper.clickMethod(deleteButton);
        LoggerUtility.infoLog("The user deletes an existing customer");
    }
}
