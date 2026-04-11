package Class67_TestNGClass1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setUp(){
        System.out.println("0Before");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("9After");
    }

}
