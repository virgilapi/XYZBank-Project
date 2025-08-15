package tests;

import facade.CustomerFacade;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class CustomerFacadeTest extends SharedData {

    String elementValue = "Hermoine Granger";
    String depositValue = "200";
    String withdrawValue = "100";

    @Test
    public void testMethod(){
        CustomerFacade customerFacade = new CustomerFacade(getDriver());
        customerFacade.customer_Login_Depozit_Withdrawl(elementValue,depositValue,withdrawValue);
    }
}
