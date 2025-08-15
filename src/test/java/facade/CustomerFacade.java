package facade;

import org.openqa.selenium.WebDriver;
import pages.*;

public class CustomerFacade {

    private WebDriver driver;
    private IndexPage indexPage;
    private LoginPage loginPage;
    private CustomerPage customerPage;
    private DepositPage depositPage;
    private WithdrawlPage withdrawlPage;

    public CustomerFacade(WebDriver driver){
        this.driver = driver;
        indexPage = new IndexPage(driver);
        loginPage = new LoginPage(driver);
        customerPage = new CustomerPage(driver);
        depositPage = new DepositPage(driver);
        withdrawlPage = new WithdrawlPage(driver);
    }

    public void customer_Login_Depozit_Withdrawl(String elementValue,String depositValue,String withdrawValue){
        indexPage.interactWithCustomerMenu();
        loginPage.loginMethod(elementValue);
        customerPage.interactWithDepositMenu();
        depositPage.depositMethod(depositValue);
        customerPage.interactWithWithdrawlMenu();
        withdrawlPage.withdrawMethod(withdrawValue);
    }
}
