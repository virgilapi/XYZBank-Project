package tests;

import org.testng.annotations.Test;
import pages.*;
import sharedData.SharedData;
import testdata.TestData;

public class ResetAccountTest extends SharedData {

    String elementValue = TestData.get("elementValue");
    String depositValue = TestData.get("depositValue");
    String withdrawValue = TestData.get("withdrawValue");

    @Test
    public void testMethod() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithCustomerMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginMethod(elementValue);

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
