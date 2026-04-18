package Class67to71_TestNGClass1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class zzDataDrivenTesting {

    @Test(dataProvider = "ValidAmount")
    //Bank Account - Minor - 1 to 100  --->> 1, 44 ,100
    public void validateAmount1(Object a) {
        System.out.println("Amount Validated with "+ a);
    }

    @DataProvider(name = "ValidAmount")
    public Object[] getData() {
        Object data[] = {1, 44, 100};
        return data;
    }

}
