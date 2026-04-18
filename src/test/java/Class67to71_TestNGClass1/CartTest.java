package Class67to71_TestNGClass1;

import org.testng.annotations.Test;

public class CartTest extends BaseTest{

    @Test
    public void verifyUserCanRemoveProduct() {
        System.out.println("6_Test -  verifyUserCanRemoveProduct");
    }

    @Test (groups = "smoke")
    public void verifyUserCanClickONCheckOut() {
        System.out.println("7_Test - verifyUserCanClickONCheckOut");
    }

    @Test
    public void verifyUserCanClickONContinueShopping() {
        System.out.println("8_Test - verifyUserCanClickONContinueShopping");
    }

}
