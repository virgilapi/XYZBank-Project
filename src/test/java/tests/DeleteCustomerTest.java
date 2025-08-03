package tests;

import org.testng.annotations.Test;
import pages.CustomersManagementPage;
import pages.IndexPage;
import pages.ManagerPage;
import sharedData.SharedData;

public class DeleteCustomerTest extends SharedData {

    String searchValue = "Harry";

    @Test
    public void testMethod(){

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithManagerMenu();

        ManagerPage managerPage = new ManagerPage(getDriver());
        managerPage.interactWithCustomerMenu();

        CustomersManagementPage customersManagementPage = new CustomersManagementPage(getDriver());
        customersManagementPage.searchDeleteCustomerMethod(searchValue);
    }
}
