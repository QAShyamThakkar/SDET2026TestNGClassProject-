package Class67to71_TestNGClass1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class zzAssertion {

    @Test
    public void method1() {
        System.out.println("1_Test");
    }

    @Test
    public void method2() {
        System.out.println("2_Test ");

//        Assert.assertEquals(1, 2, "Try Again Arsalan");

         Assert.assertTrue(2==3, "Try Again");

    }

    @Test
    public void method3() {
        System.out.println("3_Test");
    }
}
