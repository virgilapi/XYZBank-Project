package pages;

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
        elementHelper.fillMethod(searchBarElement,searchValue);
        elementHelper.clickMethod(deleteButton);
    }
}
