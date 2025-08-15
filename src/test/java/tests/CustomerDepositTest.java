package tests;

import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.DepositPage;
import pages.IndexPage;
import pages.LoginPage;
import sharedData.SharedData;
import testdata.TestData;

public class CustomerDepositTest extends SharedData {

    String elementValue = TestData.get("elementValue");
    String depositValue = TestData.get("depositValue");

    @Test
    public void testMethod(){
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithCustomerMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginMethod(elementValue);

        CustomerPage customerPage = new CustomerPage(getDriver());
        customerPage.interactWithDepositMenu();

        DepositPage depositPage = new DepositPage(getDriver());
        depositPage.depositMethod(depositValue);
    }
}
