class BaseClass {

    private void display1() {
        System.out.println("Base class display1");
    }

    static void display2() {
        System.out.println("Base class display2");
    }

    public void display3() {
        System.out.println("Base class display3");
    }
}

class DerivedClass extends BaseClass {

    private void display1() {
        System.out.println("Derived class display1");
    }

    static void display2() {
        System.out.println("Derived class display2");
    }

    public void display3() {
        System.out.println("Derived class display3");
    }
}

public class OverridingExample1 {

    public static void main(String[] args) {
        BaseClass object = new DerivedClass();
        // object.display1() Not recognized
        // object.display2() Not recognized
        object.display3();
    }
}
