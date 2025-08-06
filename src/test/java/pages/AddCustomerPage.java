package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends BasePage{

    public AddCustomerPage(WebDriver driver){
        super(driver);
    }


    @FindBy (xpath = "//input[@ng-model='fName']")
    private WebElement firstNameElement;
    @FindBy (xpath = "//input[@ng-model='lName']")
    private WebElement lastNameElement;
    @FindBy (xpath = "//input[@ng-model='postCd']")
    private WebElement postalCodeElement;
    @FindBy (xpath = "//button[text()='Add Customer']")
    private WebElement addCustomerButton;

    public void fillFirstNameMethod(String firstNameValue){
        elementHelper.waitForVisibility(firstNameElement);
        elementHelper.clickMethod(firstNameElement);
        LoggerUtility.infoLog("The user clicks on firstname ");
        elementHelper.fillMethod(firstNameElement,firstNameValue);
        LoggerUtility.infoLog("The user fills first name");
    }

    public void fillLastNameMethod(String lastNameValue){
        elementHelper.waitForVisibility(lastNameElement);
        elementHelper.clickMethod(lastNameElement);
        LoggerUtility.infoLog("The user clicks on last name  ");
        elementHelper.fillMethod(lastNameElement,lastNameValue);
        LoggerUtility.infoLog("The user fills last name");
    }

    public void fillPostalCodeMethod(String postalCodeValue){
        elementHelper.waitForVisibility(postalCodeElement);
        elementHelper.clickMethod(postalCodeElement);
        LoggerUtility.infoLog("The user clicks on postal code ");
        elementHelper.fillMethod(postalCodeElement,postalCodeValue);
        LoggerUtility.infoLog("The user fills postal code");
    }

    public void createNewCustomerMethod(String firstNameValue,String lastNameValue,String postalCodeValue){
        fillFirstNameMethod(firstNameValue);
        fillLastNameMethod(lastNameValue);
        fillPostalCodeMethod(postalCodeValue);
        elementHelper.clickMethod(addCustomerButton);
        LoggerUtility.infoLog("The user clicks on: add customer button");
        alertHelper.dealWithAlertOk();
        LoggerUtility.infoLog("The user deals with the alert by clicking ok");
    }


}
