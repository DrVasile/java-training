class Car {
    void run() {
        System.out.println("Super class car");
    }
}

class Audi extends Car {
    void run() {
        System.out.println("Sub class Audi");
    }
}

public class OverridingExample {

    public static void main(String[] args) {
        Car newCar = new Audi();
        newCar.run();
    }
}