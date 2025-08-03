package tests;

import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.IndexPage;
import pages.ManagerPage;
import sharedData.SharedData;

public class AddCustomerTest extends SharedData {

    String firstNameValue = "Virgil";
    String lastNameValue = "Costea";
    String postalCodeValue = "610234";

    @Test
    public void testMethod(){
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactWithManagerMenu();

        ManagerPage managerPage = new ManagerPage(getDriver());
        managerPage.interactWithAddCustomerMenu();

        AddCustomerPage addCustomerPage = new AddCustomerPage(getDriver());
        addCustomerPage.createNewCustomerMethod(firstNameValue,lastNameValue,postalCodeValue);
    }
}
