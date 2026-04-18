package Class67to71_TestNGClass1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
    public void softAssertion() {

        //1.  Hard Assertion
        //System.out.println("Statement 1");
//        Assert.assertEquals(1,2);
//        System.out.println("Statement 2");

        //2.  Soft Assertion
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Statement 1");
        softAssert.assertEquals(1, 2);
        System.out.println("Statement 2");

        softAssert.assertAll();

    }


}
