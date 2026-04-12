package Class67_TestNGClass1;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeTest
    public void setUp(){
        System.out.println("0Opening the Website");
    }


    @AfterTest
    public void cleanUp(){
        System.out.println("9Closing the Website");
    }

}
