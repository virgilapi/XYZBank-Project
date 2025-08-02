package tests;

import org.testng.annotations.Test;
import pages.*;
import sharedData.SharedData;

public class ResetAccountTest extends SharedData {

    String userName = "Hermoine Granger";
    String depositValue = "2300";
    String withdrawValue = "1300";

    @Test
    public void testMethod() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithCustomerMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginMethod(userName);

        CustomerPage customerPage = new CustomerPage(getDriver());
        customerPage.interactWithDepositMenu();

        DepositPage depositPage = new DepositPage(getDriver());
        depositPage.depositMethod(depositValue);

        customerPage.interactWithWithdrawlMenu();

        WithdrawlPage withdrawlPage = new WithdrawlPage(getDriver());
        withdrawlPage.withdrawMethod(withdrawValue);

        customerPage.interactWithTransactionsMenu();

        TranzactionsPage tranzactionsPage = new TranzactionsPage(getDriver());
        tranzactionsPage.resetAccountMethod();
    }
}
