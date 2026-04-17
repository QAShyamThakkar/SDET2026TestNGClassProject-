package Class67_TestNGClass1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class zParralelTestingEg extends BaseTest {

    @Test
    public void method1() {
        System.out.println("1_Test ");
        driver.get("https://www.ebay.co.uk/");
    }

    @Test
    public void method2() {
        System.out.println("2_Test");
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void method3() {
        System.out.println("3_Test");
        driver.get("https://www.youtube.com/");
    }

}
