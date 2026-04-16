package Class67_TestNGClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;
// String browser = "Chrome";

    @Parameters("browser")
    @BeforeTest
    public void setUp(String browser) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }


        System.out.println("0Opening the Website");
    }


    @AfterTest
    public void cleanUp() {
        System.out.println("9Closing the Website");
    }

}
