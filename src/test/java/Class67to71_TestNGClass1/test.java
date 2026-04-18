package Class67to71_TestNGClass1;

public class test {

    public static Object[] getData() {
        Object a[] = {"Shyam", 2, 3};
        return a;
    }

    static void main(String[] args) {
        Object b[] = getData(); //memory location of array
        for (int i = 0; i < b.length ; i++) {
            System.out.println(b[i]);
        }
    }
}
