package tests;

import facade.CustomerFacade;
import org.testng.annotations.Test;
import sharedData.SharedData;
import testdata.TestData;

public class CustomerFacadeTest extends SharedData {

    String elementValue = TestData.get("elementValue");
    String depositValue = TestData.get("depositValue");
    String withdrawValue = TestData.get("withdrawValue");

    @Test
    public void testMethod(){
        CustomerFacade customerFacade = new CustomerFacade(getDriver());
        customerFacade.customer_Login_Depozit_Withdrawl(elementValue,depositValue,withdrawValue);
    }
}
