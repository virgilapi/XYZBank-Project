package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ManagerPage;
import pages.OpenAccountPage;
import sharedData.SharedData;

public class CreateCustomerTest extends SharedData {

    String userValue = "Harry Potter";
    String currencyValue = "Pound";

    @Test
    public void testMethod(){

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithManagerMenu();

        ManagerPage managerPage = new ManagerPage(getDriver());
        managerPage.interactWithOpenAccountMenu();

        OpenAccountPage openAccountPage = new OpenAccountPage(getDriver());
        openAccountPage.creatNewCustomerMethod(userValue,currencyValue);
    }
}
