package Class68_TestNGRunnerFile;

public class tets {

    static void main(String[] args) {
        B b = new B();
        b.sub(10,20);
        b.sum(10,20);
    }

}

class A{

    public void sum(int a, int b){
        System.out.println(a+b);
    }

}

class B extends A{

    public void sub(int a, int b){
        System.out.println(a-b);
    }

}