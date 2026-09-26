class Vehicle {
    void start() {
        System.out.println("Vehicle has started");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }

    void brand() {
        System.out.println("Brand: Kia");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        // Upcasting: Car object referenced by Vehicle type
        Vehicle v = new Car();
        v.start(); // Calls Car's overridden start()

        // Downcasting: explicitly cast Vehicle reference back to Car
        Car c = (Car) v;
        c.start();  // Still Car's start()
        c.brand();  // Now accessible because reference is Car
    }
}
