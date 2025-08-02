package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends BasePage{


    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//button[@ng-class='btnClass1']")
    private WebElement tranzactionsButton;
    @FindBy ( xpath = "//button[@ng-class='btnClass2']")
    private WebElement depositButton;
    @FindBy ( xpath = "//button[@ng-class='btnClass3']" )
    private WebElement withdrawlButton;

    public void interactWithTransactionsMenu(){
        elementHelper.waitForVisibility(tranzactionsButton);
        elementHelper.clickMethod(tranzactionsButton);
    }

    public void interactWithDepositMenu(){
        elementHelper.waitForVisibility(depositButton);
        elementHelper.clickMethod(depositButton);
    }

    public void interactWithWithdrawlMenu(){
        elementHelper.waitForVisibility(withdrawlButton);
        elementHelper.clickMethod(withdrawlButton);
    }


}
