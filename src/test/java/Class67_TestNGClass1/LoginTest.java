package Class67_TestNGClass1;

import org.testng.annotations.*;

public class LoginTest extends BaseTest{


    @Test
    public void verifyLogInSuccessful() {
        System.out.println("1_Test - Verify Log in is Successful");
    }

    @Test
    public void verifyLogInUnsuccessful() {
        System.out.println("2_Test - Verify Log in is Unsuccessful");
    }

    @Test
    public void verifyLogInwithBlankCred() {
        System.out.println("3_Test - Verify Log in is Unsuccessful with Blank Cred");
    }

}
