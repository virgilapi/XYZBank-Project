package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage extends BasePage{

    public ManagerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    private WebElement addCustomerButton;
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    private WebElement openAccountButton;
    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    private WebElement customersButton;

    public void interactWithAddCustomerMenu(){
        elementHelper.waitForVisibility(addCustomerButton);
        elementHelper.clickMethod(addCustomerButton);
    }

    public void interactWithOpenAccountMenu(){
        elementHelper.waitForVisibility(openAccountButton);
        elementHelper.clickMethod(openAccountButton);
    }

    public void interactWithCustomerMenu(){
        elementHelper.waitForVisibility(customersButton);
        elementHelper.clickMethod(customersButton);
    }

}
