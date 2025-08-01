package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LoginPage;
import sharedData.SharedData;

public class LoginTest extends SharedData {

    String userName = "Hermoine Granger";

    @Test
    public void testMethod(){
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithCustomerMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginMethod(userName);
    }
}
