package tests;

import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.DepositPage;
import pages.IndexPage;
import pages.LoginPage;
import sharedData.SharedData;

public class CustomerDepositTest extends SharedData {

    String depositValue = "2300";
    String userName = "Hermoine Granger";

    @Test
    public void testMethod(){
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithCustomerMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginMethod(userName);

        CustomerPage customerPage = new CustomerPage(getDriver());
        customerPage.interactWithDepositMenu();

        DepositPage depositPage = new DepositPage(getDriver());
        depositPage.depositMethod(depositValue);
    }
}
