package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LoginPage;
import sharedData.SharedData;
import testdata.TestData;

public class LoginTest extends SharedData {

    String userName = TestData.get("elementValue");

    @Test
    public void testMethod(){
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithCustomerMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginMethod(userName);
    }
}
