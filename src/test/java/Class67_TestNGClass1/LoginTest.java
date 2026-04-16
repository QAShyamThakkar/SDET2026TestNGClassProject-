package Class67_TestNGClass1;

import org.testng.annotations.*;

public class LoginTest extends BaseTest{


    @Test (groups = "smoke", priority = 1, dependsOnMethods = "verifyLogInUnsuccessful")
    public void verifyLogInSuccessful() {
        System.out.println("1_Test - Verify Log in is Successful");
    }

    @Test (priority = 2)
    public void verifyLogInUnsuccessful() {
        System.out.println("2_Test - Verify Log in is Unsuccessful");
    }

    @Test (priority = 3)
    public void verifyLogInWithBlankCred() {
        System.out.println("3_Test - Verify Log in is Unsuccessful with Blank Cred");
    }

}
