package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WithdrawlPage extends BasePage{

    public WithdrawlPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='number']")
    private WebElement withdrawlBar;
    @FindBy(xpath = "//button[text()='Withdraw']")
    private WebElement withdrawButton;

    public void withdrawMethod(String withdrawValue){
        elementHelper.waitForVisibility(withdrawlBar);
        elementHelper.clickMethod(withdrawlBar);
        elementHelper.waitForVisibility(withdrawButton);
        elementHelper.clickMethod(withdrawButton);
    }
}
